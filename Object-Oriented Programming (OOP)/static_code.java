class Student {
    String name;
    static String School;

    public static void changeSchool() 
    {
        School = "CPSCR";
    }
}

public class static_code 
{
    public static void main(String[] args) 
    {
        Student.School = "DIU";
        Student student1 = new Student();
        student1.name = "Shuvo";
        System.out.println(student1.name + " " + student1.School);
    }
}
