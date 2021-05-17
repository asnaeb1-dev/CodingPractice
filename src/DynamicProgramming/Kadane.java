package DynamicProgramming;

public class Kadane {
    public static void main(String[] args) {
        int[] a = {-9,-8,8,3,-4};
        System.out.println(maxSum(a));
    }
    private static int maxSum(int[] a){
        int sum = 0, max_sum = 0;
        for(int i = 0;i<a.length;i++){
            sum = 0;
            for(int j = i;j<a.length;j++){
                sum+=a[j];
            }
            if(sum > max_sum){
                max_sum = sum;
            }
        }
        return max_sum;
    }
}
