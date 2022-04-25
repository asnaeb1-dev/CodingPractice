package DynamicProgramming;

import java.util.Arrays;

public class FriendPairingProblem {
    static long MOD = (long) Math.pow(10, 9) + 7;
    static long[] mem;
    public long countFriendsPairings(int n){
        //code here
        mem = new long[n + 1];
        Arrays.fill(mem, -1);
        count(n);
        return mem[n];
    }
    private static long count(int n){
        if(n == 0 || n == 1 || n == 2) {
            mem[n] = n;
            return mem[n];
        }
        if(mem[n] != -1) return mem[n];
        mem[n] = ((count(n - 1) % MOD) + ((n - 1) * (count(n - 2) % MOD)) % MOD) % MOD;
        return mem[n];
    }
}
