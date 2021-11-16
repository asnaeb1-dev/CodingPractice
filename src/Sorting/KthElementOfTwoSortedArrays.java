package Sorting;

import java.util.Arrays;

/**Question --->
 * Given two sorted arrays arr1 and arr2 of size N and M respectively and an element K.
 * The task is to find the element that would be at the k’th position of the final sorted array.
 *
 *
 * Example 1:
 *
 * Input:
 * arr1[] = {2, 3, 6, 7, 9}
 * arr2[] = {1, 4, 8, 10}
 * k = 5
 * Output:
 * 6
 * Explanation:
 * The final sorted array would be -
 * 1, 2, 3, 4, 6, 7, 8, 9, 10
 * The 5th element of this array is 6.
 * Example 2:
 * Input:
 * arr1[] = {100, 112, 256, 349, 770}
 * arr2[] = {72, 86, 113, 119, 265, 445, 892}
 * k = 7
 * Output:
 * 256
 * Explanation:
 * Final sorted array is - 72, 86, 100, 112,
 * 113, 119, 256, 265, 349, 445, 770, 892
 * 7th element of this array is 256.
 */
public class KthElementOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {2, 3, 6, 7, 9};
        int[] b = {1, 4, 8, 10};
        System.out.println(kthElement(a, b, a.length, b.length, 4));
    }
    private static int kthElement(int[] a, int[]b, int n, int m, int k){
        int i = n - 1, j = 0;
        while(i != -1 && j != m){
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
        if(k <= n){
            return a[k - 1];
        }
        return b[k - 1 - n];
    }
}
