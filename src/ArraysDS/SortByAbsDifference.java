package ArraysDS;

import java.util.*;

public class SortByAbsDifference {
    public static void main(String[] args) {
        int[] a = {10, 5, 3, 9, 2};
        sort(a, a.length, 7);
    }
    private static void sort(int[] a, int n, int k){
        TreeMap<Integer, Integer> map= new TreeMap<>();
        for(int i = 0;i<n;i++){
            map.put(Math.abs(a[i] - k), a[i]);
        }
        Collection<Integer> ar =  map.values();
        for(Integer i : ar){
            System.out.println(i);
        }
    }
}
