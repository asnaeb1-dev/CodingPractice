package ArraysDS;

import java.util.Arrays;

public class SortingAlgos {
    public static void main(String[] args) {
        int[] a = {1, 5, 4, 3, 2};
//        bubbleSort(a, a.length);
//        System.out.println(Arrays.toString(a));
        ;
        System.out.println(selectionSort(a, a.length));
    }
    //BUBBLE SORT ALGORITHM
    private static void bubbleSort(int[] a, int n){
        //makes multiple passes and sorts the array
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n - 1;j++){
                if(a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    private static int selectionSort(int[] a, int n){
        int c = 0;
        for(int i = 0;i<n;i++){
            int min = Integer.MAX_VALUE;
            int pos = -1;
            for(int j = i;j<n;j++){
                if(a[j] < min){
                    min = a[j];
                    pos = j;
                }
            }
            int temp = a[i];
            a[i] = a[pos];
            a[pos] = temp;
            c++;
        }
        System.out.println(Arrays.toString(a));
        return c;
    }

}
