package StackDS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {
        int[] a = {6, 2, 5, 4, 1, 5, 6};
        System.out.println(nextSmaller(a, a.length).toString());
    }
    private static ArrayList<Integer> nextSmaller(int[] a, int n){
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.push(a[n - 1]);
        al.add(-1);
        for(int i = n - 2;i>=0;i--){
            while(!st.empty() && st.peek() >= a[i]){
                st.pop();
            }

            if(st.empty()){
                al.add(-1);
            }else{
                al.add(st.peek());
            }
            st.push(a[i]);
        }
        Collections.reverse(al);
        return al;
    }
}
