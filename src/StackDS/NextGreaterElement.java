package StackDS;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Stack;

/**
 * Given an array arr[ ] of size N having distinct elements, the task is to find the next greater element for each element of the array in order of their appearance in the array.
 * Next greater element of an element in the array is the nearest element on the right which is greater than the current element.
 * If there does not exist next greater of current element, then next greater element for current element is -1. For example, next greater of the last element is always -1.
 *
 * Example 1:
 *
 * Input:
 * N = 4, arr[] = [1 3 2 4]
 * Output:
 * 3 4 4 -1
 * Explanation:
 * In the array, the next larger element
 * to 1 is 3 , 3 is 4 , 2 is 4 and for 4 ?
 * since it doesn't exist, it is -1.
 * Example 2:
 *
 * Input:
 * N = 5, arr[] [6 8 0 1 3]
 * Output:
 * 8 -1 1 3 -1
 * Explanation:
 * In the array, the next larger element to
 * 6 is 8, for 8 there is no larger elements
 * hence it is -1, for 0 it is 1 , for 1 it
 * is 3 and then for 3 there is no larger
 * element on right and hence -1.
 */
public class NextGreaterElement {
    public static void main(String[] args) {
        long[] a = {6L, 8L, 0L, 1L, 3L};
        long[] r = nextGreater(a, a.length);
        System.out.println(Arrays.toString(r));
    }
    //naive - O(n ^ 2)
    private static void find(int[] a){
        for(int i = 0;i< a.length; i++){
            int j = i + 1;
            for(;j<a.length;j++){
                if(a[j] > a[i]){
                    System.out.print(a[j] + " ");
                    break;
                }
            }
            if(j == a.length){
                System.out.print(-1 +" ");
            }
        }
    }
    private static long[] nextGreater(long[] a, int n){
        long[] r = new long[n];
        Stack<Integer> s = new Stack<>();
        s.push(n - 1);
        r[n - 1] = -1;
        for(int i = n - 2;i>=0;i--){
            while(!s.empty() && a[s.peek()] < a[i]){
                s.pop();
            }
            if(s.empty()){
                r[i] = -1;
            }else{
                r[i] = (int) a[s.peek()];
            }
            s.push(i);
        }
        return r;
    }
}
