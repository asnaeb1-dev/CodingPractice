package DynamicProgramming;

public class SmallestSumContigousSubarray {
    public static void main(String[] args) {
        int[] a = {2, 6, 8, 1, 4};
        System.out.println(sum(a, a.length));
    }
    private static int sum(int[] a, int n){
        int min = a[0], globalMin = a[0];
        for(int i = 0;i<n;i++){
            min = Math.min(min + a[i], a[i]);
            globalMin = Math.min(min, globalMin);
        }
        return globalMin;
    }
}
