package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

/**
 * Given an array arr[] of size N, find the first repeating element.
 * The element should occurs more than once and the index of its first occurrence should be the smallest.
 *
 * Example 1:
 *
 * Input:
 * N = 7
 * arr[] = {1, 5, 3, 4, 3, 5, 6}
 * Output: 2
 * Explanation:
 * 5 is appearing twice and
 * its first appearence is at index 2
 * which is less than 3 whose first
 * occuring index is 3.
 *
 * Example 2:
 *
 * Input:
 * N = 4
 * arr[] = {1, 2, 3, 4}
 * Output: -1
 * Explanation:
 * All elements appear only once so
 * answer is -1.
 */

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int a[] = {1, 5, 3, 4, 3, 5, 6};
        System.out.println(checkRepeating(a, a.length));
    }
    private static int checkRepeating(int[] a, int n){
        ArrayList<Integer> temp= new ArrayList(Arrays.asList(a));
        Collections.sort(temp);
        //for(int i = 0;i<)
        return 0;
    }
}
