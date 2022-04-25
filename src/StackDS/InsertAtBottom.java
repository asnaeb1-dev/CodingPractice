package StackDS;

import java.util.Stack;

public class InsertAtBottom {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        insertAtBottom(stack, 10);

        while(!stack.empty()){
            System.out.println(stack.pop());
        }
    }
    private static void insertAtBottom(Stack<Integer> stack, int el){
        if(stack.empty())  {
            stack.push(el);
            return;
        }
        int ch = stack.pop();
        insertAtBottom(stack, el);
        stack.push(ch);
    }
}
