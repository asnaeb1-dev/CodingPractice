package Searching;

public class PivotElement {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 1};
        System.out.println(pivotElement(a, a.length));
    }
    private static int pivotElement(int[] a, int n){
        int l = 0, r = n - 1;
        while(l <= r){
            int mid = l + (r - l)/2;
            if(mid == 0 && a[mid] > a[mid + 1]){
                return a[mid];
            }
            if(mid == n - 1 && a[mid] > a[mid - 1]){
                return a[mid];
            }
            if(a[mid] > a[mid + 1] && a[mid] > a[mid - 1]){
                return a[mid];
            }else if(a[mid] > a[l] && a[mid] < a[r]){
                return a[r];
            }else if(a[mid] > a[l]){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return -1;
    }
}
