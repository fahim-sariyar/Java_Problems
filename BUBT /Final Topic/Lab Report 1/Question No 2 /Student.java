class Student {
    String name;
    int id;
    int marks;
    String getGrade() {
        if (marks >= 80)
            return "A";
        else if (marks >= 60)
            return "B";
        else if (marks >= 40)
            return "C";
        else
            return "F";}
}
public class NumberCheck {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Rahim";
        s.id = 123;
        s.marks = 75;
        System.out.println("Name: " + s.name);
        System.out.println("ID: " + s.id);
        System.out.println("Marks: " + s.marks);
        System.out.println("Grade: " + s.getGrade()); } }
