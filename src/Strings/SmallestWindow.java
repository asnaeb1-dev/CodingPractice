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
       String str = smallestWindow("timetopractice", "toc");
        System.out.println(str);
    }
    private static String smallestWindow(String s, String p){

        //maps all the character of the string "p"
        String ans = "";
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i = 0;i<p.length();i++){
            char ch = p.charAt(i);
            if(map2.containsKey(ch)){
                map2.put(ch, map2.get(ch) + 1);
            }else{
                map2.put(ch, 1);
            }
        }

        //c = count
        //dc = desired count = size of the pattern
        int c = 0, dc = p.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int i = -1, j = -1;

        while(true){
            boolean f1 = false, f2 = false;
            //acquire chacaters
            // i<s.length() - 1 is used because u will have atleast 1 character
            while(i < s.length() - 1 && c < dc){
                i++;
                char ch = s.charAt(i);
                if(map.containsKey(ch)){
                    map.put(ch, map.get(ch) + 1);
                }else{
                    map.put(ch, 1);
                }

                //only increase the count when the character acquire is of any value i.e. not extra
                if(map.getOrDefault(ch, 0) <= map2.getOrDefault(ch, 0)){
                    c++;
                }
                f1 = true;
            }

            //collect answer and release
            while(j < i && c == dc){
                String pans = s.substring(j + 1, i + 1);
                if(ans.length() == 0 || pans.length() > ans.length()){
                    ans = pans;
                }
                j++;
                char ch = s.charAt(j);
                if(map.containsKey(ch)){
                    if(map.get(ch) == 1){
                        map.remove(ch);
                    }else{
                        map.put(ch, map.get(ch) - 1);
                    }
                }
                if(map.getOrDefault(ch, 0) < map2.getOrDefault(ch, 0)){
                    c--;
                }
                f2 = true;
            }
            if(!f1 && !f2) break;
        }

        return  ans;
    }
}
