

public class LibrarySystem {

    public static void main(String[] args) {

        String[] books = {"Database System", null}; 

        int[] testIndexes = {1, 2, 3};  

        for (int index : testIndexes) {
            System.out.println("Accessing index " + index + ":");

            try {
                try {
                   
                    String book = books[index - 1];

                    if (book == null) {
                        throw new NullPointerException("Book entry is missing.");
                    }

                    System.out.println("Book: " + book);

                } catch (NullPointerException e) {
                    System.out.println(e.getMessage());
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index.");
            }

            System.out.println();
        }
    }
}
