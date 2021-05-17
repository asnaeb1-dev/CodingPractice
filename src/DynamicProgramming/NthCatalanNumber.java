package DynamicProgramming;

import java.math.BigInteger;

/**Question
 * Given a number N. The task is to find the Nth catalan number.
 * The first few Catalan numbers for N = 0, 1, 2, 3, … are 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, …
 * Note: Positions start from 0 as shown above.
 *
 * Example 1:
 *
 * Input:
 * N = 5
 * Output: 42
 * Example 2:
 *
 * Input:
 * N = 4
 * Output: 14
 *
 *
 * HOW TO SOLVE?
 * C(0) = 1
 * C(1) = 1
 * C(2) = C(0) * C(1) + C(1) * C(0)
 *
 * C(i) = C(0) * C(i - 1) + C(1) * C(i - 2) + ... + C(i - 1) * C(0)
 *
 * For help: https://www.youtube.com/watch?v=CMaZ69P1bAc
 */
public class NthCatalanNumber {
    static int[] dp ;
    static BigInteger[] dpBig;
    public static void main(String[] args) {
        catalan(9);
        System.out.println(catalanBig(9));
    }
    //using normal dp
    private static void catalan(int n){
        dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2;i<n + 1;i++){
            int s = 0;
            for(int j = 0;j<i;j++){
                s += dp[i - j - 1] * dp[j];
            }
            dp[i] = s;
        }
    }
    //using biginteger
    private static int catalanBig(int n){
        dpBig = new BigInteger[n + 1];
        dpBig[0] = BigInteger.ONE;
        dpBig[1] = BigInteger.ONE;

        for(int i = 2;i<n +1;i++){
            dpBig[i] = BigInteger.ZERO;
            for(int j = 0;j<i;j++){
                dpBig[i] = dpBig[i].add( dpBig[i - j - 1].multiply(dpBig[j]));
            }
        }
        return dpBig[dpBig.length - 1].intValue();
    }
}
