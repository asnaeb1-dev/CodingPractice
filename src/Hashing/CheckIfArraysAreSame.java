package Hashing;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class CheckIfArraysAreSame {
    public static void main(String[] args) {
        int[] a = {56, 2, 45, 12, 90, 87};
        int[] b = {2, 56, 12, 90, 87, 45};
        boolean x = checkSimilarity(a, b, a.length);
        if(x){
            System.out.println("SIMILAR");
            return;
        }
        System.out.println("NOT SAME");
    }
    //Time Complexity - O(n log n)
    //Space Complexity - O(1)
    private static boolean checkSimilarity(int[] a, int[] b, int n){
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0;i<n;i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }

    public static boolean checkSimilarityEff(long[] arr, long[] brr, int n){
        if(arr.length != brr.length){
            return false;
        }
        if(arr.length == 0 && brr.length == 0){
            return true;
        }

        LinkedHashMap<Long, Integer> map = new LinkedHashMap<>();
        LinkedHashMap<Long, Integer> map2 = new LinkedHashMap<>();

        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }

        for(int i = 0;i<brr.length;i++){
            if(map2.containsKey(brr[i])){
                map2.put(brr[i], map2.get(brr[i]) + 1);
            }else{
                map2.put(brr[i], 1);
            }
        }

        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(arr[i]) && map2.containsKey(arr[i])){
                int v1 = map.get(arr[i]);
                int v2 = map2.get(arr[i]);
                if(v1 != v2){
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }
}
