package ArraysDS;

import java.util.ArrayList;
import java.util.Collections;

/**Question  -->
 * Given an array A of positive integers.
 * Your task is to find the leaders in the array.
 * An element of array is leader if it is greater than or equal to all the elements to its right side.
 * The rightmost element is always a leader.
 *
 * Example 1:
 *
 * Input:
 * n = 6
 * A[] = {16,17,4,3,5,2}
 * Output: 17 5 2
 * Explanation: The first leader is 17
 * as it is greater than all the elements
 * to its right.  Similarly, the next
 * leader is 5. The right most element
 * is always a leader so it is also
 * included.
 */
public class LeaderInArray {
    public static void main(String[] args) {
        int[] a = {5, 5, 1, 2, 3};
        System.out.println(leaders(a, a.length).toString());
    }

    static ArrayList<Integer> leaders(int a[], int n){
        // Your code here
        ArrayList<Integer> al = new ArrayList<>();
        int currLeader = a[n - 1];
        al.add(currLeader);
        for(int i = n - 2;i>=0;i--){
            if(a[i] >= currLeader){
                currLeader = a[i];
                al.add(currLeader);
            }
        }
        Collections.reverse(al);
        return al;
    }
}
