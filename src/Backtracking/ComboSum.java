package Backtracking;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ComboSum {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(8);
        a.add(1);
        a.add(8);
        a.add(8);
        a.add(6);
        a.add(8);

        int target = 12;

        HashSet<Integer> s = new HashSet<>(a);
        a.clear();
        a.addAll(s);
        ArrayList<ArrayList<Integer>> set = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
        comboSum(a,0, target, a.size(), al, set) ;

        for(ArrayList<Integer> x : set){
            System.out.println(x.toString());
        }
    }
    private static void comboSum(ArrayList<Integer> a, int start, int target, int n, ArrayList<Integer> al, ArrayList<ArrayList<Integer>> set){
        if(target == 0){
            //System.out.println(al);
            set.add(new ArrayList<>(al));
            return;
        }
        for(int i = start;i<n;i++){
            if(a.get(i) <= target){
                al.add(a.get(i));
                comboSum(a, i, target - a.get(i), n, al, set);
                al.remove(al.size() - 1);
            }
        }
    }
}
