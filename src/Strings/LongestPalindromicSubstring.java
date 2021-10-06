package Strings;

/**Question
 * Given a string S, find the longest palindromic substring in S.
 * Substring of string S: S[ i . . . . j ] where 0 ≤ i ≤ j < len(S).
 * Palindrome string: A string which reads the same backwards. More formally, S is palindrome if reverse(S) = S.
 * Incase of conflict, return the substring which occurs first ( with the least starting index).
 *
 *
 * Example 1:
 *
 * Input:
 * S = "aaaabbaa"
 * Output: aabbaa
 * Explanation: The longest Palindromic
 * substring is "aabbaa".
 * Example 2:
 *
 * Input:
 * S = "abc"
 * Output: a
 * Explanation: "a", "b" and "c" are the
 * longest palindromes with same length.
 * The result is the one with the least
 * starting index.
 */
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "abbaa";
        System.out.println(longestSubstring(s, s.length()));
    }

    private static int getSubstring(String str, int n){
        return -1;
    }
    //Time - O(n^2)
    private static String longestSubstring(String str, int n){
        int[][] dp = new int[n + 1][n + 1];

        int max = 0;
        String maxStr = "";

        for(int i = 0;i<n + 1;i++){
            dp[i][i] = 1;
            max = 1;
            maxStr = str.substring(i, i);
        }

        for(int i = 1;i<n - 1;i++){
            if(str.charAt(i) == str.charAt(i + 1)){
                dp[i][i + 1] = 1;
                max = 2;
                maxStr = str.substring(i, i + 1);
            }
        }

        for(int i = 2;i<n + 1;i++){
            for(int j = n - 4;j>=2;j--){
                if((str.charAt(i) == str.charAt(j)) && (dp[i + 1][j - 1] == 1)){
                    dp[i][j] = 1;

                    int length = str.substring(i, j).length();
                    if(length > max){
                        max = length;
                        maxStr = str.substring(i, j);
                    }
                }
            }
        }

//        for(int i = 0;i<n+ 1;i++){
//            for(int j = 0;j<n + 1;j++){
//                System.out.print(dp[i][j] +" ");
//            }
//            System.out.println();
//        }

        return maxStr;
    }
}
