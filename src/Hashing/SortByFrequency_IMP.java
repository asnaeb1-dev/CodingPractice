package Hashing;

import java.util.*;

public class SortByFrequency_IMP {
    public static void main(String[] args) {
        int[] a = {5, 4, 5, 6, 7, 2, 9, 4, 9, 7, 7};
        ArrayList<Integer> al = sort(a, a.length);
        for(int i : al){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    private static ArrayList<Integer> sort(int[] a, int n){
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0;i<n;i++){
            if(map.containsKey(a[i])){
                map.put(a[i], map.get(a[i]) + 1);
            }else{
                map.put(a[i], 1);
            }
        }

        ArrayList<Map.Entry<Integer, Integer>> al = new ArrayList(map.entrySet());
        Collections.sort(al, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if(o1.getValue().equals(o2.getValue())){
                    if(o1.getKey().compareTo(o2.getKey()) < 0){
                        return 1;
                    }else{
                        return -1;
                    }
                }else if(o1.getValue().compareTo(o2.getValue()) < 0){
                    return -1;
                }else{
                    return 1;
                }
            }
        });
        for(int i = al.size() -1; i>=0;i--){
            int l = al.get(i).getValue();
            while(l!=0){
                temp.add(al.get(i).getKey());
                l--;
            }
        }
        return temp;
    }
}
