package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Given two strings. Find the smallest window in the first string consisting of all the characters of the second string.
 *
 * Example 1:
 *
 * Input:
 * S = timetopractice
 * P = toc
 * Output: toprac
 * Explanation: toprac is the smallest
 * subset in which toc can be found.
 * Example 2:
 *
 * Input:
 * S = zoomlazapzo
 * P = oza
 * Output: apzo
 * Explanation: To find oza in the
 * zoomlazapzo the smallest subset is
 * apzo.
 */
public class SmallestWindow {
    public static void main(String[] args) {
       String str = smallestWindow("timetopractice", "toc");
        System.out.println(str);
    }
    private static String smallestWindow(String main, String pat){
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        String window = "";
        int matchCount = pat.length();
        for(int i = 0;i<pat.length();i++){
            char ch = pat.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else{
                map.put(ch, 1);
            }
        }

        int i = 0, j = 0, desiredMatch = 0, n = main.length(), minLength = Integer.MAX_VALUE;
        while(j < n && i <= j){
            while(j < n){
                char ch = main.charAt(j);
                if(desiredMatch == matchCount){
                    break;
                }else if(map2.size() == 0 && !map.containsKey(ch)){
                    i++;
                }else if(map.containsKey(ch)){

                    if(map2.containsKey(ch)){
                        map2.put(ch, map2.get(ch) + 1);
                    }else{
                        map2.put(ch, 1);
                    }
                    if(map2.get(ch) <= map.get(ch)){
                        desiredMatch++;
                    }
                }else if(!map.containsKey(ch)){
                    if(!map2.containsKey(ch)){
                        map2.put(ch, 1);
                    }else{
                        map2.put(ch, map2.get(ch) + 1);
                    }
                }
                j++;
            }

            while(i <= j){
                if(desiredMatch < matchCount){
                    break;
                }
                if(j - i + 1 < minLength){
                    minLength = j - i + 1;
                    window = main.substring(i, j);
                }
                char deletedChar = main.charAt(i++);
                if(map2.get(deletedChar) > 1){
                    map2.put(deletedChar, map2.get(deletedChar) - 1);
                }else{
                    map2.remove(deletedChar);
                }

                if(map.containsKey(deletedChar)){
                    if(map2.containsKey(deletedChar) && map2.get(deletedChar) < map.get(deletedChar)){
                        desiredMatch--;
                    }else if(!map2.containsKey(deletedChar)){
                        desiredMatch--;
                    }
                }
            }
        }
        return window;
    }
}
