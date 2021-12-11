import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
    public static void main(String[] args) {
        int[] a = {8, -8, 9, -9, 10, -11, 12};
        int maxSum = maximumSum(a, a.length);
        int arrSum = Arrays.stream(a).sum();
        int circularSum = arrSum - minimumSum(a, a.length);
        System.out.println(Integer.max(circularSum, maxSum));
    }
    private static int minimumSum(int[] a, int n){
        int min = a[0], globalMin = a[0];
        for(int i = 1;i<n;i++){
            min = Integer.min(a[i], min + a[i]);
            globalMin = Integer.min(min, globalMin);
        }
        return globalMin;
    }

    private static int maximumSum(int[] a, int n){
        int max = a[0], globalMax = a[0];
        for(int i = 1;i<n;i++){
            max = Integer.max(max + a[i], a[i]);
            globalMax = Integer.max(globalMax, max);
        }
        return globalMax;
    }
}
