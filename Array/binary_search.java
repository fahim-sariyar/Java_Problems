public class binary_search 
{
    public static int search(int number[], int key) 
  {
        int start = 0, end = number.length - 1;
        while (start <= end) 
        {
            int mid = (start + end) / 2;
            if (number[mid] == key) 
            {
                return mid;
            } 
            else if (number[mid] > key) 
            {
                end = mid - 1;
            } 
            else 
            {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) 
  {
        int number[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 10;
        int ans = search(number, key);
        if (ans == -1) 
        {
            System.out.println("NOT FOUND");
        } 
        else 
        {
            System.out.println("FOUND");
        }
    }
}
