public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Fahim");
        Student s2 = new Student(102, "Fouji");

        s1.displayInfo();
        s2.displayInfo();
        
        // Using getters and setters
        s1.setName("Fahim ");
        System.out.println("\nAfter updating name:");
        s1.displayInfo();
    }
}

class Student {
    private int id;
    private String name;
    
    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    // Getters and Setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // Method to display student information
    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
