class InvalidFileSizeException extends Exception {
    public InvalidFileSizeException(String message) {
        super(message);
    }
}

public class FileUploadSystem {
    
    // Method uses 'throws' to delegate exception handling
    public static void checkFileSize(int size) throws InvalidFileSizeException {
        if (size < 1 || size > 100) {
            // Using 'throw' to trigger the exception
            throw new InvalidFileSizeException("Invalid file size.");
        }
        System.out.println("Upload successful!");
    }

    public static void main(String[] args) {
        int[] fileSizes = {50, 150};

        for (int size : fileSizes) {
            System.out.println("Uploading file of size: " + size);
            try {
                checkFileSize(size);
            } catch (InvalidFileSizeException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
            System.out.println(); // For spacing in output
        }
    }
}
