import java.util.LinkedList;

class Product {
    int productCode;
    String productName;
    double price;

    // Constructor
    public Product(int productCode, String productName, double price) {
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
    }

    // Method to display product info
    public void display() {
        System.out.println("Code: " + productCode +
                           ", Name: " + productName +
                           ", Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<Product> list = new LinkedList<>();

        // Add 5 products
        list.add(new Product(101, "Laptop", 75000));
        list.add(new Product(102, "Mouse", 800));
        list.add(new Product(103, "Keyboard", 1500));
        list.add(new Product(104, "Monitor", 12000));
        list.add(new Product(105, "Printer", 10000));

        // Remove last product
        list.removeLast();

        // Display first product without removing
        System.out.println("First Product:");
        list.getFirst().display();
    }
}
