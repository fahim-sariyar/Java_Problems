import java.util.*;

public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(9);
        list.add(7);

        // asending order print
        Collections.sort(list);
        System.out.println(list);

        // desending order print
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
