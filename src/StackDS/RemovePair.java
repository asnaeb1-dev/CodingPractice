package StackDS;
import java.util.Stack;

/**Q
 * You are given string str. You need to remove the pair of duplicates.
 * Note: The pair should be of adjacent elements and after removing a pair the remaining string is joined together.
 *
 * Example 1:
 *
 * Input:
 * aaabbaaccd
 *
 * Output:
 * ad
 *
 * Explanation:
 * Remove (aa)abbaaccd =>abbaaccd
 * Remove a(bb)aaccd => aaaccd
 * Remove (aa)accd => accd
 * Remove a(cc)d => ad
 * Example 2:
 *
 * Input:
 * aaaa
 *
 * Output:
 * Empty String
 *
 * Explanation:
 * Remove (aa)aa => aa
 * Again removing pair of duplicates then (aa)
 * will be removed and we will get 'Empty String'.
 */
public class RemovePair {
    private static String removePair(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<str.length();i++){
            if(stack.empty()){
                stack.push(str.charAt(i));
            }else if(stack.peek() == str.charAt(i)){
                stack.pop();
            }else{
                stack.push(str.charAt(i));
            }
        }
        StringBuilder s = new StringBuilder();
        while(!stack.empty()){
            s.append(stack.pop());
        }
        return s.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(removePair("aaaa"));
    }
}
