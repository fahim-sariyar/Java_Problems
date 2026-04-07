class Parent {
    void checkMarks(int marks) throws Exception {
        System.out.println("Checking marks: " + marks);
    }
}

class Child extends Parent {
    @Override
    void checkMarks(int marks) {
        System.out.println("Checking marks: " + marks);
        try {
            if (marks > 100) {
                throw new Exception("Marks cannot be greater than 100.");
            } else if (marks < 0) {
                throw new Exception("Marks cannot be negative.");
            } else {
                System.out.println("Result is valid.");
            }
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();

        obj.checkMarks(85);
        System.out.println();

        obj.checkMarks(120);
        System.out.println();

        obj.checkMarks(-10);
    }
}
