package Heap;

import javax.print.attribute.IntegerSyntax;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        int[] a = {1,23,12,9,30,2,50};
        int k = 3;
        //heapSort(a, a.length, k - 1);
        kLargest(a, k);
    }
    private static void heapSort(int[] a, int n, int k){
        buildMaxHeap(a, n);//step 1
        int i = n - 1;
        for(;k!= 0 && i >=1;i--, k --){
            int temp = a[0];// Step 2: swap the first element with the last element of the heap and reduce size
            a[0] = a[i];
            a[i] = temp;
            //Step 3: repeatedly maxHeapify the modified heap at the root index
            maxHeapify(a, 0, i);
            System.out.println(a[0]);
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

    private static void kLargest(int[] a, int k){
        PriorityQueue<Integer>  pq = new PriorityQueue<>();
        int i = 0;
        while(i < k){
            pq.add(a[i]);
            i++;
        }
        for(;i<a.length;i++){
            if(pq.peek() < a[i]){
                pq.remove();
                pq.add(a[i]);
            }
        }
        for(Integer x : pq){
            System.out.print(x +" ");
        }
    }
}
