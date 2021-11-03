package ArraysDS;

import java.util.ArrayList;

public class ClosestPair {
    public static void main(String[] args) {
        int[]a = {1, 4, 5, 7};
        int[] b = {10, 20, 30, 40};
        int target = 50;
        System.out.println(closest(a, b, a.length, b.length, target));
    }
    private static ArrayList<Integer> closest(int[] a, int[] b, int n, int m, int target){
        int diff = Integer.MAX_VALUE;

        // res_l and res_r are result indexes from ar1[] and ar2[]
        // respectively
        int res_l = 0, res_r = 0;

        // Start from left side of ar1[] and right side of ar2[]
        int l = 0, r = n-1;
        while (l<m && r>=0)
        {
            // If this pair is closer to x than the previously
            // found closest, then update res_l, res_r and diff
            if (Math.abs(a[l] + b[r] - target) < diff)
            {
                res_l = l;
                res_r = r;
                diff = Math.abs(a[l] + b[r] - target);
            }

            // If sum of this pair is more than x, move to smaller
            // side
            if (a[l] + b[r] > target)
                r--;
            else  // move to the greater side
                l++;
        }
        ArrayList<Integer> al = new ArrayList<>();
        al.add(a[res_l]);
        al.add(b[res_r]);
        return al;
    }
}
