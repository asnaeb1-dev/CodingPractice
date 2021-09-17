package StackDS;

import java.util.Arrays;
import java.util.Stack;

public class PreviousGreaterElement {
    public static void main(String[] args) {
        int[] a = {15, 10, 18, 12, 4, 6, 2, 8};
        int[] r = previous(a, a.length);
        System.out.println(Arrays.toString(r));
    }
    private static int[] previous(int[] p, int n){
        int[] r = new int[n];
        Stack<Integer> s = new Stack<>();
        s.push(0);
        r[0] = -1;
        for(int i = 1;i<n;i++){
            while(!s.empty() && p[s.peek()] < p[i]){
                s.pop();
            }
            if(s.empty()){
                r[i] = -1;
            }else{
                r[i] = p[s.peek()];
            }
            s.push(i);
        }
        return r;
    }
}
