package Heap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**Q
 * Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.
 *
 * Return any possible rearrangement of s or return "" if not possible.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aab"
 * Output: "aba"
 * Example 2:
 *
 * Input: s = "aaab"
 * Output: ""
 */
public class RearrangeString {

    public static void main(String[] args) {
        String s = "abbabbaaab";
        String r = rearrange(s);
        System.out.println(r);
    }
    private static String rearrange(String s){
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            if(hashMap.containsKey(s.charAt(i))){
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
            }else{
                hashMap.put(s.charAt(i), 1);
            }
        }



        PriorityQueue<Character> pq = new PriorityQueue<>((o1, o2) -> hashMap.get(o2) - hashMap.get(o1));

        for(Map.Entry <Character, Integer> entry : hashMap.entrySet()){
            pq.add(entry.getKey());
//            System.out.println(entry.getKey() +" -> "+ entry.getValue());
        }

        StringBuilder sb = new StringBuilder();
        while(pq.size() > 1){
           char last = pq.poll();
           char lastBut1 = pq.remove();

           sb.append(last).append(lastBut1);
           hashMap.put(last, hashMap.get(last) - 1);
           hashMap.put(lastBut1, hashMap.get(lastBut1) - 1);

           if(hashMap.get(last) > 0){
               pq.add(last);
           }

           if(hashMap.get(lastBut1) > 0){
               pq.add(lastBut1);
           }
        }
        if(hashMap.containsKey(pq.peek())){
            if(hashMap.get(pq.peek()) > 1){
                return "";
            }else{
                sb.append(pq.remove());
            }
        }
        return sb.toString();
    }
}
