package ArraysDS;

import java.util.Arrays;

/**
 * Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array and return it. In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5..... (considering the increasing lexicographical order).
 *
 * Example 1:
 *
 * Input:
 * N = 5
 * arr[] = {1,2,3,4,5}
 * Output: 2 1 4 3 5
 * Explanation: Array elements after
 * sorting it in wave form are
 * 2 1 4 3 5.
 *
 * Example 2:
 *
 * Input:
 * N = 6
 * arr[] = {2,4,7,8,9,10}
 * Output: 4 2 8 7 10 9
 * Explanation: Array elements after
 * sorting it in wave form are
 * 4 2 8 7 10 9.
 */

public class WaveArray {
    public static void main(String[] args) {
        int[] a = {2,4,7,8,9,10};
        System.out.println(Arrays.toString(waveArr(a, a.length)));
    }
    private static int[] waveArr(int[] a, int n){
        for(int i = 0;i<n - 1;i+=2){
            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
        }
        return a;
    }
}
