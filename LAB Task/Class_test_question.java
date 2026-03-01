class Wallet {

    // Instance variables
    private String ownerName;
    private double balance;

    // Static variable
    private static int totalWallets = 0;

    // Constructor
    public Wallet(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
        totalWallets++;   // Increment total wallets count
    }

    // addMoney method (method chaining supported)
    public Wallet addMoney(double amount) {
        this.balance += amount;
        return this;
    }

    // spendMoney method (method chaining supported)
    public Wallet spendMoney(double amount) {
        if (amount <= balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
        return this;
    }

    // showStatus method
    public void showStatus() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Current Balance: " + balance);
    }

    // Static method
    public static int getTotalWallets() {
        return totalWallets;
    }
}

public class Main {
    public static void main(String[] args) {

        // Replace with your real full ID number
        double fullID = 20245103173;  

        // Last four digits of ID
        double lastFourDigits = 3173;  

        // Create Wallet object using your name
        Wallet myWallet = new Wallet("Fahim", fullID);

        // Spend money using last four digits
        myWallet.spendMoney(lastFourDigits);

        // Display wallet status
        myWallet.showStatus();

        // Print total wallet objects created
        System.out.println("Total Wallets Created: " + Wallet.getTotalWallets());
    }
  }
