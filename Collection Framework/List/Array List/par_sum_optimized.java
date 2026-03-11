import java.util.ArrayList;

public class pair_sum_optimized {
    public static boolean pairSum(ArrayList<Integer> list, int targetValue) {
        int lp = 0;
        int rp = list.size() - 1;
        while (lp != rp) {
            if ((list.get(lp) + list.get(rp)) == targetValue) {
                return true;
            } else if ((list.get(lp) + list.get(rp)) < targetValue) {
                lp++;
            } else {
                rp++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int targetValue = 11;
        boolean found = pairSum(list, targetValue);
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
