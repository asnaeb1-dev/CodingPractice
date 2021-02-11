package Strings;

/**
 *Given a String S, reverse the string without reversing its individual words.
 * Words are separated by dots.
 *
 * Example 1:
 *
 * Input:
 * S = i.like.this.program.very.much
 * Output: much.very.program.this.like.i
 * Explanation: After reversing the whole
 * string(not individual words), the input
 * string becomes
 * much.very.program.this.like.i
 * Example 2:
 *
 * Input:
 * S = pqr.mno
 * Output: mno.pqr
 * Explanation: After reversing the whole
 * string , the input string becomes
 * mno.pqr
 */

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String st = "i.love.programming";
        System.out.println(reverse(st));
    }
    private static String reverse(String S){
        String[] a = S.split("\\.");
        StringBuilder sb = new StringBuilder();
        for(int i = a.length - 1;i >= 0;i--){
            sb.append(a[i]);
            if(i != 0){
                sb.append(".");
            }
        }
        return sb.toString();
    }
}
