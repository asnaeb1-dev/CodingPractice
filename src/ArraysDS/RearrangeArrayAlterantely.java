package ArraysDS;
//V----> IMP

//Explanation Video - https://www.youtube.com/watch?v=ZRoVWxBngX0

import java.util.Arrays;

/**Q
 * Given a sorted array of positive integers. Your task is to rearrange  the array elements alternatively
 * i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on.
 *
 * Example 1:
 *
 * Input:
 * N = 6
 * arr[] = {1,2,3,4,5,6}
 * Output: 6 1 5 2 4 3
 * Explanation: Max element = 6, min = 1,
 * second max = 5, second min = 2, and
 * so on... Modified array is : 6 1 5 2 4 3.
 * Example 2:
 *
 * Input:
 * N = 11
 * arr[]={10,20,30,40,50,60,70,80,90,100,110}
 * Output:110 10 100 20 90 30 80 40 70 50 60
 * Explanation: Max element = 110, min = 10,
 * second max = 100, second min = 20, and
 * so on... Modified array is :
 * 110 10 100 20 90 30 80 40 70 50 60.
 * Your Task:
 * The task is to complete the function rearrange() which rearranges elements as explained above. Printing of the modified array will be handled by driver code.
 *
 * Expected Time Complexity: O(N).
 * Expected Auxiliary Space: O(1).
 */
/*LOGIC ->
    The main part of the solution is to be able to store 2 values in a single index.
    How?
        -> when index is even = a[i] = a[i] + (a[max_index] % (maxElement + 1)) * (maxElement + 1)
        -> when index is odd = a[i] = a[i] + (a[min_index] % (maxElement + 1)) * (maxElement + 1)
    The above formula enables us to store 2 values, which are:
        1) for i : a[i] % (maxElement + 1) -> returns the original index value
        2) for i : a[i] % (maxElement + 1) -> returns the desired value
 */
public class RearrangeArrayAlterantely {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60};
        rearrange(a, a.length);
        System.out.println(Arrays.toString(a));
    }
    public static void rearrange(int a[], int n){
        // Your code here
        if(n == 1) return;
        int mi = 0, mx = n - 1;

        int maxEl = a[n - 1] + 1;

        for(int i = 0;i<n;i++){
            if(i % 2 == 0){
                a[i] = a[i] + (a[mx] % maxEl) * maxEl;
                mx--;
            }else{
                a[i] = a[i] + (a[mi] % maxEl) * maxEl;
                mi++;
            }
        }

        for(int i = 0;i<n;i++){
            a[i] = a[i] / maxEl;
        }
    }
}
