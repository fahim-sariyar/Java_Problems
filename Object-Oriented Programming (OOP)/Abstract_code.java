abstract class Animal {
    abstract void walk();

    Animal() {
        System.out.println("You are crating a new animal");
    }

    public void eat() {
        System.out.println("animal eats");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("You're creating a horse");
    }

    public void walk() {
        System.out.println("walks on 4-lags");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("walks on 2 lages");
    }
}

public class Abstract_code {
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        horse1.walk();
    }
}
