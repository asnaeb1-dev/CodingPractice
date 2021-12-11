package ArraysDS;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        long[] a = {4, 0, 2, 1, 3};
        arrange(a, a.length);
    }
    static void arrange(long a[], int n){
        // your code here
        for(int i = 0;i<n;i++){
            a[i] =  (a[(int) a[i]] % n) * n + a[i];
        }
        for(int i = 0;i<n;i++){
            a[i]/=n;
        }
    }
}
