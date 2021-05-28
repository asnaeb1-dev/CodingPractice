package Sorting;

import java.util.*;

public class SortByAbsDifference {
    public static void main(String[] args) {
        int[] a = {10, 5, 3, 9, 2};
        int k = 7;
        sort(a, k, a.length);
        System.out.println(Arrays.toString(a));
    }
    private static void sort(int[] arr, int k, int n){
       LinkedHashMap<Integer, Integer> m = new LinkedHashMap<>();
       for(int i : arr){
           m.put(i, Math.abs(i - k));
       }
       //System.out.println(m.keySet().toString());
       //System.out.println(m.values().toString());
       ArrayList<Map.Entry<Integer, Integer>> a = new ArrayList<>(m.entrySet());
       Collections.sort(a, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
       int i = 0;
       for(Map.Entry<Integer, Integer> entry : a){
           arr[i] = entry.getKey();
           i++;
       }
    }
}
