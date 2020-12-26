package Arrays;

/**
 * Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.

 * Example 1:
 *
 * Input:
 * N = 5, S = 12
 * A[] = {1,2,3,7,5}
 * Output: 2 4
 * Explanation: The sum of elements
 * from 2nd position to 4th position
 * is 12.
 *
 *
 * Example 2:
 *
 * Input:
 * N = 10, S = 15
 * A[] = {1,2,3,4,5,6,7,8,9,10}
 * Output: 1 5
 * Explanation: The sum of elements
 * from 1st position to 5th position
 * is 15.
 */
public class SubarrayOfASum {
    public static void main(String[] args) {
        int[] arr = {1,4,20,3,10, 5};
        System.out.println(subArrayEff(arr, arr.length, 33));
    }

    // TIME COMPLEXITY - O(n ^ 2)
    private static String subArray(int[] a, int n, int s){
        int curr;
        for(int i = 0;i<n;i++){
            curr = a[i];
            for(int j = i + 1;j<=n;j++){
                if(curr > s || j == n){
                    break;
                }
                if(curr == s){
                    return i+1 + " "+ j;
                }
                curr+=a[j];
            }
        }
        return "";
    }

    //TIME COMPLEXITY - O(n)
    private static String subArrayEff(int[] a, int n, int sum){
        int curr = 0, k = 0;
        for(int i = 0;i<n;i++){
            curr+=a[i];
            if(curr == sum){
                return k + " " + i;
            }
            while(curr > sum){
                curr-=a[k];
                k++;
                if(curr == sum){
                    return k + " " + i;
                }
            }
        }
        return "Not possible";
    }
}
