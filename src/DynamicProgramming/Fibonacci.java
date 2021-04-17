package DynamicProgramming;

import java.util.Arrays;

public class Fibonacci {
    static int[] mem = new int[100];
    static int[] table = new int[1000];

    public static void main(String[] args) {
        //System.out.println(fibo(6));
//        Arrays.fill(mem, -1);
//        fiboMem(6);
//        System.out.println(mem[5]);
        fiboTab(5);
        System.out.println(table[5]);
    }
    //fibonacci using normal recursion
    private static int fibo(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return fibo(n - 1) + fibo(n -2);
    }

    //fibonacci using memoization
    private static int fiboMem(int n){
       if(n <= 1){
           return 1;
       }
       if(mem[n] != -1){
           return mem[n];
       }
       mem[n] = fiboMem(n - 1) + fiboMem(n - 2);
       return mem[n];
    }
    private static void fiboTab(int n){
        table[0] = 0;
        table[1] = 1;
        for(int i = 2;i<=n;i++){
            table[i] = table[i - 1] + table[i - 2];
        }
    }
}
