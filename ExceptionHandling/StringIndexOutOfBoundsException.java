import java.util.Scanner;
public class StringIndexException {
    public static void main(String[] args) {
        String text = "Fahim Sariyar Shovon";
        try {
            // Trying to access index 10 (which does not exist)
            char ch = text.charAt(10);  
            System.out.println("Character: " + ch);
        } 
catch (StringIndexOutOfBoundsException e) 
{
            System.out.println("Error: You tried to access an invalid index of the string!");
        }
        System.out.println("Program continues normally...");
    }
}
