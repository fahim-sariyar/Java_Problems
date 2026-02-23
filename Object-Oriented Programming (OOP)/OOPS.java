class Pen {
    String color;
    String type;// ballpoint || gel

    // method of this class
    public void write() {
        System.out.println("Writing Something");
    }

    public void penColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student("Shuvo", 21);

        Student s2 = new Student(s1);

        s2.printInfo();
    }
}
