package ArraysDS;

/**Q
 * Given a sorted array containing only 0s and 1s, find the transition point.
 *
 *
 * Example 1:
 *
 * Input:
 * N = 5
 * arr[] = {0,0,0,1,1}
 * Output: 3
 * Explanation: index 3 is the transition
 * point where 1 begins.
 *
 * Example 2:
 *
 * Input:
 * N = 4
 * arr[] = {0,0,0,0}
 * Output: -1
 * Explanation: Since, there is no "1",
 * the answer is -1.
 */

public class TransitionElement {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0};
        System.out.println(transitionPoint(arr, arr.length));
    }
    private static int transitionPoint(int arr[], int n) {
        // code here
        if(arr.length == 1){
            if(arr[0] == 1){
                return 0;
            }
            return -1;
        }
        for(int i = 0;i<n;i++){
            if(arr[i] == 1){
                return i;
            }
        }
        return -1;
    }

    //Time - O(log n)
    private static int transPointBS(int[] arr, int n){
        int l = 0, r = n - 1;
        int mid = 0;
        while(l <= r){
            mid = (l + r)/2;
            if(arr[mid] == 1 && (mid - 1 < 0 || arr[mid - 1] == 0)){
                return mid;
            }
            if(arr[mid] == 1){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return -1;
    }
}
