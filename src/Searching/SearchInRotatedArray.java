package Searching;

import java.util.Arrays;
import java.util.Collections;

/**
 * Question --->
 * There is an integer array nums sorted in ascending order (with distinct values).
 *
 * Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
 * For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 *
 * Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 *
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * Example 2:
 *
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 * Example 3:
 *
 * Input: nums = [1], target = 0
 * Output: -1
 */

// * Explanation: https://stackoverflow.com/questions/4773807/searching-in-a-sorted-and-rotated-array
public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] a = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(a, 0));
    }
    private static int search(int[] a, int x){
        // What we know? -> We know that the given array is sorted, but rotated. So we have 2 halves of array.
        //Main Idea - whenever we divide a sorted + rotated array down the middle, we see that atleast one half is already sorted,
        //which makes sense. So using that logic we will try to write the code for this problem

        //initialize the values for the left and right pointer of the array
        int l = 0, r = a.length - 1;
        while(l <= r){
            int mid = (l + r)/2;
            if(a[mid] == x){
                return mid;
            }
            //if mid is not the desired element then check if the left half is sorted
            if(a[l] <= a[mid]){
                //if left half is sorted then check if the element exists within the range
                if(x >= a[l] && x <= a[mid]){
                    //if the element exists with range
                    r = mid - 1;
                }else{
                    l = mid + 1;
                }
            }else{
                //now check if the right half is sorted and repeat everything that you did in the left half of the array
                if(x >= a[mid] && x <= a[r]){
                    l = mid + 1;
                }else{
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
}
