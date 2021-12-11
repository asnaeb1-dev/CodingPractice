package ArraysDS;

import java.util.Arrays;

public class MaximumCircularSumSubarray {
    public static void main(String[] args) {
        int[] a = {10,-3,-4,7,6,5,-4,-1};
        System.out.println(circularSubarraySum(a, a.length));
    }
    static int circularSubarraySum(int a[], int n) {
        int max = maximumSum(a, a.length);
        if(max < 0){
            return max;
        }
        int min = minimumSum(a, a.length);
        int totalSum = Arrays.stream(a).sum();
        return Integer.max(max, totalSum - min);
    }
    private static int maximumSum(int[] a, int n){
        int max = a[0], globalMax = a[0];
        for(int i = 1;i<n;i++){
            max = Integer.max(max + a[i], a[i]);
            globalMax = Integer.max(globalMax, max);
        }
        return globalMax;
    }

    private static int minimumSum(int[] a, int n){
        int min = a[0], globalMin = a[0];
        for(int i = 1;i<n;i++){
            min = Integer.min(a[i], min + a[i]);
            globalMin = Integer.min(min, globalMin);
        }
        return globalMin;
    }
}
