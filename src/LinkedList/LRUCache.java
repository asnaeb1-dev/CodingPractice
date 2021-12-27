package LinkedList;

import java.util.*;

/**
 * Using Deque and hashset
 */
public class LRUCache {
      static Deque<Integer> dq;
      HashSet<Integer> set;
      Integer CACHE_SIZE;

    public LRUCache(int CACHE_SIZE) {
        this.CACHE_SIZE = CACHE_SIZE;
        dq = new LinkedList<Integer>();
        set = new HashSet<>();
    }

    private void refer(int page){
        //check if the page already exists
        if(set.contains(page)){
            dq.remove(page);
        }else{
            if(dq.size() == CACHE_SIZE){
                int last = dq.removeLast();
                set.remove(last);
            }
        }
        dq.push(page);
        set.add(page);
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(4);
        cache.refer(1);
        cache.refer(2);
        cache.refer(3);
        cache.refer(1);
        cache.refer(4);
        cache.refer(5);
        cache.refer(2);
        cache.refer(2);
        cache.refer(1);

        Iterator<Integer> itr = dq.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
