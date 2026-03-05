public class compare {
    public static void main(String[] args) {
        String s1 = "Fahim";
        String s2 = "Fahim";
        String s3 = new String("Fahim");
        if (s1 == s2) {
            System.out.println("String are equal");
        }
        /*
         * if (s1 == s3) {
         * System.out.println("String are equal");
         * }
         */
        if (s1.equals(s3)) {
            System.out.println("Stirng are equal");
        } else {
            System.out.println("String are not equal");
        }
    }
}
