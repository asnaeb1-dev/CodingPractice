package StackDS;

import java.util.Stack;

public class PreviousSmallerElement {
    public static void main(String[] args) {
        int[] a = {6, 2, 5, 4, 1, 5, 6};
        prevSmaller(a, a.length);
    }
    private static void prevSmaller(int[] a, int n){
        Stack<Integer> st = new Stack<>();
        st.push(0);
        System.out.print(-1+" ");
        for(int i = 1;i<n;i++){
            while(!st.empty() && a[st.peek()] > a[i]){
                st.pop();
            }
            if(st.empty()){
                System.out.print(-1 +" ");
            }else{
                System.out.print(a[st.peek()] + " ");
            }
            st.push(i);
        }
    }
}
