package DynamicProgramming;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaximumSumRectangle {
    public static void main(String[] args) {
        int[][] mat = {
                {6, -5, -7, 4, -4},
                {-9, 3, -6, 5, 2},
                {-10, 4, 7, -6, 3},
                {-8, 9, -3, 3, -7}
        };
        System.out.println(maximumSum(mat, mat.length, mat[0].length));
    }
    private static int maximumSum(int[][] g, int n, int m){
        int[] temp = new int[n];
        int maxSum = Integer.MIN_VALUE;
        for(int right = 0;right<m;right++){
            Arrays.fill(temp, 0);
            for(int j = right;j<m;j++){
                for(int i = 0;i<n;i++){
                    temp[i]+=g[i][j];
                }

                int t = kadanes(temp);
                maxSum = Integer.max(t, maxSum);
            }
        }
        return maxSum;
    }
    private static int kadanes(int[] a){
        int gl = a[0], curr = a[0];
        for(int i = 1;i<a.length;i++){
            curr = Integer.max(a[i], curr+a[i]);
            gl = Integer.max(curr, gl);
        }
        return gl;
    }
}
