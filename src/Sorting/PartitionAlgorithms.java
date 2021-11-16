package Sorting;

public class PartitionAlgorithms {
    public static void main(String[] args) {
        int[] a = {6, 5, 7, 4, 9, 3};
        System.out.println(new PartitionAlgorithms().lomutoAlgorithm(a, 0, a.length - 1));
    }
    public  int lomutoAlgorithm(int[] a, int l, int h){
        int i = l - 1, pivot = a[h];
        for(int j = l;j<=h - 1;j++){
            if(a[j] < pivot){
                i++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        int temp = a[h];
        a[h] = a[i + 1];
        a[i + 1] = temp;
        return i + 1;
    }
}
