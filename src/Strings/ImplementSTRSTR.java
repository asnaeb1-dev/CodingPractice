package Strings;

/**
 * Question
 * Your task is to implement the function strstr.
 * The function takes two strings as arguments (s,x) and  locates the occurrence of the string x in the string s.
 * The function returns and integer denoting the first occurrence of the string x in s (0 based indexing).
 *
 * Example 1:
 * Input:
 * s = GeeksForGeeks, x = Fr
 * Output: -1
 * Explanation: Fr is not present in the
 * string GeeksForGeeks as substring.
 *
 * Example 2:
 * Input:
 * s = GeeksForGeeks, x = For
 * Output: 5
 * Explanation: For is present as substring
 * in GeeksForGeeks from index 5 (0 based
 * indexing).
 */

public class ImplementSTRSTR {
    public static void main(String[] args) {
        System.out.println(implement("GeeksForGeeks", "Fr"));
    }
    private static int implement(String s, String t){
        for(int i = 0;i<s.length() - t.length() + 1;i++){
            if(s.charAt(i) == t.charAt(0)){
                String sb = s.substring(i, i + t.length());
                if(sb.equals(t)){
                    return i;
                }
            }
        }
        return -1;
    }
}
