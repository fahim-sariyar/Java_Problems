public class NumberCheck {
    public static void main(String[] args) {
        Employee e;
        e = new Manager();
        System.out.println("Manager Salary: " +e.calculateSalary());
        e = new Developer();
        System.out.println("Developer Salary: "+ e.calculateSalary());
}
}
class Employee {
    double salary = 40000; // or int salary=40000; 
    double calculateSalary(){
        return salary;
}
}
class Manager extends Employee{
    double bonus = 20000;  // or int bonus = 20000;
    double calculateSalary(){
        return salary + bonus;
}
}
class Developer extends Employee{
    double overtime = 5000;  // or int overtime = 5000;
    double calculateSalary() {
        return salary + overtime;
}
}
