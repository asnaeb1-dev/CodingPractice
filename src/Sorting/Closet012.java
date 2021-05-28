package Sorting;

import java.util.Arrays;

/**Question ->
 * Given an array of 0s, 1s, and 2s.
 * Arrange the array elements such that all 0s come first, followed by all the 1s and then, all the 2s.
 *
 * Note: Do not use the inbuilt sort function.
 *
 * Example 1:
 *
 * Input: N = 5, arr[] = {0, 2, 1, 2, 0}
 * Output: 0 0 1 2 2
 * Example 2:
 *
 * Input: N = 3, arr[] = {0, 1, 0}
 * Output: 0 0 1
 */
public class Closet012 {
    public static void main(String[] args) {
        int[] a = {0, 1, 0, 0, 1, 2, 2, 0, 1, 2, 1, 0, 1, 2};
        segragate012(a, a.length);
        System.out.println(Arrays.toString(a));
    }
    public static void segragate012(int arr[], int N){
        // Your Code Here
        int c0 = 0, c1 = 0, c2 = 0;
        for(int i : arr){
            if(i == 0){
                c0++;
            }else if(i == 1){
                c1++;
            }else{
                c2++;
            }
        }
        int k = 0;
        while(c0!=0){
            arr[k] = 0;
            c0--;
            k++;
        }
        while(c1 != 0){
            arr[k] = 1;
            c1--;
            k++;
        }
        while(c2 != 0){
            arr[k] = 2;
            c2--;
            k++;
        }
    }
}
