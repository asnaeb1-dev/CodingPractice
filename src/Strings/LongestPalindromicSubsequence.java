package Strings;

public class LongestPalindromicSubsequence {
    public static void main(String[] args) {
        String s = "abhigyan";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(lps(s, sb.toString(), s.length(), s.length()));
    }

    private static int lps(String s1 , String s2, int n, int m){
        if(n == 0 || m == 0) return 0;
        int[][] dp = new int[n + 1][m + 1];
        for(int i = 1;i<n + 1;i++){
            for(int j = 1;j<m + 1;j++){
                if(s1.charAt(i - 1) == s2.charAt(j - 1)){
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }else{
                    dp[i][j] = Integer.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m];
    }
}
