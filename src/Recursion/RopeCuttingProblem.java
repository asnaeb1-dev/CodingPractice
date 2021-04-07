package Recursion;

public class RopeCuttingProblem {
    public static void main(String[] args) {
        System.out.println(rope(5, 2, 5, 1));
    }
    private static int rope(int n, int a, int b, int c){
        if(n == 0){
            return 0;
        }
        if(n < 0){
            return -1;
        }
        int r = Math.max(rope(n - a, a, b, c), Math.max(rope(n - b, a, b, c), rope(n - c, a, b, c)));
        if(r == -1){
            return -1;
        }
        return r + 1;
    }
}
