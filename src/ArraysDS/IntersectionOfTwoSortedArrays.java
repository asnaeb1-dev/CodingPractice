package ArraysDS;

import java.util.*;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {4, 5, 9};
        int[] b = {4, 4, 8, 9, 9};
        System.out.println(intersection(a, b, a.length, b.length).toString());
    }
    private static ArrayList<Integer> intersection(int[] arr1, int[]arr2, int n, int m){
        int i = 0, j = 0;
        LinkedHashSet<Integer> ln = new LinkedHashSet<>();
        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                i++;
            }else if(arr1[i] > arr2[j]){
                j++;
            }else{
                ln.add(arr1[i]);
                i++;
                j++;
            }
        }
        return new ArrayList<>(ln);
    }
}
