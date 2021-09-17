package Heap;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] a = {3, 5, 4, 2, 9};
        heapSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }

    private static void heapSort(int[] a, int n){
        buildMaxHeap(a, n);//step 1
        for(int i = n - 1;i >=1;i--){
            int temp = a[0];// Step 2: swap the first element with the last element of the heap and reduce size
            a[0] = a[i];
            a[i] = temp;
            //Step 3: repeatedly maxHeapify the modified heap at the root index
            maxHeapify(a, 0, i);
        }
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
