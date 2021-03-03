package Hashing;

import java.util.*;

public class RelativeSort {
    public static void main(String[] args) {
        int[] a = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int[] b = {89, 101, 65, 56};
        int[] r = sortA1ByA2(a, a.length, b, b.length);
        for(int i : r){
            System.out.println(i);
        }
    }
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M)
    {
        //Your code here
        int[] r = new int[N];
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0;i<N;i++){
            if(map.containsKey(A1[i])){
                map.put(A1[i], map.get(A1[i]) + 1);
            }else{
                map.put(A1[i], 1);
            }
        }
        int k = 0;
        for(int i = 0;i<M;i++){
            if(map.containsKey(A2[i])){
                int l = map.get(A2[i]);
                while(l!=0){
                    r[k] = A2[i];
                    l--;
                    k++;
                }
                map.remove(A2[i]);
            }
        }
//        if(k == 0){
//            Arrays.sort(A1);
//            return A1;
//        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            al.add(entry.getKey());
        }
        Collections.sort(al);
        int x = 0;
        for(;x<al.size();x++){
            r[k] = al.get(x);
            k++;
        }

        return r;
    }
}
