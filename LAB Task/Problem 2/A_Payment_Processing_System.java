// Base Class
class Payment {
    double amount;

    // Constructor
    public Payment(double amount) {
        this.amount = amount;
    }

    // Method
    public void processPayment() {
        System.out.println("Processing general payment of amount: " + amount);
    }
}

// Derived Class
class OnlinePayment extends Payment {
    String platform;

    // Constructor
    public OnlinePayment(double amount, String platform) {
        super(amount); // Call parent constructor
        this.platform = platform;
    }

    // Overriding method
    @Override
    public void processPayment() {
        System.out.println("Processing online payment via " 
                + platform + " of amount: " + amount);
    }
}

// Further Derived Class
class MobileBankingPayment extends OnlinePayment {
    String mobileNumber;

    // Constructor
    public MobileBankingPayment(double amount, String platform, String mobileNumber) {
        super(amount, platform); // Call parent constructor
        this.mobileNumber = mobileNumber;
    }

    // Overriding method
    @Override
    public void processPayment() {
        System.out.println("Processing mobile banking payment from " 
                + mobileNumber + " via " + platform 
                + " of amount: " + amount);
    }
}

// Runtime Polymorphism Class
class PaymentService {

    public void executePayment(Payment p) {
        p.processPayment();  // Dynamic Method Dispatch
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        // Upcasting (Runtime Polymorphism)
        Payment p = new MobileBankingPayment(
                5000.0, 
                "bKash", 
                "0151898XXXXXXXX"
        );

        PaymentService service = new PaymentService();

        service.executePayment(p);
    }
}

