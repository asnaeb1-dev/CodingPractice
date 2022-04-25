package StackDS;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.push('1');
        stack.push('2');
        stack.push('3');
        stack.push('4');
        reverse(stack);
        while (!stack.empty()){
            System.out.println(stack.pop() );
        }
        System.out.println();
    }
    private static void reverse(Stack<Character> s){
        if(s.empty()) return;
        char ch = s.pop();
        reverse(s);
        insertAtBottom(s, ch);
    }
    private static void insertAtBottom(Stack<Character> s, char x){
        if(s.empty()) {
            s.push(x);
            return;
        }
        char ch = s.pop();
        insertAtBottom(s, x);
        s.push(ch);
    }
}
