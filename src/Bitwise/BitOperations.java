package Bitwise;

public class BitOperations {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        bitwiseOperations(a, b);
    }
    private static void bitwiseOperations(int a, int b){
        System.out.println(a & b);
    }
}
