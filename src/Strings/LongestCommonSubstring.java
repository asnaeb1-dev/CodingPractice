package Strings;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        String s = "abacdgfdcaba";
        StringBuilder sb = new StringBuilder(s);
        String srev = sb.reverse().toString();
        System.out.println(longestCommonSubstr(s,srev, s.length(), srev.length() ));
    }
    static int longestCommonSubstr(String S1, String S2, int n, int m){
        // code here
        if(n == 0 || m == 0) return 0;
        int maxLength = Integer.MIN_VALUE;
        int[][] dp = new int[n + 1][m + 1];
        for(int i = 1;i<n + 1;i++){
            for(int j = 1;j<m + 1;j++){
                if(S1.charAt(i - 1) == S2.charAt(j - 1)){
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    maxLength = Integer.max(dp[i][j], maxLength);
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        if(maxLength == Integer.MIN_VALUE){
            return 0;
        }
        return maxLength;
    }

}
