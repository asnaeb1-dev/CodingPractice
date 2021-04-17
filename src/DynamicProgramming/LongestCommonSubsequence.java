package DynamicProgramming;

import java.util.Arrays;

public class LongestCommonSubsequence {

    static int[][] mem;
    static int[][] table;

    //using recursion
    private static int lcs(String s1, String s2, int n, int m){
        if(n == 0 || m == 0){
            return 0;
        }
        if(s1.charAt(n - 1) == s2.charAt(m - 1)){
            return 1 + lcs(s1, s2, n - 1, m - 1);
        }
        return Math.max( lcs(s1, s2, n - 1, m), lcs(s1, s2, n , m - 1));
    }

    //using memoization
    private static int lcsMem(String s1, String s2, int n, int m){
        if(n == 0 || m == 0){
            return 0;
        }
        if(mem[n - 1][m - 1] != -1){
            return mem[n - 1][m - 1];
        }
        if(s1.charAt(n - 1) == s2.charAt(m - 1)){
            mem[n - 1][m - 1] = 1 + lcs(s1, s2, n - 1, m - 1);
            return mem[n - 1][m - 1];
        }
        mem[n - 1][m - 1] = Math.max(lcs(s1, s2, n - 1, m), lcs(s1, s2, n, m - 1));
        return mem[n - 1][m - 1];
    }

    //using tabulation
    private static void lcsTab(String s1, String s2, int n, int m){
        for(int i = 1;i<n ;i++){
            for(int j = 1;j<m;j++){
                if(s1.charAt(i -1) == s2.charAt(j - 1)){
                    table[i][j] = 1 + table[i - 1][j - 1];
                }else{
                    table[i][j] = Math.max(table[i - 1][j], table[i][j - 1]);
                }
            }
        }
    }

    public static void main(String[] args) {
        //System.out.println(lcs("abcdgh", "aedfhr", 6, 6));
//        mem = new int[6][6];
//        for(int i = 0;i<mem.length;i++){
//            Arrays.fill(mem[i], -1);
//        }
//        lcsMem("axyz", "baz", 4, 3);
//        System.out.println(mem[3][2]);
        table = new int[7][7];
        for(int i = 0;i<table.length;i++){
            Arrays.fill(table[i], 0);
        }
        lcsTab("abcdgh", "aedfhr", 7, 7);
        System.out.println(table[6][6]);
    }
}
