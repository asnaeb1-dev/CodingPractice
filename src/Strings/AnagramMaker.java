package Strings;

import java.util.HashMap;
import java.util.Map;

public class AnagramMaker {
    public static int remAnagrams(String s1,String s2){
        //add code here.
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(int i = 0;i<s1.length();i++){
            char ch = s1.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else{
                map.put(ch, 1);
            }
        }

        for(int i = 0;i<s2.length();i++){
            char ch = s2.charAt(i);
            if(map2.containsKey(ch)){
                map2.put(ch, map2.get(ch) + 1);
            }else{
                map2.put(ch, 1);
            }
        }

        int removal = 0;
        if(map.size() > map2.size()){
            for(Map.Entry<Character, Integer> entry : map.entrySet()){
                char ch = entry.getKey();
                if(!map2.containsKey(ch)){
                    removal++;
                }else{
                    removal+= Math.abs(map.get(ch) - map2.get(ch));
                }
            }
        }else{
            for(Map.Entry<Character, Integer> entry : map2.entrySet()){
                char ch = entry.getKey();
                if(!map.containsKey(ch)){
                    removal++;
                }else{
                    removal+= Math.abs(map.get(ch) - map2.get(ch));
                }
            }
        }


        return removal;
    }

    public static void main(String[] args) {
        System.out.println(remAnagrams("iywruibjjgfbfofwrfwrufnwrfwrf", "jfrbu"));
    }
}
