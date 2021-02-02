package Sorting;

import java.util.Arrays;

public class SortingAlgo {
    public static void main(String[] args) {
        int[] a = {9, 7, 6, 5, 4, 3};
        //bubbleSort(a);
        //selectionSort(a);
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }
    //bubble sort - O(n2)
    private static void bubbleSort(int[] a){
        for(int i = 0;i<a.length;i++){
            for(int j = i; j< a.length - i - 1;j++){
                if(a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    //selection sort - O(n2)
    private static void selectionSort(int[] a){
        for(int i = 0;i<a.length;i++){
            int min_idx = i;
            for(int j = i;j<a.length;j++){
                if(a[j] < a[min_idx]){
                    min_idx = j;
                }
            }
            int temp = a[i];
            a[i] = a[min_idx];
            a[min_idx] = temp;
        }
    }

    //insertion sort - O(n2)
    private static void insertionSort(int[] a){
        for(int i = 1;i<a.length;i++){
            int val = a[i], hole = i;
            while(hole > 0  &&a[hole - 1] > a[hole]){
                a[hole] = a[hole -1];
                hole--;
            }
            a[hole] = val;
        }
    }
}
