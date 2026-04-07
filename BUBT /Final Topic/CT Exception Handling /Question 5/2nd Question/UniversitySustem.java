public class Main {
    public static void main(String[] args) {

        Integer[] marks = new Integer[2];
        marks[0] = 85; // marks[1] is not initialized (null)

        for (int i = 0; i < 3; i++) {
            System.out.println("Accessing index " + (i + 1) + ":");

            try {
                if (marks[i] == null) {
                    throw new NullPointerException("Mark not available.");
                }
                System.out.println("Marks: " + marks[i]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Invalid index.");
            }
            catch (NullPointerException e) {
                System.out.println("Error: " + e.getMessage());
            }
            finally {
                System.out.println("Operation completed.");
            }
            System.out.println();
        }
    }
}
