package Sorting;

public class CountInversions {
    public static void main(String[] args) {
        long[] a = {20, 30, 10, 40, 20};
        System.out.println(mergeSort(a, 0, a.length -1));
    }
    static long mergeSort(long[] a, int l, int r){
        long res = 0;
        if(l < r){
            int mid = l + (r - l)/2;
            res+=mergeSort(a, l, mid);
            res+=mergeSort(a, mid + 1, r);
            res+=countAndMerge(a, l, mid, r);
        }
        return res;
    }
    static long countAndMerge(long[] a, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
        long[]L = new long[n1];
        long[]R = new long[n2];
        for(int i = 0;i<n1;i++){
            L[i] = a[i + l];
        }
        for(int j = 0;j<n2;j++){
            R[j] = a[j + m + 1];
        }
        int i = 0, j = 0, k = l;
        long res = 0;
        while(i != n1 && j != n2){
            if(L[i] <= R[j]){
                a[k] = L[i];
                i++;
            }else{
                //here inversions occur
                a[k] = R[j];
                res+=(n1 - i);
                j++;
            }
            k++;
        }
        while(i != n1){
            a[k] = L[i];
            i++;
            k++;
        }
        while(j != n2){
            a[k] = R[j];
            j++;
            k++;
        }
        return res;
    }
}
