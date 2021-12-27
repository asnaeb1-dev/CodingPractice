package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class MostFrequentWord {
    public static void main(String[] args) {
        String[] a = {"hello", "world"};
        String res = mostFrequentWord(a, a.length);
        System.out.println(res);
    }
    public static String mostFrequentWord(String arr[],int n){
        // code here
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for(int i = 0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }

        int max = Integer.MIN_VALUE;
        String s = "";
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                s = entry.getKey();
            }
        }
        return s;
    }
}
