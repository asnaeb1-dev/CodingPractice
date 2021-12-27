package Strings;

import java.util.Arrays;

public class KMPPatternSearch {
    public static void main(String[] args) {
        String main = "ababcababaad";
        String patt = "ababa";

        int[] re = patternSearch(main, patt);
        System.out.println(Arrays.toString(re));
    }
    private static int[] patternSearch(String s, String patt){
        int[] lps = fillLPS(patt, patt.length());
        System.out.println(Arrays.toString(lps));
        int n = s.length();
        int m = patt.length();

        int[] res = new int[n];
        int i = 0, j = 0, k = 0;
        while(i < n){
            if(s.charAt(i) == patt.charAt(j)){
                i++;
                j++;
            }
            if(j == m){
                res[k++] = i;
                j = lps[j - 1];
            }else if(i < n && patt.charAt(j) != s.charAt(i)){
                if(j == 0){
                    i++;
                }else{
                    j = lps[j - 1];
                }
            }
        }
        return res;
    }
    private static int[] fillLPS(String str, int n){
        int i = 1;
        int[] lps = new int[n];
        lps[0] = 0;

        int len = 0;
        while(i < n){
            if(str.charAt(i) == str.charAt(len)){
                lps[i++] = len + 1;
                len++;
            }else{
                if(len == 0){
                    lps[i++] = 0;
                }else{
                    len = lps[len - 1];
                }
            }
        }
        return lps;
    }
}
