public class NumberCheck 
{
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new Odd());
        Thread t2 = new Thread(new Even());
        t1.start();
        t1.join();
        t2.start();
}
}
class Odd implements Runnable {
    public void run()
{
        System.out.print("Odd Thread: ");
        for (int i = 1; i <= 10; i += 2)
            System.out.print(i + " ");
        System.out.println();
}
}
class Even implements Runnable 
{
    public void run()
    {
        System.out.print("Even Thread: ");
        for (int i = 2; i <= 10; i += 2)
            System.out.print(i + " ");
        System.out.println();
}
}
