package Recursion;

public class PrintFrom1ToN {
    public static void main(String[] args) {
        int x = 1;
        print(x, 10);
    }
    private static void print(int x, int n){
        if(x == n){
            return;
        }
        System.out.print(x + " ");
        print(x+1, n);
    }
}
