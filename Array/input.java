import java.util.Scanner;

public class Input {
    public static void main(String[] args) 
  {

        int marks[] = new int[6];
        Scanner sc = new Scanner(System.in);

        // User Input
        System.out.print("Enter Math marks: ");
        marks[0] = sc.nextInt();

        System.out.print("Enter Physics marks: ");
        marks[1] = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        marks[2] = sc.nextInt();

        System.out.print("Enter English marks: ");
        marks[3] = sc.nextInt();

        System.out.print("Enter Biology marks: ");
        marks[4] = sc.nextInt();

        System.out.print("Enter ICT marks: ");
        marks[5] = sc.nextInt();

        // Output
        System.out.println("\n--- Student Marks ---");
        System.out.println("Math      : " + marks[0]);
        System.out.println("Physics   : " + marks[1]);
        System.out.println("Chemistry : " + marks[2]);
        System.out.println("English   : " + marks[3]);
        System.out.println("Biology   : " + marks[4]);
        System.out.println("ICT       : " + marks[5]);

        // Update example
        marks[0] = 100;
        System.out.println("\nUpdated Math Marks: " + marks[0]);

        sc.close();
    }
}
