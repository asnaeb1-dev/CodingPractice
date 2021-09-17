package Searching;

public class FindPow {
    public static void main(String[] args) {
        System.out.println(pow(2, 3));
    }
    private static int pow(int a, int b){
        if(b == 0){
            return 1;
        }
        return multiply(a, pow(a, b - 1));
    }

    private static int multiply(int a, int b) {
        if(b > 0){
            return a + multiply(a, b - 1);
        }
        return 0;
    }
}
