package Heap;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class SumOfMinMax {
    public static void main(String[] args) {
        int[] a = {2, 5, -1, 7, -3, -1, -2};
        System.out.println(maxMinSum(a, 3, a.length));
    }
    private static int maxMinSum(int[] a, int k, int n){
        PriorityQueue<Integer> pMax = new PriorityQueue<>(k, Collections.reverseOrder());
        PriorityQueue<Integer> pMin = new PriorityQueue<>(k);
        int i = 0;
        for(;i<k;i++){
            pMax.add(a[i]);
            pMin.add(a[i]);
        }

        int totalSum = 0;
        for(;i<n;i++){
            int currSum = pMax.peek() + pMin.peek();
            System.out.println(currSum);
            totalSum+=currSum;
            pMax.remove(a[i - k]);
            pMax.add(a[i]);
            pMin.remove(a[i - k]);
            pMin.add(a[i]);
        }
        totalSum += (pMax.peek() + pMin.peek());
        return totalSum;
    }
}
