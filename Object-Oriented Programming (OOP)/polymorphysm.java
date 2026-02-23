//compile time polymorphysm or function overloding
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class polymorphysm {
    public static void main(String[] args) {
        Student s1 = new Student("Shuvo", 21);
        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name + " " + s1.age);
    }
}
