package Searching;

import java.util.Arrays;

public class RepeatedElements {
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 3, 4, 3};
        repeated(a, 4);
    }
    private static void repeated(int[] a, int n){
        for(int i = 0 ;i<a.length;i++){
            int index = Math.abs(a[i]);
            if(a[index] > 0){
                a[index] = -1 * a[index];
            }else{
                System.out.println(Math.abs(index));
            }
        }

       //System.out.println(Arrays.toString(a));
    }
    private static void check(int[] a, int n){
        for(int i = 0;i<n;i++){
            a[i]--;
        }
        for (int i = 0;i<n;i++){
            System.out.print(a[a[i]] + 1 + " ");
        }
    }
}
