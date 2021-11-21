package Sorting;

import java.util.Arrays;

/**Question -->
 * Given an unsorted array arr[] of n positive integers.
 * Find the number of triangles that can be formed with three different array elements as lengths of three sides of triangles.
 *
 * Example 1:
 *
 * Input:
 * n = 3
 * arr[] = {3, 5, 4}
 * Output:
 * 1
 * Explanation:
 * A triangle is possible
 * with all the elements 5, 3 and 4.
 * Example 2:
 *
 * Input:
 * n = 5
 * arr[] = {6, 4, 9, 7, 8}
 * Output:
 * 10
 * Explanation:
 * There are 10 triangles
 * possible  with the given elements like
 * (6,4,9), (6,7,8),...
 */
public class CountPossibleTriangle {
    public static void main(String[] args) {
        int[] a = {4, 3, 5};
        System.out.println(findNumberOfTriangles(a, a.length));
    }
    static int findNumberOfTriangles(int arr[], int n){
        // code here
        Arrays.sort(arr);
        int count = 0;
        for(int c = n - 1;c>=2;c--){
            int a = 0, b = c - 1;
            while(a != b){
                if(arr[a] + arr[b] > arr[c]){
                    count+=(b - a);
                    b--;
                }else{
                    a++;
                }
            }
        }
        return count;
    }
}
