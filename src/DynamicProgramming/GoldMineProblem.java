package DynamicProgramming;

import java.util.Arrays;

public class GoldMineProblem {
    public static void main(String[] args) {
        int[][] g = {{1, 3, 3},
                {2, 1, 4},
                {0, 6, 4}};
        int res = goldMine(g, g.length, g[0].length);
        System.out.println(res);
    }
    static int[][] dp;
    private static int goldMine(int[][] g, int n, int m){
        int max = Integer.MIN_VALUE;
        dp = new int[n + 1][m + 1];
        for(int[] i : dp){
            Arrays.fill(i, -1);
        }
        for(int i = 0;i<n;i++){
            max = Integer.max(max, scanGold(g, i, 0, n, m));
        }
        return max;
    }
    private static int scanGold(int[][] g, int i, int j, int n, int m){
        if(i < 0 || j < 0 || i > n - 1 || j > m - 1) return 0;
        if(dp[i][j] != -1) {
            return dp[i][j];
        }

        int a = g[i][j] + scanGold(g, i + 1, j + 1, n, m);
        int b = g[i][j] + scanGold(g, i - 1, j + 1, n, m);
        int c = g[i][j] + scanGold(g, i , j + 1, n, m);
        dp[i][j] = Integer.max(a, Integer.max(b, c));
        return dp[i][j];
    }

}
