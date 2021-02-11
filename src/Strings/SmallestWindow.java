package Strings;

import java.util.ArrayList;
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

    }
    private static String smallestWindow(String s, String p){
        if(s.length() < p.length()){
            return "-1";
        }else if(s.length() == p.length()){
            if(s.equals(p)){
                return s;
            }
            return "-1";
        }
        LinkedHashMap<Character, ArrayList<Integer>> map = new LinkedHashMap<>();
        return  "";
    }
}
