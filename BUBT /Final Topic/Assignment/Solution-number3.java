import java.util.TreeSet;
// Temperature class
class Temperature {
    int value;
    // Constructor
    Temperature(int value) {
        this.value = value;
    }
}
public class Main {
    public static void main(String[] args) {
 // TreeSet with descending order
TreeSet<Integer> temps = new TreeSet<>((a, b) -> b - a);
// Insert at least 6 values (including duplicates)
        temps.add(30);
        temps.add(25);
        temps.add(40);
        temps.add(20);
        temps.add(30); // duplicate
        temps.add(25); // duplicate
        for (int t : temps) {
            System.out.println(t + "°C");
        }   }  }

