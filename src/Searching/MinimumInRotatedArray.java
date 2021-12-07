package Searching;
/**
/**Question -->
 * Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
 * For example, the array nums = [0,1,2,4,5,6,7] might become:
 *
 * [4,5,6,7,0,1,2] if it was rotated 4 times.
 * [0,1,2,4,5,6,7] if it was rotated 7 times.
 * Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
 *
 * Given the sorted rotated array nums of unique elements, return the minimum element of this array.
 *
 * You must write an algorithm that runs in O(log n) time.
 *
 * Example 1:
 *
 * Input: nums = [3,4,5,1,2]
 * Output: 1
 * Explanation: The original array was [1,2,3,4,5] rotated 3 times.
 * Example 2:
 *
 * Input: nums = [4,5,6,7,0,1,2]
 * Output: 0
 * Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
 * Example 3:
 *
 * Input: nums = [11,13,15,17]
 * Output: 11
 * Explanation: The original array was [11,13,15,17] and it was rotated 4 times.
 */

/**Explanation
 * https://www.youtube.com/watch?v=IzHR_U8Ly6c
 */
public class MinimumInRotatedArray {
    public static void main(String[] args) {
        int[]a = {5, 1, 2, 3, 4};
        System.out.println(search(a, a.length));
    }
    private static int search(int[] a, int n){
        int l = 0, r = n - 1;
        while(l <= r){
            int mid = l + (r - l)/2;
            if(mid == 0){
                if(a[mid] < a[mid + 1]){
                    return a[mid];
                }
            }
            if(mid == n - 1){
                if(a[mid] < a[mid - 1]){
                    return a[mid];
                }
            }
            if(a[mid] < a[mid + 1] && a[mid] < a[mid - 1]){
                return a[mid];
            }else if(a[l] < a[mid] && a[mid] < a[r]){
                return a[l];
            }else if(a[l] <= a[mid]){
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
