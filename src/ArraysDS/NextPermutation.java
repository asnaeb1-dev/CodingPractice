package ArraysDS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutation {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 4, 2};
        nextPermutation(a,a.length);
    }
    private static void nextPermutation(int[] a, int n){
        int k = -1;
        for(int i = n - 1;i>0;i--){
            if(a[i] > a[i - 1]){
                k = i - 1;
                break;
            }
        }
        //System.out.println(i);
        if(k == -1){
            for(int i = 0;i<n /2 ;i++){
                int t = a[i];
                a[i] = a[n - i - 1];
                a[n - i - 1] = t;
            }
            System.out.println(Arrays.toString(a));
            return;
        }
        int peak = -1;
        for(int i = k + 1;i<n;i++){
            if(a[k] < a[i]){
                peak = i;
            }
        }

        int t = a[peak];
        a[peak] = a[k];
        a[k] = t;

        int left = k + 1, right = peak, x = 0;
        for(int i = left;i<=right - left + 1;i++, x++){
            System.out.println(a[i]+ ", "+ a[right - x]);
            int temp = a[i];
            a[i] = a[right - x];
            a[right - x] = temp;
        }
        System.out.println(Arrays.toString(a));
        //Arrays.asList(a);
    }
}
