
public class odd_or_even {
    public static void oddoreven(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        oddoreven(5);
        oddoreven(6);
    }
}
