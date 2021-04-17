package DynamicProgramming;

import java.util.Arrays;
public class EditDistance {

    static int[][] mem;
    static int[][] table;
    public static void main(String[] args) {
        String s1 = "saturday", s2 = "sunday";
//        System.out.println(editDistance(s1,s2, s1.length(), s2.length()));
        int n = s1.length(), m = s2.length();
//        mem = new int[n][m];
//        editDistanceMem(s1, s2, n, m);
//        System.out.println(mem[n - 1][ m - 1]);
        table = new int[n + 1][m + 1];
        for(int i = 0;i<=m;i++){
            table[i][0] = i;
        }
        for(int j = 0;j<=m;j++){
            table[0][j] = j;
        }
        editDistanceTab(s1, s2, n, m);
        System.out.println(table[n -1][ m -1]);
    }
    private static int editDistance(String s1, String s2, int n, int m){
        if(n == 0){
            return m;
        }
        if(m == 0){
            return n;
        }
        if(s1.charAt(n - 1) == s2.charAt(m - 1)){
            return editDistance(s1, s2, n -1, m - 1);
        }
        //1- add an element
        // 2- remove an element
        //3 - replace an element
        return 1 + Math.min( editDistance(s1, s2, n, m - 1),
                Math.min(editDistance(s1, s2, n - 1, m), editDistance(s1, s2, n - 1, m - 1)));
    }
    private static int editDistanceMem(String s1, String s2, int n, int m){
        if(n == 0){
            return 0;
        }
        if(m == 0){
            return 1;
        }
        if(s1.charAt(n - 1) == s2.charAt(m - 1)){
            mem[n - 1][ m - 1] = editDistance(s1, s2, n -1, m - 1);
            return mem[n - 1][ m - 1];
        }
        mem[n - 1][ m - 1] = 1 + Math.min( editDistance(s1, s2, n, m - 1), Math.min(editDistance(s1, s2, n - 1, m), editDistance(s1, s2, n - 1, m - 1)));
        return mem[n - 1][ m - 1];
    }
    private static void editDistanceTab(String s1, String s2, int n, int m){
        for(int i = 1;i<table.length;i++){
            for(int j = 1;j<table[i].length;j++){
                if(s1.charAt(i - 1) == s2.charAt(j - 1)){
                    table[i][j] = table[i - 1][j - 1];
                }else{
                    table[i][j] = 1 + Math.min(table[i - 1][j], Math.max(table[i - 1][j - 1], table[i][j - 1]));
                }
            }
        }
    }
}
