package DynamicProgramming;

import java.util.ArrayList;

public class GetSubsets {
    public static void main(String[] args) {
        int[] a = {10, 5, 2, 3, 6};
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int sum = 8;
        getSubset(a, a.length, al,res, sum);
        for(ArrayList<Integer> set : res){
            System.out.println(set.toString());
        }
    }
    private static void getSubset(int[] a, int n, ArrayList<Integer> al, ArrayList<ArrayList<Integer>> res, int sum){
        if(n == 0 || sum < 0) return;;
        if(sum == 0){
            res.add(new ArrayList<>(al));
            return;
        }
        if(a[n - 1] <= sum){
            al.add(a[n - 1]);
            getSubset(a, n - 1, al, res, sum - a[n - 1]);
            al.remove(al.size() - 1);
        }
        getSubset(a, n - 1, al, res, sum);
    }
}
