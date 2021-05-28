package Searching;

import java.util.LinkedHashMap;
import java.util.Map;

public class NbyKOccurances {
    public static void main(String[] args) {
        int[] a = {1, 3, 2, 4, 4, 2, 3, 1};
        System.out.println(countOccurence(a, a.length, 4));
    }
    public static int countOccurence(int[] arr, int n, int k)
    {
        // your code here,return the answer
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i, 1);
            }
        }
        int c = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > n/k){
                c++;
            }
        }
        return c;
    }
}
