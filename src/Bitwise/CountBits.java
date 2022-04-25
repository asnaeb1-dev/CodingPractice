package Bitwise;

public class CountBits {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countSetBits(n));
    }
    public static int countSetBits(int n){
        //int x = Math.lo
        // Your code her
        int count = 0;
        while(n != 0){
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
