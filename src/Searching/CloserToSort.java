package Searching;

/**Question -->
 * Given an array arr[](0-based indexing) of N integers which is closer sorted (defined below) and an element x.
 * The task is to find the index of element x if it is present. If not present, then print -1.
 * Closer Sorted: The first array is sorted, but after sorting some elements are moved to either of the adjacent positions,
 * i.e, maybe to the arr[i+1] or arr[i-1].
 *
 * Example 1:
 *
 * Input: N = 5, A[] = [3 2 10 4 40], x = 2
 * Output: 1
 * Explanation: 2 is present at index 1
 * (0-based indexing) in the given array.
 * Example 2:
 *
 * Input: N = 4, A[] = [2 1 4 3], x = 5
 * Output: -1
 * Explanation:
 * 5 is not in the array so the output will
 * be -1.
 */
public class CloserToSort {
    public static void main(String[] args) {
        int[] a = {2, 1, 4, 3};
        int x = 3;
        System.out.println(find(a, a.length, x));
    }

    /**
     *Idea used here is :
     * 1) we have to look for the element using binary search
     * 2) look for the element in the mid, mid + 1, mid - 1
     * 3) if the element is greater than mid and mid + 1 then it exists on the rhs
     * else on the lhs
     */
    private static int find(int[] a, int n, int x){
        int l = 0, r = n - 1;
        while(l <= r){
            int mid = l + (r - l)/ 2;
            if(a[mid] == x){
                return mid;
            }else if(mid != 0 && a[mid - 1] == x){
                return mid - 1;
            }else if(mid != n - 1 && a[mid + 1] == x){
                return mid + 1;
            }else if(x > a[mid]){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return -1;
    }
}
