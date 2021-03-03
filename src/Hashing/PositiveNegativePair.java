package Hashing;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**QUESTION
 * Given an array of distinct integers, find all the pairs having both negative and positive values of a number in the array.
 *
 * Example 1:
 *
 * Input:
 * N = 8
 * arr[] = {1,3,6,-2,-1,-3,2,7}
 * Output: -1 1 -3 3 -2 2
 * Explanation: 1, 3 and 2 are present
 * pairwirse postive and negative. 6 and
 * 7 have no pair.
 *
 *
 * Example 2:
 *
 * Input:
 * N = 3
 * arr[] = {3,2,1}
 * Output: 0
 * Explanation: No such pair exists so the
 * output is 0.
 */

public class PositiveNegativePair {
    public static void main(String[] args) {
        int[] a = {1, 2, -1, 3, -3, 4, -2, -4};
        System.out.println(findPairs(a, a.length).toString());
    }
    public static ArrayList<Integer> findPairs(int arr[], int n)
    {
        // code here.
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0;i<n;i++){
            if(map.containsKey(Math.abs(arr[i]))){
                al.add(-1 * Math.abs(arr[i]));
                al.add(Math.abs(arr[i]));
            }else{
                map.put(Math.abs(arr[i]), 1);
            }
        }
        if(al.size() == 0){
            al.add(0);
        }
        return al;
    }
}
