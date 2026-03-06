
import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {

        Scanner sc =new Scanner(System.in);
        
        Course c1 =new Course();

        // University input
        System.out.print("Enter University Name: ");
        c1.universityName = sc.nextLine();

        // Department input
        System.out.print("Enter Department Name: ");
        c1.departmentName = sc.nextLine();

        // Course input
        System.out.print("Enter Course Title: ");
        c1.courseTitle = sc.nextLine();

        System.out.print("Enter Course Code: ");
        c1.courseCode = sc.nextLine();

        System.out.println("\n--- Course Information ---");
        c1.displayCourse();

        sc.close();
    }
}


// Base class
class University 
{
    String universityName;

    void displayUniversity() 
    {
        System.out.println("University Name:" + universityName);
    }
}


class Department extends University 
{
    String departmentName;

    void displayDepartment()
    {
        displayUniversity(); 
        System.out.println("Department Name:"+ departmentName);
    }
}

class Course extends Department 
{
    String courseTitle;
    
    String courseCode;

    void displayCourse() 
    {
        displayDepartment();
        System.out.println("Course Title:"+ courseTitle);
        System.out.println("Course Code:"+ courseCode);
    }
}
