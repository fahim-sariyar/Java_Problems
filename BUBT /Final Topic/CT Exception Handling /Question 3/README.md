# In a banking system, a user can withdraw money from their account. 
The system should ensure that the withdrawal amount is not negative and does not exceed the available balance. If any of these conditions fail, the system should handle the situation properly without terminating the program. Write a Java program that uses a user-defined exception, multiple catch blocks, and nested try statements to handle these cases.

### Expected Output: 
Current balance: 5000

Withdrawing: 2000

Withdrawal successful! Remaining balance: 3000

Withdrawing: -500

Invalid amount entered.

Withdrawing: 7000

Exception caught: Insufficient balance.
