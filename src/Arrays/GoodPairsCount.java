package Arrays;

import java.util.Arrays;

/**
 * Q 1512
 * Given an array of integers nums.
 *
 * A pair (i,j) is called good if nums[i] == nums[j] and i < j.
 *
 * Return the number of good pairs.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1,1,3]
 * Output: 4
 * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 * Example 2:
 *
 * Input: nums = [1,1,1,1]
 * Output: 6
 * Explanation: Each pair in the array are good.
 * Example 3:
 *
 * Input: nums = [1,2,3]
 * Output: 0
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 */
public class GoodPairsCount {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1};
        System.out.print(count(arr));
    }
    private static int count(int[] arr){
        Arrays.sort(arr);
        int c = 0, tC = 0, el = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(el == arr[i]){
                c++;
            }else{
                tC += (c*(c - 1))/2;
                c = 1;
                el = arr[i];
            }
        }
        return tC;
    }
}
