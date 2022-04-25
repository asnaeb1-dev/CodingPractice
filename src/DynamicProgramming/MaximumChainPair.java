package DynamicProgramming;

import java.util.Arrays;
import java.util.Collections;

public class MaximumChainPair {
    static class Pair{
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {

        Pair[] p = new Pair[5];
        p[0] = new Pair(5, 24);
        p[1] = new Pair(39, 60);
        p[2] = new Pair(15, 28);
        p[3] = new Pair(27, 40);
        p[4] = new Pair(50, 90);
        int res = maxPairDP(p, p.length);
        System.out.println(res);
    }

    //basic recursion
    private static int maxPair(Pair[] p, int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        int r = Integer.MIN_VALUE;
        for(int i = n - 2;i>=0;i--){
            if(p[n - 1].x > p[i].y){
                 r = Math.max(r, 1 + maxPair(p, i + 1));
            }
        }
        return r;
    }

    private static int maxPairDP(Pair[]p, int n){
        int[] dp = new int[n];
        Arrays.sort(p, (o1, o2) -> o1.x - o2.x);
        Arrays.fill(dp, 1);
        for(int i = 1;i<n;i++){
            for(int j = 0;j<i;j++){
                if(p[j].y < p[i].x){
                    dp[i] = Integer.max(dp[i], 1 + dp[j]);
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[n - 1];
    }
}
