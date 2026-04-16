import java.util.HashMap;
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}
class Bank {
    HashMap<Integer, Double> acc = new HashMap<>();

    Bank() {
        acc.put(101, 5000.0);
        acc.put(102, 3000.0);
        acc.put(103, 1000.0);
    }
    public void withdraw(int id, double amount)
            throws InsufficientBalanceException {
        if (!acc.containsKey(id)) {
            throw new IllegalArgumentException("Account not found: " + id);
        }
        double bal = acc.get(id);
        if (amount > bal) {
            throw new InsufficientBalanceException("Low balance: " + id);
        }
        acc.put(id, bal - amount);
        System.out.println("Withdraw success: " + id);
    }
}
public class Main {
    public static void main(String[] args) {
        Bank b = new Bank();

        int id[] = {101, 105, 102, 103};
        double amt[] = {2000, 500, 4000, 500};

        for (int i = 0; i < id.length; i++) {
            try {
                b.withdraw(id[i], amt[i]);
            }
            catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
            catch (InsufficientBalanceException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        System.out.println("Process Completed");
    }
}

