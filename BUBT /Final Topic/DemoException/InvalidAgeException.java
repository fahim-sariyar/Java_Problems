class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Person {
    void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
        System.out.println("Valid age in parent class.");
    }
}

class Student extends Person {
    @Override
    void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Student is under age.");
        }
        System.out.println("Valid age in child class.");
    }
}

class DemoException2 {
    static void verify(Person p, int age) throws InvalidAgeException {
        p.checkAge(age);   // exception propagated
    }

    public static void main(String[] args) {
        Person p = new Student();

        try {
            verify(p, 16);
        } catch (InvalidAgeException e) {
            System.out.println("Handled in main: " + e.getMessage());
        }
    }
}
