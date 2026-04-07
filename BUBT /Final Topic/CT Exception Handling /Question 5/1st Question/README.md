A student result system has a parent class that checks marks and a child class that finalizes the result. 
The system should ensure that marks are between 0 and 100. If invalid marks are provided, the program should handle it properly.
Write a Java program to demonstrate exception handling with method overriding where the parent class defines a method with throws, and the child class overrides it and handles invalid marks. [5]
# Expected Output:
Checking marks: 85
Result is valid.

Checking marks: 120
Exception caught: Marks cannot be greater than 100.

Checking marks: -10
Exception caught: Marks cannot be negative.
