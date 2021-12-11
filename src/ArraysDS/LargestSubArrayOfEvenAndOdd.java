package ArraysDS;

/**Question -->
 * You are given an array of size n.
 * Find the maximum possible length of a subarray such that
 * its elements are arranged alternately either as even and odd or odd and even .
 *
 * Example 1:
 *
 * Input:
 * n = 5
 * a[] = {10,12,14,7,8}
 * Output: 3
 * Explanation: The max length of subarray
 * is 3 and the subarray is {14 7 8}. Here
 * the array starts as an even element and
 * has odd and even elements alternately.
 * Example 2:
 *
 * Input:
 * n = 2
 * a[] = {4,6}
 * Output: 1
 * Explanation: The array contains {4 6}.
 * So, we can only choose 1 element as
 * that will be the max length subarray.
 */
public class LargestSubArrayOfEvenAndOdd {
    public static void main(String[] args) {
        int[] a = {3, 5, 6, 7, 8, 9, 11};
        System.out.println(maxEvenOdd(a, a.length));
    }
    public static int maxEvenOdd(int a[], int n){
        // your code here
        int i = 0, j = 0, maxLen = 1;
        while(j < n - 1){
            if((a[j] % 2 == 1 && a[j + 1] % 2 == 0) || (a[j] % 2 == 0 && a[j + 1] % 2 == 1)){
                j++;
                maxLen = Integer.max(maxLen, j - i + 1);
            }else{
                j = i;
                i++;
                j++;
            }
        }
        return maxLen;
    }
}
