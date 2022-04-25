package DynamicProgramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] a = {6, 3, 7, 4, 6, 9};
        //int res = lisRec(a, a.length);
       // System.out.println(res);
        lis(a, a.length);
    }
    //Time complexity - O(n2)
    //this is not the best solution. just a solution which has overlapping subproblems
    private static void lis(int[] arr, int n){
        int[] l = new int[n];
        l[0] = 1;
        for(int i = 1;i<n;i++){
            for(int j = 0;j<i;j++){

                if(arr[j] <= arr[i]){
                    l[i] = Math.max(l[i], l[j] + 1);
                }
            }
        }
        System.out.println( Arrays.stream(l).max().getAsInt());
    }

    private static int lisRec(int[] a, int n){
        if(n == 1) return 1;
        int res = Integer.MIN_VALUE;
        for(int i = n - 2;i>=0;i--){
            if(a[i] <= a[n - 1]){
                int l =1 + lisRec(a, i + 1);
                res = Integer.max(l , res);
            }
        }
        return res;
    }

    private static int lisDP(int[] a, int n){
        return -1;
    }
}
