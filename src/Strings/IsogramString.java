package Strings;

import java.util.Arrays;

/**QUESTION
 * Given a string S of lowercase alphabets, check if it is isogram or not.
 * An Isogram is a string in which no letter occurs more than once.
 *
 * Example 1:
 *
 * Input:
 * S = machine
 * Output: 1
 * Explanation: machine is an isogram
 * as no letter has appeared twice. Hence
 * we print 1.
 * Example 2:
 *
 * Input:
 * S = geeks
 * Output: 0
 * Explanation: geeks is not an isogram
 * as 'e' appears twice. Hence we print 0.
 */

public class IsogramString {
    public static void main(String[] args) {
        String str = "abhigyan";
        System.out.println(isIsogram(str));
    }
    private static boolean isIsogram(String data){
        int[] count = new int[26];
        Arrays.fill(count, 0);
        for(int i = 0;i<data.length();i++){
            count[data.charAt(i) - 97]++;
        }

        for(int i = 0;i<count.length;i++){
            if(count[i] > 1){
                return false;
            }
        }
        return true;
    }
}
