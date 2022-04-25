package DynamicProgramming;

import java.util.ArrayList;

public class SubsetSumProblem {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        //ArrayList<Integer> al = new ArrayList<>();
        int b = getSubset(a, a.length, 6);
        System.out.println(b);
    }
    private static int getSubset(int[] a, int n, int target){
        if(target == 0) return 1;
        if(target < 0 || n == 0) return 0;
        int r1 = 0;
        if(a[n - 1] <= target){
            r1 = getSubset(a, n - 1, target - a[n - 1]);
        }

        return r1 + getSubset(a, n - 1, target);
    }
}
