package ArraysDS;

import java.util.Arrays;

public class SegregateNegativeAndPositive {
    public static void main(String[] args) {
        int[] a = {5,4, -2, -5, -6, 10};
        segregate(a, a.length);
        System.out.println(Arrays.toString(a));
    }
    private static void segregate(int[] a, int n){
        int i = 0, j = n - 1;
        while(i <= j){
            if(a[i] > 0 && a[j] < 0){
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
                i++;
                j--;
            }else if(a[i] > 0){
                j--;
            }else if(a[j] < 0){
                i++;
            }else{
                i++;
                j--;
            }
        }
    }
}
