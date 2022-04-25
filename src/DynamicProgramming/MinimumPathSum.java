package DynamicProgramming;

import java.util.Arrays;

public class MinimumPathSum {
    static int[][] dp;
    public static void main(String[] args) {
        int[][] g = {
                {1, 2, 3},
                {4, 5, 6}
        };
        dp = new int[g.length][g[0].length];
        for(int[] i : dp) {
            Arrays.fill(i, -1);
        }
        System.out.println(minPath(g, 0, 0, g.length, g[0].length));
    }
    private static int minPath(int[][] g, int i, int j, int n, int m){
        if(i >=n || j >= m) return Integer.MAX_VALUE;
        if(i == n - 1 && j == m - 1) return g[i][j];
        if(dp[i][j] != -1) return dp[i][j];
        dp[i][j] = g[i][j] + Math.min(minPath(g, i + 1, j, n, m), minPath(g, i, j + 1, n, m));
        return dp[i][j];
    }
}
