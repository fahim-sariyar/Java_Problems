// Abstract Class
abstract class Course {
    protected String courseCode;
    protected double credit;
    // Constructor
    public Course(String courseCode, double credit) {
        this.courseCode = courseCode;
        this.credit = credit;
    }
    // Abstract Method
    abstract double calculateFinalMarks();
    // Concrete Method
    public void displayCourseInfo() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Credit: " + credit);
    }
}
// Interface 1
interface TheoryEvaluation {
    double theoryMarks();
}
// Interface 2
interface LabEvaluation {
    double labMarks();
}
// HybridCourse Class
class HybridCourse extends Course implements TheoryEvaluation, LabEvaluation {
    double theory;
    double lab;
    public HybridCourse(String courseCode, double credit, double theory, double lab) {
        super(courseCode, credit);
        this.theory = theory;
        this.lab = lab;
    }
    // Implement interface methods
    public double theoryMarks() {
        return theory;
    }
    public double labMarks() {
        return lab;
    }
    // Override abstract method
    @Override
    double calculateFinalMarks() {
        return theoryMarks() + labMarks();
    }
}
// Service Class
class CourseService {
    public void printFinalResult(Course c) {
        c.displayCourseInfo();
        double finalMarks = c.calculateFinalMarks();
        System.out.println("Final Marks: " + finalMarks);
    }
}
// Main Class
public class Main {
    public static void main(String[] args) {
        // Upcasting
        Course c = new HybridCourse("CSE101", 3.0, 70, 25);
        CourseService service = new CourseService();
        service.printFinalResult(c);
    }
}

