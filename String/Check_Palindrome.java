public class Check_Palindrome 
{
    public static boolean Palindrome_Check(String str) 
  {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) 
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) 
    {
        String name = "MADAM";
        System.out.println(Palindrome_Check(name));

    }
}
