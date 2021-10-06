package DynamicProgramming;

public class OptimalStrategyForGame {
    public static void main(String[] args) {
        int[] a = {20, 4, 5, 6};
        //System.out.println(game(a, a.length));
        System.out.println("Recursive solution- "+gameRec(a, 0, a.length - 1));
    }

    private static int gameRec(int[]a, int i, int j){
        if(i + 1 == j){
            return Math.max(a[i], a[j]);
        }
        return Math.max(
            a[i] +  Math.min(gameRec(a, i + 2, j), gameRec(a, i + 1, j - 1)),
                a[j] + Math.min(gameRec(a, i + 1, j - 1), gameRec(a, i, j - 2)));
    }

    //dynamic programming solution
    private static int game(int[] a, int n){
        int[][] dp = new int[n + 1][n + 1];
        for(int i = 0;i<n - 1;i++){
            dp[i][i + 1] = Math.max(a[i], a[i + 1]);
        }

        for(int g = 3;g<n;g+=2){
            for(int i = 0;i + g<n ;i++){
                int j = i + g;
                dp[i][j] = Math.max(
                        a[i] + Math.min(dp[i + 2][j], dp[i + 1][j - 1]),
                        a[j] + Math.min(dp[i][j - 2], dp[i + 1][j - 1]));
            }
        }
        return dp[0][n- 1];
    }
}
