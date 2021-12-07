package Searching;

public class FirstOccurance {
    public static void main(String[] args) {
        int[] a = {1, 5, 10, 10, 10, 10, 20};
        System.out.println(firstOccuranceRec(a, 10, 0, a.length - 1));
    }
    private static int firstOccuranceRec(int[] a, int x, int l, int h){
        if(l > h) return -1;
        int mid = l + (h - l)/2;
        if(a[mid] == x){
            if(mid != 0 && a[mid - 1] == a[mid]){
                return firstOccuranceRec(a, x, l, mid - 1);
            }else{
                return mid;
            }
        }else if(x > a[mid]){
            return firstOccuranceRec(a, x, mid + 1, h);
        }
        return firstOccuranceRec(a, x, l, mid - 1);
    }
    public int firstOccuranceIter(int[] a, int x){
        int l = 0;
        int h = a.length - 1;
        while(l <= h){
            int mid = l + (h - l)/2;
            if(a[mid] == x){
                if(mid != 0 && a[mid - 1] == a[mid]){
                    h = mid -1;
                }else{
                    return mid;
                }
            }else if(x > a[mid]){
                l = mid +1;
            }else {
                h = mid - 1;
            }
        }
        return -1;
    }
}
