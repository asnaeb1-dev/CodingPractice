package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 6, 7, 10};
        System.out.println(binarySearch(a, a.length, 6));
    }
    private static int binarySearch(int[] a, int n, int x){
        //x = search element

        int l = 0, r = n - 1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(a[mid] == x){
                return mid;
            }
            else if(a[mid] > x){
                r = mid - 1;
            }else if(a[mid] < x){
                l = mid + 1;
            }
        }
        return -1;
    }
}
