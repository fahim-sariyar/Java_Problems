public class max_subarray_sum {
    public static void max_sum(int n[]) {
        int sum = 0;
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {
            int start = i;
            for (int j = i; j < n.length; j++) {
                int end = j;
                sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += n[k];
                }
                System.out.println(sum);
                if (maximum < sum) {
                    maximum = sum;
                }
            }
        }
        System.out.println("Maximum sum: " + maximum);
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18};
        max_sum(number);
    }

}
