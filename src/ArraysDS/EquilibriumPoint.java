package ArraysDS;

import java.util.Arrays;

/**Question
 * Given an array A of n positive numbers. The task is to find the first Equilibium Point in the array.
 * Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.
 *
 * Example 1:
 *
 * Input:
 * n = 5
 * A[] = {1,3,5,2,2}
 * Output: 3
 * Explanation: For second test case
 * equilibrium point is at position 3
 * as elements before it (1+3) =
 * elements after it (2+2).
 *
 *
 * Example 2:
 *
 * Input:
 * n = 1
 * A[] = {1}
 * Output: 1
 * Explanation:
 * Since its the only element hence
 * its the only equilibrium point.
 */

public class EquilibriumPoint {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 2, 2};
        System.out.println(equilibrium(a, a.length));
    }
    private static int equilibrium(int[] a, int n){
        int sum = Arrays.stream(a).sum();
        int leftSum = a[0];
        for(int i = 1;i<n;i++){
            if(leftSum == (sum - leftSum - a[i])){
                return i + 1;
            }
            leftSum+=a[i];
        }
        return -1;
    }
}
