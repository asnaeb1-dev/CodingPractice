package Strings;

public class CountPalindromicSubstrings {
    public static void main(String[] args) {
        String s = "abccbc";
        System.out.println(count(s, s.length()));
    }
    private static int count(String s, int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        int count = 0;
        boolean[][] dp = new boolean[n][n];
        for(int g = 0;g<n;g++){
            int i = 0;
            int j = g;
            while(j < n){
                if(g == 0){
                    dp[i][j] = true;
                }else if(g == 1){
                    dp[i][j] = s.charAt(i) == s.charAt(j);
                } else if(s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]){
                    dp[i][j] = true;
                }

                if(g != 0 && dp[i][j]){
                    count++;
                }
                i++;
                j++;
            }
        }
        return count;
    }
}
