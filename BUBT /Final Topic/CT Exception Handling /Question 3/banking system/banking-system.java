class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        double balance = 5000;
        double[] withdrawals = {2000, -500, 7000};

        System.out.println("Current balance: " + (int)balance);

        for (double amount : withdrawals) {
            System.out.println("Withdrawing: " + (int)amount);
            
            try {
                // Nested try to handle specific withdrawal logic
                try {
                    if (amount < 0) {
                        throw new IllegalArgumentException("Invalid amount entered.");
                    }
                    if (amount > balance) {
                        throw new InsufficientBalanceException("Insufficient balance.");
                    }
                    
                    balance -= amount;
                    System.out.println("Withdrawal successful! Remaining balance: " + (int)balance);
                    
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                // Outer catch for the user-defined exception
            } catch (InsufficientBalanceException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }
    }
}
