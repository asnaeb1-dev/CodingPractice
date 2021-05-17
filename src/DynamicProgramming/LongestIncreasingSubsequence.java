package DynamicProgramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] a = {3, 4, 2, 8, 10, 5, 1};
        lis(a, a.length);
    }
    //Time complexity - O(n2)
    //this is not the best solution. just a solution which has overlapping subproblems
    private static void lis(int[] arr, int n){
        int[] l = new int[n];
        l[0] = 1;
        for(int i = 1;i<n;i++){
            for(int j = 0;j<i;j++){
                if(arr[j] < arr[i]){
                    l[i] = Math.max(l[i], l[j] + 1);
                }
            }
        }
        System.out.println( Arrays.stream(l).max().getAsInt());
    }
}
