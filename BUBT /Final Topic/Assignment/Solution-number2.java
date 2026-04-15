class Employee<T, U, V> {
    T id;   U designation;     V salary;
    Employee(T id, U designation, V salary) {
        this.id = id;     this.designation = designation;          this.salary = salary;
    }
    public void display() {             // Method 
        System.out.println("Employee ID: " + id);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}
public class Main {
    public static void main(String[] args) {
        // Create object using generic class
Employee<Integer, String, Double> emp = new Employee<>(101, "Software Engineer", 55000.50);
        emp.display();
    }  }
