package Searching;

/**Question
 * Given a sorted array of positive integers (elements may be repeated) and a number x.
 * The task is to find the leftmost index of x in the given array.
 *
 * Example 1:
 *
 * Input:
 * N = 10
 * arr[] = {1,1,2,2,3,4,5,5,6,7}
 * x = 1
 * Output: 0
 * Explanation: 1 is present two times
 * in the array and its leftmost index
 * is 0.
 * Example 2:
 *
 * Input:
 * N = 7
 * arr[] = {10,20,20,20,20,20,20}
 * x = 20
 * Output: 1
 * Explanation: 20 is present 5 time,
 * but its leftmost index is 1.
 */
public class LeftIndex {
    public static void main(String[] args) {
        int[] a = {5, 6, 7, 7, 7, 7, 8, 8, 9, 9};
        System.out.println(getLeftMostIndex(a, 8, a.length));
    }
    private static int getLeftMostIndex(int[] arr, int X, int N){
        int l = 0, r = N - 1;
        while(l <= r){
            int mid = (l + r)/2;
            if(X > arr[mid]){
                l = mid + 1;
            }else if(X < arr[mid]){
                r = mid - 1;
            }else{
                int index = mid;
                while(index >= 0 && arr[index] == X){
                    index --;
                }
                return index + 1;
            }
        }
        return -1;
    }
}
