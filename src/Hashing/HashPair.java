package Hashing;

import java.util.LinkedHashMap;

/**Question
 * You are given an array of distinct integers and a sum. Check if there's a pair with the given sum in the array.
 *
 * Example 1:
 *
 * Input:
 * N = 10
 * arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
 * sum = 14
 * Output:
 * 1
 *
 * Explanation:
 * arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
 * and sum = 14.  There is a pair {4, 10}
 * with sum 14.
 * Example 2:
 *
 * Input:
 * N = 2
 * arr[] = {2, 5}
 * sum = 10
 * Output:
 * 0
 *
 * Explanation:
 * arr[]  = {2, 5} and sum = 10.
 * There is no pair with sum 10.
 */

public class HashPair {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        System.out.println(hashPair(a, a.length, 5));
    }
    private static boolean hashPair(int[] arr, int N, int sum){
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int i = 0;i<N;i++){
            map.put(arr[i], 1);
        }

        for(int i = 0;i<N;i++){
            if(map.containsKey(sum - arr[i]) && arr[i] != (sum - arr[i])){
                return true;
            }
        }
        return false;
    }
}
