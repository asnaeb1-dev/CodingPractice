package Hashing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Chaining {
    public static void main(String[] args) {
        int[] a = {50, 21, 58, 17, 15, 49, 56, 22, 23, 25};
//        ArrayList<ChainNode> al = new ArrayList<>(10);
//        Collections.fill(al, null);
//        hashEverything(a, al);
        ArrayList<ArrayList<Integer>> al = hash(a, a.length, 10);
        for(int i = 0;i<al.size();i++){
            for(int j = 0;j<al.get(i).size();j++){
                System.out.print(al.get(i).get(j)+"-> ");
            }
            System.out.println();
        }

    }
    private static void hashEverything(int[] list, ArrayList<ChainNode> al ){
        for(int i = 0;i<list.length;i++){
            int hashValue = list[i] % 7;
            if(al.get(hashValue) == null){
                al.add(new ChainNode(list[i], null));
            }else{
                ChainNode head = al.get(hashValue);
                while(head.next != null){
                    head = head.next;
                }
                head.next = new ChainNode(list[i], null);
            }
        }
    }

    private static ArrayList<ArrayList<Integer>> hash(int[] a, int n, int hashSize){
        ArrayList<ArrayList<Integer>> al = new ArrayList<>(hashSize);
        for(int i = 0;i<n;i++){
            int hashCode = a[i] % hashSize;
            System.out.println(hashCode);
            ArrayList<Integer> temp = al.get(hashCode);
            if(temp.size() == 0){
                temp = new ArrayList<>();
                temp.add(a[i]);
                al.add(hashCode, temp);
            }else {
                temp.add(a[i]);
            }
        }
        return al;
    }
}
