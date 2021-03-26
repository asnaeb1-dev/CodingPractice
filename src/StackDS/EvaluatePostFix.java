package StackDS;

import java.util.Stack;

public class EvaluatePostFix {

    public static void main(String[] args) {
        System.out.println(evaluatePostFix("123+*8-"));
    }
    public static int evaluatePostFix(String s){
        // Your code here
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >= 48 && ch <= 57){
                stack.push(Integer.parseInt(String.valueOf(ch)));
            }else{
                int val1 = Integer.MIN_VALUE, val2 = val1;
                if(!stack.empty()){
                    val1 = stack.pop();
                }
                if(!stack.empty()){
                    val2 = stack.pop();
                }
                stack.push(evaluate(ch, val2, val1));
            }
        }
        return stack.pop();
    }
    private static int evaluate(char v, int a, int b){
        switch (v){
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
        }
        return -1;
    }
}
