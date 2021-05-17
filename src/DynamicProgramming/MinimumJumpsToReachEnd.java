package DynamicProgramming;

import java.util.Arrays;

public class MinimumJumpsToReachEnd {
    public static void main(String[] args) {
        int[] a = {3, 4, 2, 1, 2, 1};
        System.out.println(minJumps(a, a.length));
    }
    private static int minJumps(int[] a, int n){
        int[] dp = new int[n ];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 1;i<dp.length;i++){
            for(int j = 0;j<i;j++){
                if(j + a[j] >= i){
                    if(dp[j] != Integer.MAX_VALUE){
                        dp[i] = Math.min(dp[j] + 1, dp[i]);
                    }
                }
            }
        }
        return dp[dp.length - 1];
    }
}
