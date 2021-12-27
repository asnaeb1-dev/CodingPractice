package LinkedList;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LRUCache2 {
    private static LinkedHashSet<Integer> set;
    private int CACHE_SIZE;

    public LRUCache2(int CACHE_SIZE) {
        set = new LinkedHashSet<>(CACHE_SIZE);
        this.CACHE_SIZE = CACHE_SIZE;
    }

    private void refer(int page){
        if(set.contains(page)){
            set.remove(page);
        }else{
            if(set.size() == CACHE_SIZE){
                int key = set.iterator().next();
                set.remove(key);
            }
        }
        set.add(page);
    }

    public static void main(String[] args) {
        LRUCache2 cache = new LRUCache2(4);
        cache.refer(1);
        cache.refer(2);
        cache.refer(3);
        cache.refer(1);
        cache.refer(4);
        cache.refer(5);
        cache.refer(2);
        cache.refer(2);
        cache.refer(1);

        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
