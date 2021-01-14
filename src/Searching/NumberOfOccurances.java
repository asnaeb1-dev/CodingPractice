package Searching;

public class NumberOfOccurances {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 2, 2, 2, 3, 4, 5};
        System.out.println(count(a, a.length, 2));
    }
    private static int count(int[] a, int n, int x){
        int l = 0, r = n - 1;
        int c = 0;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(a[mid] == x){
                break;
            }else if(x > a[mid]){
                l = mid + 1;
            }else if(x < a[mid]){
                r = mid - 1;
            }
        }
        return c;
    }
}
