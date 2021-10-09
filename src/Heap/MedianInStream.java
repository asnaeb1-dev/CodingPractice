package Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class MedianInStream {
    public static void main(String[] args) {
        int[] a = {25, 7, 10, 15, 20};
        ArrayList<Integer> al = median(a, a.length);
        System.out.println(al.toString());
    }
    //NOTE - VERY IMPORTANT!!!!
    //solution video - https://practice.geeksforgeeks.org/tracks/DSASP-Heap/?batchId=154
    private static ArrayList<Integer> median(int[] a, int n) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(), maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(a[0]);
        ArrayList<Integer> al = new ArrayList<>();
        al.add(a[0]);
        for (int i = 1; i < n; i++) {
            int x = a[i];
            if (maxHeap.size() > minHeap.size()) {
                if (maxHeap.peek() > a[i]) {
                    minHeap.add(maxHeap.remove());
                    maxHeap.add(x);
                } else {
                    minHeap.add(x);
                }
                al.add( (minHeap.peek() + maxHeap.peek()) / 2);
            } else {
                if (x <= maxHeap.peek()) {
                    maxHeap.add(x);
                } else {
                    minHeap.add(x);
                    maxHeap.add(minHeap.remove());
                }
                al.add(maxHeap.peek());
            }
        }

        return al;
    }
}
