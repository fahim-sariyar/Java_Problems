# Write a Java program to process student marks and calculate the average using proper exception handling techniques.

Create a class named ResultProcessor. The program will take student marks as input in the form of a String array, where each value represents a mark entered by the user.
Inside the class, 
### 2. implement a method to convert the String array into an integer array. This method should attempt to convert each value into an integer. If any value is not numeric (such as “A+” or “abc”), a 2.NumberFormatException should occur and must be handled in the calling method.
Also, implement another method to calculate the average of marks after validation. While processing the marks:
# calculateAverage() method — mark
### 3. If a mark is exactly -1, it indicates that the student was absent. In this case, a user-defined exception named InvalidMarkException must be thrown with an appropriate message. After handling this exception, the mark should be treated as 0 for the purpose of average calculation.
If a mark is less than 0 or greater than 100 (excluding -1), it is considered invalid, and an IllegalArgumentException must be thrown.
Otherwise, the mark should be considered valid and included in the total.
### 1. Create a custom exception class named InvalidMarkException that extends the Exception class.
In the main method:
### 4.Declare at least four different test cases:
one with all valid marks
one containing a non-numeric value
one containing out-of-range values
one containing -1 to represent absent students
Use a try block to execute the program.
### 5. Use multiple catch blocks to handle:
NumberFormatException
IllegalArgumentException
InvalidMarkException
and optionally any general exception
### 6. Use a finally block to display a message indicating that the processing attempt has been completed.
Ensure that the catch blocks are written in the correct order so that no unreachable catch block occurs. The program should display meaningful messages for each exception and continue execution properly after handling errors.
