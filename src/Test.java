import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(3);

        int t = al.get(0);
        al.set(0, al.get(1));
        al.set(1, t);

        System.out.println(al.toString());

    }
}
