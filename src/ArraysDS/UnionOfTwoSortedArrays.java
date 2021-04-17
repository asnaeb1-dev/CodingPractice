package ArraysDS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {2, 2, 3, 4, 5};
        int[] arr2 = {1, 1, 2, 3, 4};
        System.out.println(unionII(arr1, arr2, arr1.length, arr2.length).toString());
    }

    //TYPE - I; Using libraries
    private static ArrayList<Integer> union(int[] a, int[] b, int n, int m){
        LinkedHashSet<Integer> ln = new LinkedHashSet<>();
        for(int i : a){
            ln.add(i);
        }
        for(int j : b){
            ln.add(j);
        }
        ArrayList<Integer> al = new ArrayList<>(ln);
        Collections.sort(al);
        return al;
    }
    //TYPE: II; Not using libraries
    private static ArrayList<Integer> unionII(int[] a, int[] b, int n, int m){
        LinkedHashSet<Integer> al = new LinkedHashSet<>();
        int i = 0, j = 0;
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                al.add(a[i]);
                i++;
            }else if(a[i] > b[j]){
                al.add(b[j]);
                j++;
            }else{
                al.add(a[i]);
                i++;
                j++;
            }
        }
        while(i < a.length){
            al.add(a[i]);
            i++;
        }
        while(j < b.length){
            al.add(b[j]);
            j++;
        }
        return new ArrayList<>(al);
    }
}
