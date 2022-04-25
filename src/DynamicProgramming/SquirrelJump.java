package DynamicProgramming;

import java.util.Arrays;

public class SquirrelJump {
    static int[] mem;
    public static void main(String[] args) {
        int n = 4;
        mem = new int[n + 1];
        Arrays.fill(mem, -1);
        count(n);
        System.out.println(mem[n]);
    }
    private static int count(int n){
        if(n < 0) return 0;
        if(n == 0) {
            mem[n] = 1;
            return mem[n];
        }
        if(mem[n] != -1) return mem[n];
        mem[n] = count(n - 1) + count(n - 2) + count(n - 3);
        return mem[n];
    }
}
