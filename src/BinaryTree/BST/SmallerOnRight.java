package BinaryTree.BST;

import java.util.TreeSet;
//IMPORTANT

/**Question --->
 * Given an array arr[] of N elements.
 * The task is to count maximum number of distinct smaller elements on right side of any array element.
 * For example, in {10, 6, 9, 7, 20, 19, 21, 18, 17, 16}, the result is 4.
 * Note that 20 has maximum 4 smaller elements on right side.
 * Other elements have less count, for example 10 has 3 smaller elements on right side.
 *
 * Input:
 * First line of input contains number of testcases T.
 * For each testcase, first line of input contains number of elements in the array and next line contains array elements.
 *
 * Output:
 * For each testcase, print the maximum count of smaller elements on right side.
 *
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N <= 105
 * 1 <= arr[i] <= 106
 *
 * Example:
 * Input:
 * 4
 * 10
 * 10 6 9 7 20 19 21 18 17 16
 * 5
 * 5 4 3 2 1
 * 5
 * 1 2 3 4 5
 * 5
 * 1 2 3 2 1
 *
 * Output:
 * 4
 * 4
 * 0
 * 2
 */
public class SmallerOnRight {
    public static void main(String[] args) {
        int[] a = {10, 6, 9, 7, 20, 19, 21, 18, 17, 16};
        System.out.println(intsmaller(a));
    }
    private static int intsmaller(int[] a){
        TreeSet<Integer> set = new TreeSet<>();
        set.add(a[a.length - 1]);
        int c = 0;
        for(int i = a.length - 2; i >= 0; i--){
            set.add(a[i]);
            if(c < set.headSet(a[i]).size()){
                c = set.headSet(a[i]).size();
            }
        }
        return c;
    }
}
