import java.util.Scanner;

public class Count {
    public static void main(String[] args) {

        int lines = 0;
        int words = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text (type 'exit' to stop):");

        while (true) {
            String line = sc.nextLine();

            if (line.equalsIgnoreCase("exit")) {
                break;
            }

            lines++;

            String[] wordList = line.trim().split("\\s+");

            if (!line.trim().isEmpty()) {
                words += wordList.length;
            }
        }

        System.out.println("Total Lines: " + lines);
        System.out.println("Total Words: " + words);

        sc.close();
    }
}
