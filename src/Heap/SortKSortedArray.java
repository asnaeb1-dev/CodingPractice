package Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class SortKSortedArray {
    private static void sort(int[] arr, int k, int n){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0;i<=k;i++){
            pq.add(arr[i]);
        }
        int ind = 0;
        for(int i = k + 1;i<n;i++){
            arr[ind] = pq.poll();
            ind++;
            pq.add(arr[i]);
        }

        while(!pq.isEmpty()){
            arr[ind]= pq.poll();
            ind++;
        }
    }

    public static void main(String[] args) {
        int[] a = {9, 8, 7, 19, 18};
        sort(a, 2, a.length);
        System.out.println(Arrays.toString(a));
    }
}
