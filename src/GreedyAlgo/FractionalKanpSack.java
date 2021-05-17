package GreedyAlgo;

import java.util.ArrayList;
import java.util.Collections;

/**Q
 * Given weights and values of N items, we need to put these items in a knapsack of capacity W to get the maximum total value in the knapsack.
 * Note: Unlike 0/1 knapsack, you are allowed to break the item.
 *
 * Example 1:
 *
 * Input:
 * N = 3, W = 50
 * values[] = {60,100,120}
 * weight[] = {10,20,30}
 * Output:
 * 240.00
 * Explanation:Total maximum value of item
 * we can have is 240.00 from the given
 * capacity of sack.
 * Example 2:
 *
 * Input:
 * N = 2, W = 50
 * values[] = {60,100}
 * weight[] = {10,20}
 * Output:
 * 160.00
 * Explanation:
 * Total maximum value of item
 * we can have is 160.00 from the given
 * capacity of sack.
 */
public class FractionalKanpSack {
    private static int knapSack(int[] wts, int[] profits, int size, int n){
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        ArrayList<Integer> temp;
        for(int i = 0;i<n;i++){
            temp = new ArrayList<>();
            temp.add(wts[i]);
            temp.add(profits[i]);
            al.add(temp);
        }

        Collections.sort(al, ((o1, o2) -> o1.get(0).compareTo(o2.get(0))));
        int profit= 0;
        for(int i = 0;i<n;i++){
           if(wts[i] <= size){
               if(size - wts[i] < 0){
                   profit+= (size/ wts[i]) * profits[i];
                   size -=(size/ wts[i]) * size;
               }else{
                   size = size - wts[i];
                   profit+=profits[i];
               }
           }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] w = {50, 20, 30};
        int[] cap = {600, 500, 400};
        System.out.println(knapSack(w, cap, 70, 3));
    }
}
