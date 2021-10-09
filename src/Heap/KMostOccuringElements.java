package Heap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**Q
 * Given an array arr[] of N integers in which elements may be repeating several times.
 * Also, a positive number K is given and the task is to find sum of total frequencies of K most occurring elements
 *
 * Note: The value of K is guaranteed to be less than or equal to the number of distinct elements in arr.
 *
 * Example 1:
 *
 * Input:
 * N = 8
 * arr[] = {3,1,4,4,5,2,6,1}
 * K = 2
 * Output: 4
 * Explanation: Since, 4 and 1 are 2 most
 * occurring elements in the array with
 * their frequencies as 2, 2. So total
 * frequency is 2 + 2 = 4.
 * Example 2:
 *
 * Input:
 * N = 8
 * arr[] = {3,3,3,4,1,1,6,1}
 * K = 2
 * Output: 6
 * Explanation: Since, 3 and 1 are most
 * occurring elements in the array with
 * frequencies 3, 3 respectively. So,
 * total frequency is 6.
 */
public class KMostOccuringElements {
    public static void main(String[] args) {
        int[] a = {3,3,3,4,1,1,6,1};
        int k = 2;
        System.out.println(kMost(a, k, a.length));
    }
    private static int kMost(int[] arr, int k, int n){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }

        for(Map.Entry <Integer, Integer> entry : map.entrySet()){
            pq.add(entry.getValue());
        }

        int s = 0;
        while(k != 0 && !pq.isEmpty()){
            s+=pq.poll();
            k--;
        }
        return s;
    }
}
