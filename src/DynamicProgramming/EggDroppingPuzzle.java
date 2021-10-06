package DynamicProgramming;

import java.util.Arrays;

public class EggDroppingPuzzle {
    public static void main(String[] args) {
        int e = 2, f = 10;
        //System.out.println(eggs(e, f));
        System.out.println(eggdp(e, f));
    }
    private static int eggs(int e, int f){
        if(f == 0 || f == 1) return f;
        if(e == 1) return f;

        int ans = Integer.MAX_VALUE;
        for(int i = 1;i<=f;i++){
            ans = Math.min( ans, Math.max(eggs(e - 1, i - 1), eggs(e, f - i)) + 1);
        }
        return ans ;
    }

    private static int eggdp(int e, int f){
        int[][] dp = new int[f + 1][e + 1];
        for(int i = 1;i < e + 1;i++){
            dp[1][i] = 1;
        }
        for(int i = 1;i< f + 1;i++){
            dp[i][1] = i;
        }

        for(int i = 2;i < f + 1;i++) {
            for (int j = 2; j <e + 1; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int x = 1; x <=i; x++) {
                    dp[i][j] = Math.min(dp[i][j], 1 + Math.max(dp[x - 1][j - 1], dp[i - x][j]));
                }
            }
        }
        return dp[f][e];
    }
}
