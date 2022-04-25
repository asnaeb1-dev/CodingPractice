package StackDS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterFrequencyElement {
    static class Pair{
        int val;
        int freq;

        public Pair(int val, int freq) {
            this.val = val;
            this.freq = freq;
        }
    }
    public static void main(String[] args) {
        int[] a = {1, 1, 1, 2, 2, 2, 2, 11, 3, 3};
        System.out.println(Arrays.toString(ngfe(a, a.length)));
    }
    private static int[] ngfe(int[] a, int n){
        int[] res = new int[n];
        Stack<Pair> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : a){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i, 1);
            }
        }
        stack.push(new Pair(a[n - 1], map.get(a[n - 1])));
        res[n - 1] = -1;

        for(int i = n - 2;i>=0;i--){
            while(!stack.empty() && map.get(a[i]) >= stack.peek().freq){
                stack.pop();
            }

            if(stack.empty()){
                res[i] = -1;
            }else{
                res[i] = stack.peek().val;
            }

            stack.push(new Pair(a[i], map.get(a[i])));
        }
        return res;
    }
}
