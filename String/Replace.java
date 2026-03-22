public class replaceAll {
    public static void main(String[] args) {
        String str1 = "Java123is4324Fun";
        String regex = "\\d+";

        System.out.println(str1.replaceAll(regex, " "));

        String str2 = "jhkaaakjshf";
        String regex2 = "a{3}";
        System.out.println(str2.replaceAll(regex2, "b"));
    }

}
