package Sorting;

import java.util.Arrays;
//Explanation video - https://www.youtube.com/watch?v=1S4KFg5viC0
/**Question -->
 * Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order.
 * Merge them in sorted order without using any extra space.
 * Modify arr1 so that it contains the first N elements and modify arr2 so that it contains the last M elements.
 *
 * Example 1:
 *
 * Input:
 * n = 4, arr1[] = [1 3 5 7]
 * m = 5, arr2[] = [0 2 6 8 9]
 * Output:
 * arr1[] = [0 1 2 3]
 * arr2[] = [5 6 7 8 9]
 * Explanation:
 * After merging the two
 * non-decreasing arrays, we get,
 * 0 1 2 3 5 6 7 8 9.
 * Example 2:
 *
 * Input:
 * n = 2, arr1[] = [10, 12]
 * m = 3, arr2[] = [5 18 20]
 * Output:
 * arr1[] = [5 10]
 * arr2[] = [12 18 20]
 * Explanation:
 * After merging two sorted arrays
 * we get 5 10 12 18 20.
 *
 *
 *
 *
 * Expected Time Complexity:  O((n+m) log(n+m))
 * Expected Auxilliary Space: O(1)
 */
public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8};
        merge(a, b, a.length, b.length);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
    private static void merge(int[] a, int[] b, int n, int m){
        int i = n - 1, j = 0;
        while(i != -1 && j != m){
            if(a[i] > b[j]){
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
            }
            i--;
            j++;
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
