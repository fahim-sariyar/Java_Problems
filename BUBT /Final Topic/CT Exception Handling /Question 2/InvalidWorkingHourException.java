class InvalidWorkingHourException extends Exception {
    InvalidWorkingHourException(String msg) {
        super(msg);
    }
}

class Employee {
    public double calculateSalary(int hours) throws InvalidWorkingHourException {

        if (hours < 0) {
            throw new InvalidWorkingHourException("Working hours cannot be negative.");
        }

        if (hours > 10) {
            throw new InvalidWorkingHourException("Working hours cannot exceed 10.");
        }

        return hours * 500.0; 
    }
}

public class SalaryTest {

    public static void main(String[] args) {

        Employee emp = new Employee();

        int[] testHours = {8, -3, 30};

        for (int h : testHours) {
            System.out.println("Working hours: " + h);

            try {
                double salary = emp.calculateSalary(h);
                System.out.println("Salary: " + salary);

            } 
                catch (InvalidWorkingHourException e) 
            {
                System.out.println("Exception caught: " + e.getMessage());
            }

            System.out.println();
        }
    }
}
