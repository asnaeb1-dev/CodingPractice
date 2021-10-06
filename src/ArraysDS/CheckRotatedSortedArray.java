package ArraysDS;

/**Questions
 * Given an array arr[] of N distinct integers, check if this array is Sorted (non-increasing or non-decreasing) and Rotated counter-clockwise. Note that input array may be sorted in either increasing or decreasing order, then rotated.
 * A sorted array is not considered as sorted and rotated, i.e., there should be at least one rotation.
 *
 * Example 1:
 *
 * Input:
 * N = 4
 * arr[] = {3,4,1,2}
 * Output: Yes
 * Explanation: The array is sorted
 * (1, 2, 3, 4) and rotated twice
 * (3, 4, 1, 2).
 * Example 2:
 *
 * Input:
 * N = 3
 * arr[] = {1,2,3}
 * Output: No
 * Explanation: The array is sorted
 * (1, 2, 3) is not rotated.
 */
public class CheckRotatedSortedArray {
    public static void main(String[] args) {
        int[] a = {3,4,1,2};
        System.out.println(check(a, a.length));
    }
    private static boolean check(int[] a, int n){
        int c = 0;
        //from r -> l
        for(int i = 0;i<n - 1;i++){
            if(a[i + 1] - a[i] < 0){
                c++;
            }
        }
        if(c == 1 && a[n - 1] < a[0]){
            return true;
        }

        // from l -> r
        c = 0;
        for(int i = 0;i<n - 1;i++){
            if(a[i + 1] - a[i] > 0){
                c++;
            }
        }
        //the extra condition is for test cases like -> 10, 20, 30, 14 where a[n - 1] > a[0]
        if(c == 1 && a[n - 1] > a[0]){
            return true;
        }

        return false;
    }
}
