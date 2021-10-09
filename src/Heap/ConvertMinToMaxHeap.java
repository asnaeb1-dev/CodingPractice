package Heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class ConvertMinToMaxHeap {
    public static void main(String[] args) {
        int[] a = {3, 5, 9, 6, 8, 20, 10, 12, 18, 9};
        //int[] ret = toMaxHeap(a, a.length);
        toMax(a, a.length);
        System.out.println(Arrays.toString(a));
    }
    private static int[] toMaxHeap(int[] a, int n){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : a){
            pq.add(i);
        }
        for(int i =0;i<n;i++){
            a[i] = pq.poll();
        }
        return a;
    }

    private static void toMax(int[] a, int n){
        for(int i = (n - 2)/ 2;i>=0;i--){
            maxHeapify(i, n, a);
        }
    }

    private static void maxHeapify(int i, int s, int[] a ){
        int left = 2 *  i + 1;
        int right = 2 * i + 2;
        int largest = i;
        if(left < s && a[left] > a[largest]){
            largest = left;
        }
        if(right < s && a[right] > a[largest]){
            largest = right;
        }

        if(largest != i){
            int t = a[largest];
            a[largest] = a[i];
            a[i] = t;
            maxHeapify(largest, s, a);
        }
    }
}
