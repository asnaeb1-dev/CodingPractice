package DynamicProgramming;

public class MinCostToFillbag {
    public static void main(String[] args) {
        int[] a = {20, 10, 4, 50, 100};
        int minCost = minCost(a, 5, a.length);
        System.out.println(minCost);
    }
    private static int minCost(int[] c, int w, int n){
        if(w <= 0 || n == 0) return 0;
        if(n - 1 > w){
            return minCost(c, w, n - 1);
        }
        return Integer.min(c[n - 1] + minCost(c, w - n - 1, n - 1), minCost(c, w, n - 1));
    }
}
