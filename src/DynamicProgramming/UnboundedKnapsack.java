package DynamicProgramming;

import java.util.Arrays;

public class UnboundedKnapsack {
    static int[] mem;

    public static void main(String[] args) {
        int[] w = {1, 3, 4, 5};
        int[] v = {1, 4, 5, 7};
        int W = 8;
//        System.out.println(unbounded(w, v, W, w.length));
        mem = new int[W + 1];
        Arrays.fill(mem, -1);
        unboundedMem(w, v, W, w.length);
        System.out.println(mem[W]);
    }
    private static int unbounded(int[] w, int[] v, int W, int n){
        if(W == 0) return 0;
        int profit = 0;
        for(int i = 0;i<n;i++){
            if(w[i] <= W){
                int d = v[i] + unbounded(w, v, W - w[i], n);
                if(d != 0){
                    profit = Integer.max(d, profit);
                }
            }
        }
        return profit;
    }
    private static int unboundedMem(int[] w, int[] v, int W, int n){
        if(W == 0) return 0;
        if(mem[W] != -1) return mem[W];
        int profit = 0;
        for(int i = 0;i<n;i++){
            if(w[i] <= W){
                int d = v[i] + unboundedMem(w, v, W - w[i], n);
                profit = Integer.max(d, profit);
                mem[W] = profit;
            }
        }
        return profit;
    }
}
