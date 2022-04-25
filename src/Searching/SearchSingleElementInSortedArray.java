package Searching;

public class SearchSingleElementInSortedArray {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 3, 4, 4, 5, 5};
        System.out.println(findElement(a, a.length));
    }
    private static int findElement(int[] a, int n){
        int l = 0, r = n - 1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(mid != 0 && mid != n - 1 && a[mid] != a[mid - 1] && a[mid] != a[mid + 1]) return mid;
            if(mid != n -1 && a[mid] == a[mid + 1]){
                r = mid - 1;
            }else if(mid != 0 && a[mid] == a[mid - 1]){
                l = mid + 1;
            }
        }
        return -1;
    }
}
