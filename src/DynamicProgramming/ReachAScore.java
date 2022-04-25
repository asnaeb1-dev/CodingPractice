package DynamicProgramming;

import java.util.Arrays;

public class ReachAScore {
    public static int count(int n){
        //Your code here
        int[] units = {3, 5, 10};
        mem = new int[units.length + 1][n + 1];
        for(int[] i : mem){
            Arrays.fill(i, -1);
        }
        reachScore(n, units, 3);
        return mem[units.length][n];
    }
    static int[][] mem;
    private static int reachScore(int score, int[] units, int n){
        if(score == 0) return 1;
        if(n == 0) return 0;
        if(mem[n][score] != -1) return mem[n][score];
        int r = reachScore(score, units, n - 1);
        mem[n][score] = r;
        if(units[n - 1] <= score){
            r+=reachScore(score - units[n - 1], units, n);
            mem[n][score] = r;
        }
        return r;
    }
}
