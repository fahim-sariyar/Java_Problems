import java.util.*;

public class linear_search {
    public static int search(int n[], int key) {
        for (int i = 0; i < n.length; i++) {
            if (n[i] == key) {
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        int number[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22};
        int key = 10;
        int ans = search(number, key);
        if (ans == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found");
        }
        sc.close();
    }
}
