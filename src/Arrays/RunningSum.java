package Arrays;

import java.util.Arrays;

/**
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 *
 * Return the running sum of nums.
 */

public class RunningSum {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 6};
        System.out.println(Arrays.toString(runningSum(a)));
    }
    private static int[] runningSum(int[] nums){
        int s = 0;
        int[] a = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            s+=nums[i];
            a[i] = s;
        }
        return a;
    }
}
