class InvalidMarkException extends Exception 
{
    public InvalidMarkException(String message) 
    {
        super(message);
    }
}

class ResultProcessor {

    public int[] convertToIntArray(String[] marks) throws NumberFormatException 
    {
        int[] intMarks = new int[marks.length];

        for (int i = 0; i < marks.length; i++) 
        {
            intMarks[i] = Integer.parseInt(marks[i]);
        }

        return intMarks;
    }

    public double calculateAverage(int[] marks)
            throws InvalidMarkException 
            {

        int sum = 0;

        for (int mark : marks) 
        {

            if (mark == -1) 
            {
                throw new InvalidMarkException("Student was absent (-1)");
            }

            if (mark < 0 || mark > 100) 
            {
                throw new IllegalArgumentException("Invalid mark: " + mark);
            }

            sum += mark;
        }

        return (double) sum / marks.length;
    }
}

public class Main {
    public static void main(String[] args) 
    {

        ResultProcessor rp = new ResultProcessor();

        // String[][] testCases = {
        //     {"50", "70", "90", "85"},
        //     {"78", "A+", "80", "85"},
        //     {"50", "110", "70", "-5"},
        //     {"-1", "77", "88", "78"}
        // };
        
        String[][] testCases = {
    {"80", "70", "90", "85"},      // valid
    {"80", "A+", "75", "80"},     // A+ → NumberFormatException
    {"90", "90", "70", "75"},     // valid
    {"60", "-1", "80", "90"}      // -1 → custom exception
};

        for (int i = 0; i < testCases.length; i++) {
            System.out.println("\nTest Case Number " + (i + 1) + "");

            try {
                int[] marks = rp.convertToIntArray(testCases[i]);
                double avg = rp.calculateAverage(marks);
                System.out.println("Average = " + avg);

            } catch (NumberFormatException e) {
                System.out.println("Error: Non-numeric value found.");

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());

            } catch (InvalidMarkException e) {
                System.out.println("Custom Exception: " + e.getMessage());
                System.out.println("Treating absent as 0 conceptually.");

            } finally {
                System.out.println("Processing completed.");
            }
        }
    }
}
