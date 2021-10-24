package Strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
        String str = "aaaaaa";
        System.out.println(longestSubstring(str, str.length()));
    }
    private static int longestSubstring(String str, int n){
        int i = -1, j = -1, max = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();
        if(n == 0) return 0;
        while(i <= j && j < n - 1){
            while(j < n - 1){
                j++;
                if(!set.contains(str.charAt(j))){
                    set.add(str.charAt(j));
                    max = Math.max(j - i, max);
                }else{
                    break;
                }
            }
            while(i <= j){
                i++;
                set.remove(str.charAt(i));
                if(!set.contains(str.charAt(j))){
                    set.add(str.charAt(j));
                    break;
                }
            }
        }
        return max;
    }
}
