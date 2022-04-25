package Backtracking;

import java.util.ArrayList;

public class TugOfWar {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        divideArray(a, a.length, 0, new ArrayList<Integer>(), new ArrayList<Integer>(), 0, 0);
        System.out.println(minDiff);
        System.out.println(str);
    }
    static int minDiff = Integer.MAX_VALUE;
    static String str = "";
    private static void divideArray(int[] a, int n, int index, ArrayList<Integer> set1, ArrayList<Integer> set2, int sum1, int sum2){
        if(index == n){
            if(Math.abs(sum1 - sum2) < minDiff){
                minDiff = Math.abs(sum1 - sum2);
                str = set1.toString() + ", "+ set2.toString();
            }
            return;
        }
        if(set1.size() < (n + 1) / 2){
            set1.add(a[index]);
            divideArray(a, n, index + 1, set1, set2, sum1+a[index], sum2);
            set1.remove(set1.size() - 1);
        }

        if(set2.size() < (n + 1) / 2){
            set2.add(a[index]);
            divideArray(a, n, index + 1, set1, set2, sum1, sum2+a[index]);
            set2.remove(set2.size() - 1);
        }
    }
}
