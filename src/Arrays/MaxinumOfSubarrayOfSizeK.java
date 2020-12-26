package Arrays;

import java.util.LinkedList;
import java.util.Queue;

public class MaxinumOfSubarrayOfSizeK {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        subarray(a, a.length, 3);
    }
    //T - O(n ^ 2)
    private static void subarray(int[]a, int n, int k){
        for(int i = 0;i< n - k + 1; i++){
            int max = 0;
            for(int j = i; j< i + k;j++){
                if(a[j] > max){
                    max = a[j];
                }
            }
            System.out.print(max + " ");
        }
    }
    //T - O(n)
    private  static void subArray(int[] a, int n, int k){
        Queue<Integer> q = new LinkedList<>();
        int max = -1;
        for(int i = 0;i<n;i++){
            q.add(a[i]);
            
        }
    }
}
