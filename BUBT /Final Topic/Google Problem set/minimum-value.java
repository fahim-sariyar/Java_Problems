import java.util.*;

public class MinOperationValue {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        ArrayList<Integer> results = new ArrayList<>();

        // Addition
        results.add(a + b);

        // Subtraction
        results.add(a - b);

        // Multiplication
        results.add(a * b);

        // Division with Exception Handling
        try {
            int div = a / b;   // may cause ArithmeticException
            results.add(div);
        } 
        catch (ArithmeticException e) {
            System.out.println("Division not possible (b = 0). Skipping division...");
        }

        // Find minimum value
        int minValue = Collections.min(results);

        System.out.println("Available operation results: " + results);
        System.out.println("Minimum value = " + minValue);
    }
}
