package Searching;

/**Question --->
 * Given a binary sorted non-increasing array of 1s and 0s. You need to print the count of 1s in the binary array.
 *
 * Example 1:
 *
 * Input:
 * N = 8
 * arr[] = {1,1,1,1,1,0,0,0}
 * Output: 5
 * Explanation: Number of 1's in given
 * binary array : 1 1 1 1 1 0 0 0 is 5.
 * Example 2:
 *
 * Input:
 * N = 8
 * arr[] = {1,1,0,0,0,0,0,0}
 * Output: 2
 * Explanation: Number of 1's in given
 * binary array : 1 1 0 0 0 0 0 0 is 2.
 */

/*
    EDGE CASES:
    1) when {0, 0, 0} must return 0;
    2) when {1, 1, 1} must return the length of the array
 */
public class Count1sInBinaryArray {
    public static void main(String[] args) {
        int[] a = {1, 1, 1, 1, 1, 1, 0, 0, 0};
        System.out.println(count(a, a.length));
    }
    private static int count(int[] arr, int N){
        int l = 0, r = N - 1;
        int index = -1;
        while( l <= r){
            int mid = l + r / 2;
            if(arr[mid] == 1){
                index = mid;
                while(index != arr.length  && arr[index] == 1){
                    index++;
                }
                return index;
            }else if(arr[mid] == 0){
                r = mid - 1;
            }
        }
        if(index == -1){
            return 0;
        }
        return index;
    }
}
