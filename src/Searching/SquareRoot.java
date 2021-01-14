package Searching;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println((int)root(15));
    }
    private static long root(int n){
        int l = 0, r = n;
        while(l <= r){
            int mid = l + (r - l)/2;
            if(mid * mid == n){
                return mid;
            }
            else if(n > mid * mid){
                l = mid + 1;
            }else{
                r = mid -1;
            }
        }
        return (long) (Math.floor(Math.sqrt(n * 1.0)));
    }
}
