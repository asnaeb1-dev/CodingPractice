package GreedyAlgo;

import java.util.Arrays;

public class MinimumCoins {
    public static void main(String[] args) {
        int[] den ={2, 5, 1, 10};
        System.out.println(minCoins(den, 57));
    }
    private static int minCoins(int[] den, int a){
        Arrays.sort(den);
        int c = 0;
        for(int i = den.length - 1;i>=0;i--){
            if(den[i] <= a){
                int q = a /den[i];
                c += q;
                a -=(q * den[i]);
            }
        }
        return c;
    }
}
