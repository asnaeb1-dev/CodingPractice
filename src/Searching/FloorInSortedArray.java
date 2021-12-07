package Searching;

public class FloorInSortedArray {
    public static void main(String[] args) {
        long[] a = {1, 2, 8, 10, 11, 12, 19};
        System.out.println(findFloor(a, a.length, 9));
    }
    static int findFloor(long arr[], int n, long x){
        int l = 0, r = n - 1;
        if(x < arr[0]){
            return -1;
        }
        int mid = -1;
        while(l <= r){
            mid = l + (r - l)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if(x > arr[mid]){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return r;
    }
}
