package Heap;

import java.util.Arrays;

public class MinHeaptoMaxHeap {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        buildHeap(a, a.length);

        System.out.println(Arrays.toString(a));
    }
    private static void buildHeap(int[] a, int n){
        int start = (n - 2) / 2;
        for(int i = start;i>=0;i--){
            heapify(a, i, n);
        }
    }
    private static void heapify(int[] a, int i, int n){
        int lt = 2 * i + 1;
        int rt = 2 * i + 2;

        int max = i;
        if(lt <n && a[lt] > a[max]){
            max = lt;
        }
        if(rt < n && a[rt] > a[max]){
            max = rt;
        }

        if(max != i){
            int t = a[max];
            a[max] = a[i];
            a[i] = t;

            heapify(a, max, n);
        }
    }
}
