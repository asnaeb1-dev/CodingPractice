package Heap;

import java.util.Arrays;

/**Q
 * Given two binary max heaps as arrays, merge the given heaps to form a new max heap.
 * Example 1:
 *
 * Input  :
 * n = 4 m = 3
 * a[] = {10, 5, 6, 2},
 * b[] = {12, 7, 9}
 * Output :
 * {12, 10, 9, 2, 5, 7, 6}
 *
 */
public class MergeTwoMaxHeap {
    public static void main(String[] args) {
        int[] a = {10, 5, 6, 2};
        int[] b = {12, 7, 9};
        int[] c = mergeHeaps(a, b, a.length, b.length);
        System.out.println(Arrays.toString(c));

    }
    public static int[] mergeHeaps(int[] a, int[] b, int n, int m) {
        // your code here
        int[] c = new int[n + m];
        int k = 0;
        for(int i = 0;i<a.length;i++, k++){
            c[k] =  a[i];
        }
        for(int i = 0;i<b.length;i++, k++){
            c[k] = b[i];
        }

        buildHeap(c, c.length);

        return c;
    }

    private static void buildHeap(int[] c, int n){
        for(int i = (n - 2)/2 ; i>=0;i--){
            maxHeapify(c, i, n);
        }
    }
    private static void maxHeapify(int[] a, int i, int n){
        int lt = 2 * i + 1;
        int rt = 2 * i + 2;
        int largest = i;
        if(lt < n && a[largest] < a[lt]){
            largest = lt;
        }
        if(rt < n && a[largest] < a[rt]){
            largest = rt;
        }
        if(largest != i){
            int t = a[largest];
            a[largest] = a[i];
            a[i] = t;

            maxHeapify(a, largest, n);
        }
    }
}
