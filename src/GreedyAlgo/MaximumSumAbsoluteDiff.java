package GreedyAlgo;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumSumAbsoluteDiff {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        System.out.println(absDifferenceEff(a, a.length));
    }

    //Brute force - O(nlogn) time and (n) space
    private static int absDifference(int[] a, int n){
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

        for(Integer i : a){
            min.add(i);
            max.add(i);
        }

        for(int i = 0;i<n;i+=2){
            a[i] = min.poll();
            if(i + 1 != n){
                a[i + 1] = max.poll();
            }
        }
        int s = 0;
        for(int i = 0;i<n - 1;i++){
            s+= Math.abs(a[i] - a[i + 1]);
        }
        s+= Math.abs(a[0] - a[n - 1]);
//        System.out.println(Arrays.toString(a));
        return s;
    }

    //Time - O(n log n); Space - O(1)
    private static int absDifferenceEff(int[] a, int n){
        changeArray(a, a.length);

        int sum = 0;
        for(int i = 0;i<n - 1;i++){
            sum+=Math.abs(a[i] - a[i + 1]);
        }
        sum+= Math.abs(a[0] - a[n - 1]);
        return sum;
    }
    private static void changeArray(int[] a, int n){
        Arrays.sort(a);

        int maxElement = a[n - 1] + 1;
        int min_i = 0, max_i = n - 1;
        //using formula:
        // (when i % 2 == 0) a[i] = a[i] + a[max_i] % maxElement * maxElement;
        // (when i % 2 != 0) a[i] = a[i] +a[min_i] % maxElement * maxElement;
        for(int i = 0;i<n;i++){
            if(i % 2 == 0){
                a[i] += a[max_i--] % maxElement * maxElement;
            }else{
                a[i] +=a[min_i++] % maxElement * maxElement;
            }
        }
        for(int i = 0;i<n;i++){
            a[i]/=maxElement;
        }
    }
}
