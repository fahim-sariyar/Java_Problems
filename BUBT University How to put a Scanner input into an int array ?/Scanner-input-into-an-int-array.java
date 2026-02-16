import java.util.Scanner;

public class Sample 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();  // array size

        int[] arr = new int[n];  // create array

        System.out.println("Enter " + n + " integers:");

        // loop to read array elements
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        // display array
        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}
