abstract class Shape {
    abstract double calculateArea();
}
interface Display {
    void show();
}
class Circle extends Shape implements Display {
    double r;
    Circle(double r) { this.r = r; }
    double calculateArea() { return 3.14 * r * r; }
    public void show() {
        System.out.println("Circle Area: " + calculateArea());
    }
}
class Rectangle extends Shape implements Display {
    double l, w;
    Rectangle(double l, double w) { this.l = l; this.w = w; }
    double calculateArea() { return l * w; }
    public void show() {
        System.out.println("Rectangle Area: " + calculateArea());
    }
}
public class NumberCheck {
    public static void main(String[] args) {
        new Circle(5).show();
        new Rectangle(10, 5).show();
    }
}
