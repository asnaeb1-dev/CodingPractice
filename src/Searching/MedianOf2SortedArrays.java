package Searching;

import java.util.Arrays;

public class MedianOf2SortedArrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {3,4,5,6,7,8};

        System.out.println(median(a, b, a.length, b.length));
    }
    private static int median(int[] a, int[] b, int n, int m){
        /**
         * {1,2,3,4,5}
         * {3,4,5,6,7,8}
         */
        int i = n - 1, j = 0;
        while(i != 0 && j != m){
            if(a[i] > b[j]){
                int t = a[i];
                a[i] = b[j];
                b[j] = t;
            }
            i--;
            j++;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int totalLength = n + m;
        int t = totalLength /2;
        if(totalLength % 2 == 0){
            if(t > n - 1){
                return b[t - n];
            }
            return a[t];
        }else{
            int t1 = (totalLength + 1) /2;
            int el1 = -1;
            if(t > n - 1){
                el1 = b[t - n];
            }else{
                el1 = a[t];
            }
            int el2 = -1;
            if(t1 > n - 1){
                el2 = b[t1 - n];
            }else{
                el2 = a[t1];
            }

            return (el1 + el2)/2;
        }
    }
}
