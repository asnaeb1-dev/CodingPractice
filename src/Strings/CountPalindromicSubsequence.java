package Strings;

import java.util.Arrays;

public class CountPalindromicSubsequence {

    static long MOD = (long) (Math.pow(10, 9) + 7);
    public static void main(String[] args) {
        String s = "aab";
        mem = new long[s.length() + 1][s.length() + 1];
        for(long[] list : mem){
            Arrays.fill(list, - 1);
        }
        long c = countMem(s, 0, s.length() - 1);
        System.out.println(c);
    }
    //Using recursion
    private static long count(String s, int i, int j){
        if(j < 0 || i > s.length() - 1) return 0;
        if(i == j) return 1;
        if(s.charAt(i) == s.charAt(j)){
            return (1 + count(s, i + 1, j) + count(s,i, j - 1));
        }
        return (count(s, i + 1, j) + count(s, i, j - 1) - count(s, i + 1, j - 1)) ;
    }
    //using tabulation
    static long[][] mem;
    private static long countMem(String s, int i, int j){
        if(i > j){
            return 0;
        }
        if(i == j){
            mem[i][j] = 1;
            return mem[i][j];
        }else if(mem[i][j] != -1){
            return mem[i][j];
        }else if(s.charAt(i) == s.charAt(j)){
            mem[i][j] = 1 + countMem(s, i + 1, j) + countMem(s, i, j - 1);
            return mem[i][j];
        }
        mem[i][j] = countMem(s, i + 1, j) + countMem(s, i, j - 1) - countMem(s, i + 1,j - 1);
        return mem[i][j];
    }
}
