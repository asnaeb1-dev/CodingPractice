package Backtracking;

import java.util.*;

public class PrintAllSubsets {
    public static void main(String[] args) {
        int[] a = {2, 1, 2};
        Arrays.sort(a);
        ArrayList<Integer> al = new ArrayList<>();
        getSubset(a, 0, al);

    }
    private static void getSubset(int[] a, int i, ArrayList<Integer> subset){
        if(i == a.length) {
            System.out.println(subset);
            return;
        }
        subset.add(a[i]);
        getSubset(a, i + 1, subset);
        subset.remove(subset.size() - 1);
        getSubset(a, i + 1, subset);
    }
}
