package StackDS;
import java.util.Stack;

/**Q
 * You are given string str. You need to remove the consecutive duplicates from the given string using a Stack.
 *
 * Example 1:
 *
 * Input:
 * aaaaaabaabccccccc
 *
 * Output:
 * ababc
 *
 * Explanation:
 * Removing all consecutive duplicates,
 * we have no duplicates consecutively.
 * Example 2:
 *
 * Input:
 * abbccbcd
 *
 * Output:
 * abcbcd
 *
 * Explanation:
 * Removing all the consecutive duplicates,
 * we have the output as abcbcd.
 *
 * Your Task:
 * This is a function problem.
 * You need to complete the function removeConsecutiveDuplicates() that takes a string as a parameter and returns the modified string.
 * The printing is done automatically by the driver code.
 *
 * Expected Time Complexity: O(N).
 * Expected Auxiliary Space: O(N).
 */
public class RemoveContinuosDuplicates {

     static String remove(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = str.length()- 1; i>=0;i--){
            while(!stack.empty() && stack.peek() == str.charAt(i) ){
                stack.pop();
            }
            stack.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.empty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "aaaaaaaabbbbbcddddccccccddddd";
        System.out.println(remove(s));
    }
}
