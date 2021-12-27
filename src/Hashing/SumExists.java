package Hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Q
 * https://practice.geeksforgeeks.org/problems/hashing-for-pair-2/1/?track=DSASP-Hashing&batchId=154#
 *
 * You are given an array of integers and an integer sum.
 * You need to find if two numbers in the array exists that have sum equal to the given sum.
 *
 * Example 1:
 *
 * Input:
 * N = 10
 * arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
 * sum = 14
 *
 * Output:
 * 1
 *
 * Explanation:
 * there exists a pair which
 * gives sum as 14 example
 * (4,10),(5,9) etc.
 */
public class SumExists {
    public static void main(String[] args) {
        int[] a = {2, 3, 9, 6, 5};
        int sum = 10;
        System.out.println(sumExists(a, a.length, sum));
    }
    public static int sumExists(int arr[], int N, int sum) {
        // Your code here
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i, 1);
            }
        }

        for(int i : arr){
            if(map.containsKey(sum - i)){
                if(i == sum - i && map.get(i) > 1){
                    return 1;
                }else if(i != sum - i){
                    return 1;
                }
            }
        }
        return 0;
    }
}
