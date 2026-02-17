public class lergest_number 
{
    public static int getlargest(int number[]) 
  {
        // initilize the largest number
    int largest = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) 
        {
            if (largest < number[i]) 
            {
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) 
  {
    int num[] = { 1, 2, 6, 3, 5 };
  
    // passing the array
    
    int ans = getlargest(num);
    System.out.println("largest value is : " + ans);
    }
}
