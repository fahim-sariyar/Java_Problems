import java.util.Scanner;

public class ArithmeticExceptionTryCatch {

    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in
        );
        try 
          {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;   // May cause ArithmeticException
            System.out.println("Result = " + result);

        } 
        catch (ArithmeticException e) 
          
        {
            System.out.println("Error: Cannot divide by zero!");
        }

        System.out.println("Program continues normally...");
        sc.close();
    }
}
