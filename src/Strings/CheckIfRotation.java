package Strings;

/**QUESTION
 * Given two strings s1 and s2. The task is to check if s2 is a rotated version of the string s1.
 * The characters in the strings are in lowercase.
 *
 * Example 1:
 *
 * Input:
 * geeksforgeeks
 * forgeeksgeeks
 * Output:
 * 1
 * Explanation: s1 is geeksforgeeks, s2 is
 * forgeeksgeeks. Clearly, s2 is a rotated
 * version of s1 as s2 can be obtained by
 * left-rotating s1 by 5 units.
 *
 *
 * Example 2:
 *
 * Input:
 * mightandmagic
 * andmagicmigth
 * Output:
 * 0
 * Explanation: Here with any amount of
 * rotation s2 can't be obtained by s1.
 */

public class CheckIfRotation {
    public static void main(String[] args) {
        String s = "geeksforgeeks", p = "geeksgeeksfor";
        System.out.println(checkIfRotation(s, p));
    }
    private static boolean checkIfRotation(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        String temp = s1 + s1;
        return temp.contains(s2);
    }
}
