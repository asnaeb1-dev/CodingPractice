package Strings;

import java.util.*;

public class PrintAnagramsTogether {

    static class Pair{
        int index;
        String s;

        public Pair(int index, String s) {
            this.index = index;
            this.s = s;
        }
    }
    public static void main(String[] args) {
        String[] arr = {"no", "on", "is"};
        printTogether(arr, arr.length);
    }
    //using hashmap and sorting each string
    private static void printTogether(String[] arr, int n){
        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();
        for(int i = 0;i<n;i++){
            char[] temp = arr[i].toCharArray();
            Arrays.sort(temp);
            String str = new String(temp);
            List<String> t;
            if(map.containsKey(str)){
                t = map.get(str);
            }else{
                t = new ArrayList<>();
            }
            t.add(arr[i]);
            map.put(str, t);
        }

        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            System.out.println(entry.getValue().toString());
        }
    }
}
