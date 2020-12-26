package Arrays;
public class SumOfSubarrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int k = 3;
        sum(a, a.length, k);
    }
    private static void sum(int[] a, int n, int lim){
        int s = 0, k = 0;
        for(int i = 0;i<n;i++){
            if(i >= lim){
                System.out.print(s+" ");
                s-=a[k];
                k++;
            }
            s+=a[i];
        }
        System.out.print(s);
    }
}
