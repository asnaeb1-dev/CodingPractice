package DynamicProgramming;

import java.util.Arrays;

public class Zero_One_Knapsack {

    static int[] mem;

    //using recursion
    private static int knapsack(int[] w, int[] v, int n, int W){
        if(n == 0 || W == 0){
            return 0;
        }
        if(w[n - 1] > W){
            return knapsack(w, v, n - 1, W - w[n - 1]);
        }
        return Math.max(v[n - 1] + knapsack(w, v, n - 1, W- w[n - 1]), knapsack(w, v, n - 1 , W));
    }



    public static void main(String[] args) {
        int[] w = {10, 20, 30};
        int[] v = {60, 100, 120};
        int W = 50;
        //System.out.println(knapsack(w, v, w.length, W));
        mem = new int[w.length];
        Arrays.fill(mem, -1);
    }
}
