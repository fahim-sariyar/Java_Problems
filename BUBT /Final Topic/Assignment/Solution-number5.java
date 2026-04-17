public class Multi {

    public static void main(String[] args) {

        FlowerThread t1 = new FlowerThread();
        t1.start();

        try {
            t1.join(); // Wait for first thread
        } catch (Exception e) {
            System.out.println(e);
        }

        FruitThread m1 = new FruitThread();
        Thread t2 = new Thread(m1);
        t2.start();
    }
}

class FlowerThread extends Thread {

    public void run() {
        String[] flowers = {"Rose", "Lily", "Sunflower", "Tulip", "Jasmine"};

        System.out.println("Flowers:");
        for (int i = 0; i < flowers.length; i++) {
            System.out.println(flowers[i]);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class FruitThread implements Runnable {

    public void run() {
        String[] fruits = {"Apple", "Banana", "Mango", "Orange", "Grapes"};

        System.out.println("\nFruits:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

