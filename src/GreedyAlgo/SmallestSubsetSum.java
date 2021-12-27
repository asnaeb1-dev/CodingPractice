package GreedyAlgo;

import java.util.Arrays;

/**
 * Question --->
 * Given an array of non-negative integers.
 * Our task is to find minimum number of elements such that their sum should be greater than the sum of rest of the elements of the array.
 * Examples :
 *
 *
 * Input : arr[] = {3, 1, 7, 1}
 * Output : 1
 * Smallest subset is {7}. Sum of
 * this subset is greater than all
 * other elements {3, 1, 1}
 *
 * Input : arr[] = {2, 1, 2}
 * Output : 2
 * In this example one element is not
 * enough. We can pick elements with
 * values 1, 2 or 2, 2. In any case,
 * the minimum count is 2.
 */
public class SmallestSubsetSum {
    public static void main(String[] args) {
        int[] a = {2, 2, 1};
        System.out.println(minimumSum(a, a.length));
    }
    private static int minimumSum(int[] a, int n){
        Arrays.sort(a);
        int currSum = 0, sum = Arrays.stream(a).sum(), c = 0;
        for(int i = n - 1;i>=0;i--){
            currSum+=a[i];
            c++;
            if(currSum > sum - currSum){
                return c;
            }
        }
        return c;
    }
}
