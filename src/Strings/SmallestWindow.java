package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

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
       String str = smallestWindow("adobecodebanc", "abc");
        System.out.println(str);
    }
    private static String smallestWindow(String main, String pat){
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i = 0;i<pat.length();i++){
            if(map1.containsKey(pat.charAt(i))){
                map1.put(pat.charAt(i), map1.get(pat.charAt(i)) + 1);
            }else{
                map1.put(pat.charAt(i), 1);
            }
        }

        int i = -1, j = -1, count = 0, desired = pat.length(), n = main.length(), minSize = Integer.MAX_VALUE;
        String window = "";
        while(i <=j && j < n - 1){
            while(j < n - 1){
                j++;
                if(map2.containsKey(main.charAt(j))){
                    map2.put(main.charAt(j), map2.get(main.charAt(j)) + 1 );
                }else{
                    map2.put(main.charAt(j), 1);
                }
                if(map1.containsKey(main.charAt(j))){
                    count++;
                    if(count == desired){
                        if(j - i < minSize){
                            minSize = j - i;
                            window = main.substring(i + 1, j + 1);
                        }
                        break;
                    }
                }
            }

            while(i <= j){
                i++;
                if(map2.containsKey(main.charAt(i))){
                    if(map2.get(main.charAt(i)) > 1){
                        map2.put(main.charAt(i), map2.get(main.charAt(i)) - 1);
                    }else{
                        map2.remove(main.charAt(i));
                    }

                    if(map1.containsKey(main.charAt(i))){
                        if(!map1.get(main.charAt(i)).equals( map2.get(main.charAt(i)))){
                            break;
                        }
                    }
                }
            }
        }

        return  window;
    }
}
