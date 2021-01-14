package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 10, 6, 12, 7};
        int x = 12;
        System.out.println("position- "+lSearch(a, a.length, x));
    }
    private static int lSearch(int[] a, int n, int x){
        for(int i = 0;i<n;i++){
            if(a[i] == x){
                return i;
            }
        }
        return -1;
    }
}
