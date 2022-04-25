package ArraysDS;

/**IMPORTANT */

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[] a = {6, -9, -10, -8};
        System.out.println(getMax(a, a.length));
    }
    private static int getMax(int[] a, int n){
        int max_curr = a[0], max_gl = a[0];
        int start = 0;
        for(int i = 1;i<n;i++){
            max_curr = Math.max(a[i], max_curr + a[i]);
            max_gl = Math.max(max_curr, max_gl);
        }
        return max_gl;
    }
}
