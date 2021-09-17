package Heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KlargestInStream {
    public static void main(String[] args) {

    }
    private static ArrayList<Integer> stream(int[] arr, int n, int k){
        int x = k;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        while(i != k){
            pq.add(arr[i]);
            i++;
        }
       // while()
        return new ArrayList<>();
    }
}
