package Heap;

import java.util.PriorityQueue;

public class PurchasingMaxItems {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(4);
        pq.add(3);
        pq.add(2);
        pq.add(6);

        System.out.println(pq.toString());
    }
}
