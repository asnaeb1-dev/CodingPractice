package DynamicProgramming;

public class MaxSumSubarrayRemovingOneElement {
    public static void main(String[] args) {
        int[] a = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxSum(a, a.length));
    }
    private static int maxSum(int[] a, int n){
        int[] fw = new int[n];
        int[] bw = new int[n];
        int max = a[0];
        fw[0] = a[0];
        for(int i = 1;i<n;i++){
            max = Math.max(max + a[i], a[i]);
            //System.out.print(max + " ");
            fw[i] = max;
        }
        max = a[n - 1];
        bw[n - 1] = a[n - 1];
        for(int i = n - 2;i>=0;i--){
            max = Math.max(max + a[i], a[i]);
            bw[i] = max;
        }
//        for(int i = 0;i<n;i++){
//            System.out.print(bw[i] + " ");
//        }
        int glMax = Integer.MIN_VALUE;
        for(int i = 1;i<n - 1;i++){
            glMax = Math.max(fw[i - 1] + bw[i + 1], glMax);
        }


        return  glMax;
    }
}
