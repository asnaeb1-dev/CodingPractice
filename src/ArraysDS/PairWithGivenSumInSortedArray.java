package ArraysDS;

import java.io.IOException;

public class PairWithGivenSumInSortedArray {
    public static void main (String[] args)throws IOException
    {
        //code
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        pairSum(a, a.length, 8);
    }
    private static void pairSum(int a[], int n, int s){
        if(a[0] + a[n-1] < s){
            System.out.println(-1);
            return;
        }
        for(int i = 0;i<n/2;i++){
            if(a[i] + a[(n-1) - i] == s){
                System.out.println(a[i] + " " + a[(n-1) - i] + " " + s);
            }
        }
    }
}
