package DynamicProgramming;

public class MinimumRemovals {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 9, 10, 11, 12, 17, 20};
        System.out.println(remove(a, 0, a.length - 1, 2));
    }
    private static int remove(int[] a, int i, int j, int k){
        if(i >= j) return 0;
        if(a[j] - a[i] <= k) return 0;
        return 1 + Math.min(remove(a, i + 1, j, k), remove(a, i, j - 1, k));
    }
    static int[][] mem;
    private static int removeDP(int[] a, int i, int j, int K){
        if(i >= j) return 0;
        if(a[j] - a[i] <= K) return 0;
        return -1;
    }
}
