package Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumOfSubarrayOfSizeK {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        ArrayList<Integer> al = maxOfSubarrays(a, a.length, 3);
        System.out.println(al.toString());
    }
    static ArrayList<Integer> maxOfSubarrays(int arr[], int n, int k){
        // Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, Collections.reverseOrder());
        ArrayList <Integer> al = new ArrayList<>();
        int i = 0;
        for(;i<k;i++){
            pq.add(arr[i]);
        }
        al.add(pq.peek());
        pq.remove(arr[0]);
        for(;i<n;i++){
            pq.add(arr[i]);
            al.add(pq.peek());
            pq.remove(arr[i - k + 1]);
        }
        return al;
    }
}
