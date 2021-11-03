package ArraysDS;

import java.util.Arrays;

/*Explanation
  https://www.youtube.com/watch?v=gREVHiZjXeQ
 */

/**Question -->
 * Given an integer array nums.
 * Return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * Example 2:
 *
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 *
 *
 * Constraints:
 *
 * 2 <= nums.length <= 105
 * -30 <= nums[i] <= 30
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 *
 *
 * Follow up: Can you solve the problem in O(1) extra space complexity?
 * (The output array does not count as extra space for space complexity analysis.)
 */
public class ProductArrayExceptSelf {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        System.out.println(Arrays.toString(product(a)));
    }
    private static int[] product(int[] a){
        int[] r = new int[a.length];
        int p = 1;
        for(int i = 0;i<a.length;i++){
            p = p * a[i];
            r[i] = p;
        }
        //r = {1, 2, 6, 24}

        int product = 1;
        //p = 4
        //a = {1, 2, 3, 4}
        //r = {1, 2, 6, 6}
        for(int i = a.length - 1;i>0;i--){
            r[i] = product * r[i - 1];
            product *= a[i];
        }
        r[0] = product;
        return r;
    }
}
