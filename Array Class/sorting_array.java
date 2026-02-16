import java.util.*;
public class sorting_array 
{
    public static void main(String[] args) 
  {
        int numbers[] = { 4, 3, 6, 9, 7, 5 };
        Arrays.sort(numbers);

        for (Integer element : numbers) 
        {
            System.out.print(element + " ");
        }
    }
}
