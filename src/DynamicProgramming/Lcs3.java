package DynamicProgramming;

import java.util.Arrays;

public class Lcs3 {
    public static void main(String[] args) {
        String s1 = "geeks", s2 = "geeksfor", s3 = "geeksforgeeks";
        //System.out.println(lcs(s2, s2, s3, s1.length(), s2.length(), s3.length()));
        lcsTab(s1, s2, s3, s1.length(), s2.length(), s3.length());

    }
    private static int lcs(String s1, String s2, String s3, int x, int y, int z){
        if(x == 0 || y == 0 || z == 0){
            return 0;
        }
        if((s1.charAt(x - 1) == s2.charAt(y - 1))&&
                (s2.charAt(y - 1) == s3.charAt(z - 1))  &&
                        (s3.charAt(z - 1) == s1.charAt(x - 1))){
            return 1 + lcs(s1, s2, s3, x - 1, y - 1, z - 1);
        }
        return Math.max(lcs(s1, s2, s3, x -1 , y , z) , Math.max(lcs(s1, s2, s3, x, y - 1, z), lcs(s1, s2, s3, x, y, z- 1)));
    }
    private static void lcsTab(String s1, String s2, String s3, int x, int y, int z ){
        int[][][] dp = new int[s1.length() + 1][s2.length() + 1][s3.length() + 1];
        for(int i = 1;i<dp.length;i++){
            for(int j = 1;j<dp[i].length;j++){
                for(int k = 1;k<dp[i][j].length;k++){
                    if(x == 0 || y == 0 || z == 0){
                        dp[i][j][k] = 0;
                    }else if((s1.charAt(i - 1) == s2.charAt(j - 1)) &&
                            (s2.charAt(j - 1) == s3.charAt(k - 1))&&
                            (s3.charAt(k - 1) == s1.charAt(i - 1))){
                        dp[i][j][k] = 1 + dp[i - 1][j - 1][k - 1];
                    }else{
                        dp[i][j][k] = Math.max(dp[i - 1][j][k] ,
                                Math.max(dp[i][j - 1][k], dp[i][j][k - 1]));
                    }
                }
            }
        }
        System.out.println(dp[x][ y][z]);
    }
}
