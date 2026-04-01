class AlphaThread extends Thread {
    public void run() {
        String text = "abcde";
        for (int i = 0; i < text.length(); i++) {
            System.out.println("Alphabet Thread: " + text.charAt(i));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Alphabet thread interrupted");
            }
        }
    }
}


class NumberThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number Thread: " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Number thread interrupted");
            }
        }
    }
}


public class TwoThreadDemo {
    public static void main(String[] args) {

        AlphaThread t1 = new AlphaThread(); 
        Thread t2 = new Thread(new NumberThread()); 

        t1.start();
        t2.start();
    }
}

