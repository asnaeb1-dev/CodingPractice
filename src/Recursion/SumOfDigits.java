package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(675, 0));
    }
    private static int sum(int n, int s){
        if(n == 0){
            return s;
        }
        s+=n%10;
        return sum(n / 10, s);
    }
}
