package DynamicProgramming;

import java.util.Arrays;

public class UniquePaths {
    public static void main(String[] args) {
        int a = 3, b = 4;
        //int paths = uniquePath(a, b, 0, 0);
        dp = new int[a + 1][b + 1];
        for(int i =0;i<=a;i++){
            for(int j = 0;j<=b;j++) {
                dp[i][j] = -1;
            }
        }
        uniquePathsMem(a, b, 0, 0);
        System.out.println(dp[a][b]);
    }
    private static int uniquePath(int a, int b, int i, int j){
        if(i > a - 1 || j > b - 1) return 0;
        if(i == a - 1 && j == b - 1) return 1;
        return uniquePath(a, b, i + 1, j) + uniquePath(a, b, i, j + 1);
    }

    static int[][] dp;
    private static int uniquePathsMem(int a, int b, int i, int j){
        if(i > a - 1 || j > b - 1) return 0;
        if(i == a - 1 && j == b - 1) return 1;
        if(dp[i][j] != -1) return dp[i][j];
        int res = uniquePath(a, b, i + 1, j) + uniquePath(a, b, i, j + 1);
        dp[i][j] = res;
        return res;
    }

    public static int NumberOfPath(int a, int b) {
        //Your code here
        int[][] dp = new int[a][b];
        for(int i = 0;i<a;i++){
            for(int j = 0;j<b;j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[a - 1][b - 1];
    }
}
