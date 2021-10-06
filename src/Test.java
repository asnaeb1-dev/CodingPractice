import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
    public static void main(String[] args) {
        ConcurrentHashMap chm = new ConcurrentHashMap();
        chm.put(1, "Welcome");
        chm.put(2, "to");
        chm.put(3, "Java");
        chm.put(4, "World") ;
        chm.putIfAbsent(3, "World");
        System.out.println("Elements: "+chm);
        chm.remove(2, "Welcome");
        System.out.println("Elements after key 2 is removed: "+ chm);
        chm.putIfAbsent(3, "Java's");
        System.out.println("Add new: "+ chm);
        chm.replace(3, "Java", "Java New");
        System.out.println("After Replacing: "+ chm);
    }

}
