package Heap;

import java.util.Arrays;

public class KthLargest {
    public static void main(String[] args) {
        int[] a = {4, 3, 7, 6, 5};
        int k = 5;
        System.out.println(heapSort(a, a.length, k));
        System.out.println(Arrays.toString(a));
    }
    private static int heapSort(int[] a, int n, int k){
        buildMaxHeap(a, n);//step 1
        int el = -1;
        for(int i = n - 1; k != 0 && i >= 1 ;i--, k --){
            int temp = a[0];// Step 2: swap the first element with the last element of the heap and reduce size
            a[0] = a[i];
            a[i] = temp;
            el = a[i];
            //Step 3: repeatedly maxHeapify the modified heap at the root index
            maxHeapify(a, 0, i);
        }
        if(k != 0){
            return a[0];
        }
        return el;
    }

    private static void maxHeapify(int[] a, int i, int size) {
        int lt = 2 * i + 1;
        int rt = 2 * i + 2;
        int largest = i;
        if(lt < size && a[lt] > a[largest]){
            largest = lt;
        }

        if(rt < size && a[rt] > a[largest]){
            largest = rt;
        }

        if(largest != i){
            int temp = a[largest];
            a[largest] = a[i];
            a[i] = temp;

            maxHeapify(a, largest, size);
        }
    }

    private static void buildMaxHeap(int[] a, int size) {
        for(int i = (size - 2) / 2; i>=0;i--){
            maxHeapify(a, i, size);
        }
    }
}
