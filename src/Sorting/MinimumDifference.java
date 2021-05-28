package Sorting;

import java.util.Arrays;

/**Q
 * Given a array of size n, find the minimum difference between any pair of elements in given array.
 *
 *
 * Example 1:
 *
 * Input:
 * Arr = [2, 4, 5, 9, 7]
 * Output:
 * 1
 * Explanation: Difference between 5 and 4 is 1.
 *
 * Example 2:
 *
 * Input:
 * Arr = [3, 10, 8, 6]
 * Output:
 * 2
 * Explanation: Difference between 8 and 6 is 2.
 */
public class MinimumDifference {
    public static void main(String[] args) {
        int[] a = {2, 4, 5, 9, 7};
        System.out.println(minimumDiff(a, a.length));
    }
    public static int minimumDiff(int arr[], int n)
    {
        // code here
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for(int i = 1;i<n;i++){
            if(arr[i] - arr[i - 1] < minDiff){
                minDiff = arr[i] - arr[i - 1];
            }
        }
        return minDiff;
    }
}
