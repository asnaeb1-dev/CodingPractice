package DynamicProgramming;

import java.util.Arrays;

public class CoinChange {
    static long[] mem;
    public static void main(String[] args) {
        int v = 5;
        int[] coins = {3, 6, 3};
        mem = new long[v + 1];
        Arrays.fill(mem, -1);
        coinChangeMem(coins, v);
        if(mem[v - 1] == Long.MAX_VALUE){
            System.out.println(-1);
            return;
        }
        System.out.println(mem[v - 1]);
    }
    private static int coinChange(int[] coins, int v, int c){
       if(v == 0){
           return 0;
       }
       int r = Integer.MAX_VALUE;
        for (int coin : coins) {
            if (coin <= v) {
                int sub_res = coinChange(coins, v - coin, c);
                if (sub_res != Integer.MAX_VALUE) {
                    r = Math.min(sub_res + 1, r);
                }
            }
        }
       return r;
    }

    private static long coinChangeMem(int[] coins, int v){
        if(v == 0){
            return 0;
        }
        if(mem[v - 1] != -1){
            return mem[v - 1];
        }
        long r = Long.MAX_VALUE;
        for(int i = 0;i<coins.length;i++){
            if(coins[i] <= v){
                long sub_res = coinChangeMem(coins, v - coins[i]);
                if(sub_res != Long.MAX_VALUE){
                    r = Math.min(sub_res + 1, r);
                }
            }
        }
        mem[v - 1] = r;
        return mem[v - 1];
    }
}
