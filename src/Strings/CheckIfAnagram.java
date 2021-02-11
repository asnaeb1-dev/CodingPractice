package Strings;

/** Q
 * Given two strings a and b consisting of lowercase characters.
 * The task is to check whether two given strings are an anagram of each other or not.
 * An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, “act” and “tac” are an anagram of each other.
 *
 * Example 1:
 *
 * Input:
 * a = geeksforgeeks, b = forgeeksgeeks
 * Output: YES
 * Explanation: Both the string have same
 * characters with same frequency. So,
 * both are anagrams.
 * Example 2:
 *
 * Input:
 * a = allergy, b = allergic
 * Output: NO
 * Explanation:Characters in both the strings
 * are not same, so they are not anagrams.
 */
import java.util.Arrays;
public class CheckIfAnagram {
    public static void main(String[] args) {
        String a = "asnaeb", b = "neasab";
        System.out.println(check(a, b));
    }

    private static boolean check(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        int[] count = new int[26];
        int[] count2 = new int[26];

        Arrays.fill(count, 0);
        Arrays.fill(count2, 0);

        for(int i = 0;i<a.length();i++){
            count[a.charAt(i) - 97]++;
            count2[b.charAt(i) - 97]++;
        }

        for(int i = 0;i<count.length;i++){
            if(count[i] != count2[i]){
                return false;
            }
        }
        return true;
    }
}
