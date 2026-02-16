import java.util.*;
public class binarySearch 
{
    public static void main(String[] args) {
        int numbers[] = { 2, 3, 4, 5, 6, 7, 8, 9 };
        int index = Arrays.binarySearch(numbers, 5);

        System.out.println("The index of element 5 is : " + index);
    }
}
