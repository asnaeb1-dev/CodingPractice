package Searching;

public class LastOccurance {
    public static void main(String[] args) {
        int[] a = {1, 10, 10, 10, 30, 40};
        System.out.println(new LastOccurance().lastOccurance(a, 10));
    }
    public  int lastOccurance(int[] a, int x){
        int l = 0;
        int h = a.length - 1;
        while(l <= h){
            int mid = l + (h - l)/2;
            if(a[mid] == x){
                if(mid != a.length - 1 && a[mid + 1] == a[mid]){
                    l = mid + 1;
                }else{
                    return mid;
                }
            }else if(x > a[mid]){
                l = mid + 1;
            }else{
                h = mid - 1;
            }
        }
        return -1;
    }
}
