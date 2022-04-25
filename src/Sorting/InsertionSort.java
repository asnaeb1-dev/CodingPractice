package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {4, 2, 5, 1, 3};
        insertSort(a, a.length);
        System.out.println(Arrays.toString(a));

        String s = Integer.toBinaryString(2);
    }
    private static void insertSort(int[] a, int n){
        for(int i = 1;i<n;i++){
            int j = i - 1;
            int temp = a[i];
            while(j >= 0 && a[j] > temp){
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
    }
}
