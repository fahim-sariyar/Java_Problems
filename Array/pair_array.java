public class pair_array 
{
    public static void solve(int number[]) 
  {
        for (int i = 0; i < number.length; i++) 
        {
            for (int j = 0; j < number.length; j++) 
            {
                if (number[i] != number[j] && i < j) 
                {
                    System.out.print("(" + number[i] + "," + number[j] + ") ");
                 }
             }
          
            System.out.println();
          }
    }  

    public static void main(String[] args) 
  {
        int number[] = { 2, 4, 6, 8, 10 };
        solve(number);
  }
}
