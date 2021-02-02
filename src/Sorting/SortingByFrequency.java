package Sorting;

import java.util.*;

public class SortingByFrequency {
    public static void main(String[] args) {
        int[] a = {9, 9, 9, 2, 5};
        sortByFreq(a);
    }
    private static void sortByFreq(int[] a){
        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>(), hm = new LinkedHashMap<>();
        for(int i = 0;i<a.length;i++){
            if(lhm.get(a[i]) != null){
                lhm.replace(a[i], lhm.get(a[i]) + 1);
            }else{
                lhm.put(a[i], 1);
            }
        }

        lhm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(entry -> hm.put(entry.getKey(), entry.getValue()));

        int prvValue = -1, prevKey = -1;
        ArrayList<Integer> al = new ArrayList<>();
        for(Map.Entry<Integer, Integer> itr : hm.entrySet()){
            if(itr.getValue() == prvValue){
                if(itr.getKey() < prevKey){
                    int tempKey = itr.getKey(), tempVal = itr.getValue();
                    
                }
            }
        }
        System.out.println(al.toString());
    }
}
