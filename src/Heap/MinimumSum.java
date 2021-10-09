package Heap;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class MinimumSum {
    public static void main(String[] args) {
        int[] a = {5, 3, 0, 7, 4};
        System.out.println(minSum(a, a.length));
    }
    private static String minSum(int[] arr, int n){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : arr){
            pq.add(i);
        }

        ArrayList<Integer> n1 = new ArrayList<>(), n2 = new ArrayList<>();
        while(!pq.isEmpty()){
            n1.add(pq.poll());
            if(!pq.isEmpty()){
                n2.add(pq.poll());
            }
        }
        while(n1.size() < n2.size()){
            n1.add(0, 0);
        }
        while(n2.size() < n1.size()){
            n2.add(0, 0);
        }

        int i = n1.size() - 1, rem = 0;
        while(i >= 0){
            int s = 0;
            if(rem != 0){
                s = n1.get(i) + n2.get(i) + rem;
                rem = 0;

            }else{
                s = n1.get(i) + n2.get(i);
            }

            if(s > 9){
                s = s - 10;
                rem = 1;
            }
            n1.remove(i);
            n1.add(i, s);
            i--;
        }

        if(rem != 0){
            n1.add(0, 1);
        }

        // System.out.println(n1.toString());
        int x = 0;
        while(n1.get(x) == 0){
            x++;
        }
        StringBuilder sb = new StringBuilder();

        for(;x<n1.size();x++){
            sb.append(n1.get(x));
        }

        return sb.toString();
    }
}
