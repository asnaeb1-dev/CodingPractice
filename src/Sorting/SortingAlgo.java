package Sorting;

import java.util.Arrays;

public class SortingAlgo {
    public static void main(String[] args) {
        int[] a = {9, 7, 6, 5, 4, 3};
        //bubbleSort(a);
        //selectionSort(a);
       // insertionSort(a);
        //quickSort(a);
        mergeSort(a);
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

    //quick sort - O(n log n)
    private static void quickSort(int[] a){
        //Using Lommuto partition
        int l = 0, h = a.length;
        quickSortHelper(a, l, h - 1);
    }

    private static void quickSortHelper(int[] a, int l, int r){
        if(l < r){
            int p = new PartitionAlgorithms().lomutoAlgorithm(a, l, r);
            quickSortHelper(a, l, p - 1);
            quickSortHelper(a, p + 1, r);
        }
    }

    private static void mergeSort(int[] a){
        mergeSortHelper(a, 0, a.length - 1);
    }
    private static void mergeSortHelper(int[] a, int l, int r){
        if(l < r){
            int mid = l + (r - l)/2;
            mergeSortHelper(a, l, mid);
            mergeSortHelper(a, mid + 1, r);
            merge(a, l, mid, r);
        }
    }
    private static void merge(int[] a, int l, int m, int r){
        int[] L = new int[m - l + 1];
        int[] R = new int[r - m];
        for(int i = 0, k = 0;i<L.length;i++, k++){
            L[i] = a[i + l];
        }
        for(int j = 0, k = 0;j<R.length;j++, k++){
            R[j] = a[m + 1 + j];
        }
        int i = 0, j = 0, k = l;
        while(i != L.length && j != R.length){
            if(L[i] <= R[j]){
                a[k] = L[i];
                i++;
            }else{
                a[k] = R[j];
                j++;
            }
            k++;
        }
        while(i != L.length){
            a[k] = L[i];
            i++;
            k++;
        }
        while(j != R.length){
            a[k] = R[j];
            j++;
            k++;
        }
    }
}
