// Doctor Class
class Doctor {
    int doctorId;
    String doctorName;
    String specialization;

    // Constructor
    public Doctor(int doctorId, String doctorName, String specialization) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.specialization = specialization;
    }

    // Method to display doctor info
    public void displayDoctorInfo() {
        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Specialization: " + specialization);
    }
}

// Patient Class
class Patient {
    int patientId;
    String patientName;
    Doctor assignedDoctor;  // Association

    // Constructor
    public Patient(int patientId, String patientName) {
        this.patientId = patientId;
        this.patientName = patientName;
    }

    // Assign Doctor Method
    public void assignDoctor(Doctor d) {
        this.assignedDoctor = d;
    }
    // Return Doctor Object
    public Doctor generateDoctorInfo() {
        return assignedDoctor;
    }



    // Display Patient Info
    public void displayPatientInfo() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
    }
}
// Hospital Class
class Hospital {
    public void admitPatient(Patient p) {
        System.out.println("=== Patient Details ===");
        p.displayPatientInfo();
        System.out.println("=== Assigned Doctor Details ===");
        Doctor d = p.generateDoctorInfo();
        if (d != null) {
            d.displayDoctorInfo();
        } else {
            System.out.println("No Doctor Assigned.");
        }
    }
}
// Main Class
public class Main {
    public static void main(String[] args) {

        // Create Doctor Object
        Doctor doc1 = new Doctor(101, "Dr. Rahman", "Cardiologist");

        // Create Patient Object
        Patient pat1 = new Patient(201, "Karim");

        // Assign Doctor to Patient
        pat1.assignDoctor(doc1);

        // Create Hospital Object
        Hospital hospital = new Hospital();
        // Admit Patient
        hospital.admitPatient(pat1);
    }
}

