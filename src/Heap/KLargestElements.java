package Heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**Q
 * Given an array Arr of N positive integers, find K largest elements from the array.
 * The output elements should be printed in decreasing order.
 *
 * Example 1:
 *
 * Input:
 * N = 5, K = 2
 * Arr[] = {12, 5, 787, 1, 23}
 * Output: 787 23
 * Explanation: 1st largest element in the
 * array is 787 and second largest is 23.
 * Example 2:
 *
 * Input:
 * N = 7, K = 3
 * Arr[] = {1, 23, 12, 9, 30, 2, 50}
 * Output: 50 30 23
 * Explanation: 3 Largest element in the
 * array are 50, 30 and 23.
 */
public class KLargestElements {
    public static void main(String[] args) {
        int[] a = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        System.out.println(Arrays.toString(klargest(a, k)));
    }
    private static int[] klargest(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] res = new int[k];
        int i = 0;
        for(;i<k;i++){
            pq.add(i);
        }
        for(;i<arr.length;i++){
            if(arr[i] > pq.peek()){
                pq.remove();
                pq.add(arr[i]);
            }
        }
        int x = 0;
        while(!pq.isEmpty()){
            res[x] = pq.remove();
            x++;
        }
        return res;
    }
}
