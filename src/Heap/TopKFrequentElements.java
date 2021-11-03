package Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] a = {1, 1, 1, 2, 2, 3};
        int[] r = topKFrequent(a, 2);
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i, 1);
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> map.get(o2) - map.get(o1));
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            pq.add(entry.getKey());
        }
        int[] res = new int[k];
        int i = 0;
        while(k != 0){
            res[i] = pq.remove();
            k--;
            i++;
        }
        return res;
    }
}
