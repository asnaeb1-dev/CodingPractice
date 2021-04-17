package DynamicProgramming;

import java.util.Arrays;

/**Q
 * Count every combination in which a sum can be printed
 */
public class CoinChange_I {
    static long[][] mem;
    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        int v = 4;
        int c = 3;
        //System.out.println(count(coins, v, c));
        mem = new long[c + 1][v + 1];
        for(int i = 0;i<mem.length;i++){
            Arrays.fill(mem[i], -1);
        }
        countMem(coins, c, v);
        System.out.println(mem[c - 1][ v - 1]);
    }
    private static int count(int[] coins, int v, int c){
        if(v == 0){
            return 1;
        }
        if(c == 0){
            return 0;
        }
        int res = count(coins, v, c - 1);
        if(coins[c - 1] <= v){
            res+= count(coins, v - coins[c - 1], c);
        }
        return res;
    }
    private static long countMem(int[] coins, int c, int v){
        if(c == 0){
            return 0;
        }
        if(v == 0){
           return 1;
        }
        if(mem[c - 1][v - 1] != -1){
            return mem[c - 1][v - 1];
        }
        long res = countMem(coins, c - 1, v);
        if(coins[c - 1] <= v){
            res += countMem(coins,  c, v - coins[c - 1]);
        }
        mem[c - 1][v - 1] = res;
        return mem[c - 1][ v- 1];
    }
}
