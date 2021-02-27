package Hashing;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**Q
 * Hashing is very useful to keep track of the frequency of the elements in a list.
 *
 * You are given an array of integers. You need to print the non-repeated elements as they appear in the array.
 *
 * Example 1:
 *
 * Input:
 * n = 10
 * arr[] = {1,1,2,2,3,3,4,5,6,7}
 * Output: 4 5 6 7
 * Explanation: 4, 5, 6 and 7 are the only
 * elements which is having only 1
 * frequency and hence, Non-repeating.
 * Example 2:
 *
 * Input:
 * n = 5
 * arr[] = {10,20,40,30,10}
 * Output: 20 40 30
 * Explanation: 20, 40, 30 are the only
 * elements which is having only 1
 * frequency and hence, Non-repeating.
 * Your Task:
 * You don't need to read input or print anything.
 * You only need to complete the function printNonRepeated() that takes arr and n as parameters and return the array which has the distinct elements in same order as they appear in input array. The newline is appended automatically by the driver code.
 *
 * Expected Time Complexity: O(n).
 * Expected Auxiliary Space: O(n).
 */
public class FindNonRepeatingElements {
    public static void main(String[] args) {
        int[] a = {1,1,2,2,3,3,4,5,6,7};
        System.out.println(printNonRepeated(a, a.length).toString());
    }
    static ArrayList<Integer> printNonRepeated(int arr[], int n)
    {
        // add your code here
        ArrayList<Integer> al = new ArrayList<>();
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }

        for(int i = 0;i<arr.length;i++){
            if(map.get(arr[i]) == 1){
                al.add(arr[i]);
            }
        }
        return al;
    }
}
