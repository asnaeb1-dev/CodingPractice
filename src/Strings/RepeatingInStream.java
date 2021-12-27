package Strings;

import java.util.*;

public class RepeatingInStream {
    public static void main(String[] args) {
        String str = "aaa";
        System.out.println(nonRepeating(str));
    }

    private static String nonRepeating(String s){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        Deque<Character> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        q.add(s.charAt(0));
        map.put(s.charAt(0), 1);
        sb.append(s.charAt(0));
        for(int i = 1;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else{
                map.put(ch, 1);
            }

            if(q.isEmpty() ){
                q.add(ch);
            }else{
                if(q.peekFirst() == ch){
                    q.pollFirst();
                }else if(q.peekLast() == ch){
                    q.pollLast();
                }else{
                    if(map.containsKey(ch) && map.get(ch) == 1){
                        q.add(ch);
                    }
                }
            }

            if(!q.isEmpty()){
                sb.append(q.peekFirst());
            }else{
                sb.append("#");
            }
        }
        return sb.toString();
    }
}
