package Hashing;

import java.util.LinkedHashMap;

public class CountDistinctElements {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 10};
        System.out.println(count(a, a.length));
    }
    private static long count(int[] arr, int n){
        LinkedHashMap<Integer, Long> map = new LinkedHashMap<>();
        for (int j : arr) {
            if (!map.containsKey(j)) {
                map.put(j, (long) 1);
            } else {
                map.put(j, map.get(j) + 1);
            }
        }
        long c = 0;
        for(int i = 0;i< arr.length;i++){
            if(map.get(arr[i]) == 1){
                c++;
            }
        }
        return c;
    }
}
