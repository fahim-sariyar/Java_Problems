public class string_char_at_method 
{
    public static void printLetters(String name) 
  {
        for (int i = 0; i < name.length(); i++) 
        {
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
  {
        String name = "Rakibul Hasan";
        // System.out.println(name.charAt(0));
        printLetters(name);
    }
}
