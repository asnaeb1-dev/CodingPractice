package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumTripletProduct {
    public static void main(String[] args) {
        Long[] a = {2l, 3l, 1l, -2l, -5l};
        System.out.println(maxTripletProduct(a, a.length));
    }
    static Long maxTripletProduct(Long[] arr, int n)
    {
        long posPro = 1, negPro = 1;
        PriorityQueue<Long> pq = new PriorityQueue<>(3);
        PriorityQueue<Long> pMax = new PriorityQueue<>(3, Collections.reverseOrder());
        int i = 0;
        for(;i<3;i++){
            pq.add(arr[i]);
            pMax.add(arr[i]);
        }
        for(;i<arr.length;i++){
            if(arr[i] > pq.peek()){
                pq.remove();
                pq.add(arr[i]);
            }
            if(arr[i] < pMax.peek()){
                pMax.remove();
                pMax.add(arr[i]);
            }
        }
        long max = Long.MIN_VALUE;
        while(!pq.isEmpty()){
            if(max < pq.peek()){
                max = pq.peek();
            }
            posPro*=pq.remove();
        }
        pMax.remove();
        negPro = pMax.remove() * pMax.remove() * max;
        return Math.max(posPro, negPro);
    }
}
