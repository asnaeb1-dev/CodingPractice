package QueueDS;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class GameOfString {

   static class Element{
        char ch;
        int count;

        public Element(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

    public static void main(String[] args) {
        String a = "aabcbcbcabcc";
        System.out.println(minValue(a, a.length(), 3));
    }
    private static int minValue(String s, int n, int k){
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else {
                map.put(ch, 1);
            }
        }

        PriorityQueue<Element> pq = new PriorityQueue<>((o1, o2) -> {
            if(o1.count == o2.count){
                return o1.ch - o2.ch;
            }
            return o2.count - o1.count;
        });

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            pq.add(new Element(entry.getKey(), entry.getValue()));
        }

        while(!pq.isEmpty() && k != 0){
            Element el = pq.poll();
            el.count--;
            k--;
            if(el.count != 0){
                pq.add(el);
            }
        }
        int res = 0;
        while(!pq.isEmpty()){
            res+= Math.pow(pq.poll().count, 2);
        }

        return res;
    }
}
