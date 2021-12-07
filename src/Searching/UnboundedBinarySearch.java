package Searching;

public class UnboundedBinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println(unbounded(a, 10));
    }
    private static int unbounded(int[] a, int x){
        int i = 1, l = 0, r = 0;
        while(a[i] > x){
            l = i;
            i*=2;
        }
        if(a[i] == x) return i;
        r = i;
        return binsea(a, l, r, x);
    }
    private static int binsea(int[] a, int l, int r, int x){
        if(l > r) return -1;
        int mid = l + (r - l)/2;
        if(a[mid] == x) return mid;
        if(x > a[mid]){
            return binsea(a, mid + 1, r, x);
        }
        return binsea(a, l, mid - 1, x);
    }
}
