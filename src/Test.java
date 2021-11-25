import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
    public static void main(String[] args) {
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        map.put(-2, List.of(1, 2));
        map.put(-4, List.of(2, 3));
        map.put(13, List.of(41, 22));

        for(Map.Entry<Integer, List<Integer>> entry: map.entrySet()){
            System.out.println(entry.getValue().get(0));
        }
    }
}
