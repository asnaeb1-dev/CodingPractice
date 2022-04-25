package Hashing;

import java.util.ArrayList;

public class HashSet {

    private  final int ARRAY_SIZE = 100;
    private  ArrayList<ArrayList<Integer>> hashSet;

    public HashSet(){
        hashSet = new ArrayList<>(ARRAY_SIZE);
        for(int i = 0;i<ARRAY_SIZE;i++){
            hashSet.add(new ArrayList<Integer>());
        }
    }
    private  void add(int x){
        int hashVal = x % ARRAY_SIZE;
        ArrayList<Integer> bucket = hashSet.get(hashVal);
        if(!bucket.isEmpty()){
            if(!bucket.contains(x)){
                bucket.add(x);
            }
        }else{
            bucket.add(x);
        }
    }

    private  boolean contains(int x){
        int hashVal = x % ARRAY_SIZE;
        ArrayList<Integer> bucket = hashSet.get(hashVal);
        if(bucket.isEmpty()) return false;
        return bucket.contains(x);
    }

    private  void remove(int x){
        if(!contains(x)) return;
        int hashVal = x % ARRAY_SIZE;
        ArrayList<Integer> bucket = hashSet.get(hashVal);
        bucket.remove(x);
    }

    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(45);
        System.out.println(hashSet.contains(45));
        System.out.println(hashSet.contains(43));
//        hashSet.remove(20);
        System.out.println(hashSet.contains(20));

    }
}
