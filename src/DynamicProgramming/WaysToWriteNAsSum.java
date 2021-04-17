package DynamicProgramming;

import java.math.BigInteger;
import java.util.Arrays;

public class WaysToWriteNAsSum {
    public static void main(String[] args) {
        ;
        System.out.println(count(5));

    }
    private static int count(int n){
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for(int i = 1;i<n;i++){
            for(int j = i;j<=n;j++){
                dp[j]+=dp[j - i];
            }
        }
        return dp[n - 1];
    }
}
