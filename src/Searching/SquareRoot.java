package Searching;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println((int)root(5));
    }
    private static long root(int n){
        long l = 0, r = n, m = 0, ans = -1;
        while(l <= r){
            m = l + (r - l)/2;
            if(m * m <= n){
                ans = m;
                l = m + 1;
            }else{
                r = m - 1;
            }
        }
        return ans;
    }
}
