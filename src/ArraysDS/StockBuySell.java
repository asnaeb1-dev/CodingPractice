package ArraysDS;

import java.util.ArrayList;
import java.util.Stack;

public class StockBuySell {
    public static void main(String[] args) {
        int[] stock = {4, 2, 2, 2, 4};
        ArrayList<ArrayList<Integer>> t =stockBuySell(stock, stock.length);
        for(int i = 0;i<t.size();i++){
            System.out.println(t.get(i).get(0) + " " + t.get(i).get(1));
        }
    }
    static ArrayList<ArrayList<Integer>> stockBuySell(int[] arr, int n) {
        // code here
        ArrayList<ArrayList<Integer>> temp = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        s.push(0);
        for(int i = 1;i<n;i++){
            if(!s.empty() && arr[i] > arr[s.peek()]){
                s.push(i);
            }else{
                ArrayList<Integer> al = new ArrayList<>();
                int initial = -1, finalV = s.pop();
                while(!s.empty()){
                    initial = s.pop();
                }
                s.push(i);
                if(initial != -1){
                    //System.out.println(initial + " " + finalV);
                    al.add(initial);
                    al.add(finalV);
                    temp.add(al);
                }

            }
        }
        int initial = -1, finalV = -1;
        ArrayList<Integer> t = new ArrayList<>();
        if(!s.empty()){
            finalV = s.pop();
        }
        while(!s.empty()){
            initial = s.pop();
        }
        if(initial != -1){
            t.add(initial);
            t.add(finalV);
            temp.add(t);
        }
        return temp;
    }
}
