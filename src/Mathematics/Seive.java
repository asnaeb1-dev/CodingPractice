package Mathematics;

import java.util.Arrays;

public class Seive {
    public static void main(String[] args) {
        int n = 10;
        listOfPrimes(n);
    }
    private static void listOfPrimes(int n){
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        for(int i = 2;i * i <= n;i++){
            if(prime[i]){
                for(int j = i * i;j<=n;j+=i){
                    prime[j] = false;
                }
            }
        }

        for(int i = 2;i<prime.length;i++){
            if(prime[i]){
                System.out.print(i +" ");
            }
        }
    }
}
