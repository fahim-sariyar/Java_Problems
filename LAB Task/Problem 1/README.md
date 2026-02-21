### Hospital Management System (Java OOP)

## 📖 Project Description
This project demonstrates Association relationship in Java using 
Doctor and Patient classes.

A Hospital Management System maintains information about Doctor and Patient.
A Patient is associated with a Doctor.

---

## 🏗️ Class Structure

### 1️⃣ Doctor Class
Attributes:
- doctorId (int)
- doctorName (String)
- specialization (String)

### 2️⃣ Patient Class
Attributes:
- patientId (int)
- patientName (String)
- assignedDoctor (Doctor)

Methods:
- assignDoctor(Doctor d)
- generateDoctorInfo()

### 3️⃣ Hospital Class
Method:
- admitPatient(Patient p)

---

## 🔗 OOP Concept Used
- Association Relationship
- Object Passing as Parameter
- Returning Object from Method

---

## ▶️ How to Run
1. Compile the program:
   javac Main.java

2. Run the program:
   java Main

---

## 📌 Example Output
Patient ID: 101
Patient Name: Fahim Sariyar
#
Doctor ID: 1
Doctor Name: Dr. Karim
Specialization: Cardiology
