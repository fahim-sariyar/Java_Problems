import java.util.*;
import java.io.*;

class Solution {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for(int q = 0; q < t; q++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a;

            for(int i = 0; i < n; i++) {
                sum += (1 << i) * b; // 2^i * b
                System.out.print(sum + " ");
            }
            System.out.println(); // Move to next line after series
        }

        in.close();
    }
}
