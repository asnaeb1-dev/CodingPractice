package DynamicProgramming;

import java.util.Arrays;

public class MinimumJumpsToReachEnd {
    public static void main(String[] args) {
        int[] a = {1,3,5,8,9,2,6,7,6,8,9};
        System.out.println(minJumpsDP(a, a.length));
    }

    private static int minJumpsR(int[] a, int n){
        if(n == 1) return 0;
        if(a[n - 1] == 0) return Integer.MAX_VALUE;

        int res = Integer.MAX_VALUE;
        for(int i = 0;i<n - 1;i++){
            if(i + a[i] >= n - 1){
                int jumps = minJumpsR(a, i + 1);
                if(jumps != Integer.MAX_VALUE){
                    res = Integer.min(res, jumps + 1);
                }
            }
        }
        return res;
    }

    private static int minJumpsDP(int[] a, int n){
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for(int i = 1;i<n;i++){
            for(int j = 0;j<i;j++){
                if(j + a[j] >= i){
                    if(dp[j] != Integer.MAX_VALUE){
                        dp[i] = Integer.min(dp[i], dp[j] + 1);
                    }
                }
            }
        }
        return dp[n - 1];
    }
}
