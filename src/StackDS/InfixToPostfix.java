package StackDS;

import java.util.ArrayDeque;

/**Q
 * Given an infix expression in the form of string str. Convert this infix expression to postfix expression.
 *
 * Infix expression: The expression of the form a op b. When an operator is in-between every pair of operands.
 * Postfix expression: The expression of the form a b op. When an operator is followed for every pair of operands.
 * â€‹Note: The order of precedence is: ^ greater than * equals to / greater than + equals to -.
 * Example 1:
 *
 * Input: str = "a+b*(c^d-e)^(f+g*h)-i"
 * Output: abcd^e-fgh*+^*+i-
 * Explanation:
 * After converting the infix expression
 * into postfix expression, the resultant
 * expression will be abcd^e-fgh*+^*+i-
 * Example 2:
 *
 * Input: str = "A*(B+C)/D"
 * Output: ABC+*D/
 * Explanation:
 * After converting the infix expression
 * into postfix expression, the resultant
 * expression will be ABC+*D/
 */
public class InfixToPostfix {
    public static void main(String[] args) {
        String str = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(convert(str));
    }
    private static String convert(String str){
        StringBuilder sb = new StringBuilder();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if((ch >= 97 && ch <= 122)||(ch >=65 && ch <= 90)){
                sb.append(ch);
            }else if(ch == '('){
                stack.push(ch);
            }else if(ch == ')'){
                while(stack.peek() != '('){
                    sb.append(stack.pop());
                }
                stack.pop();
            }else{
                while(!stack.isEmpty() && checkPrecedence(ch, stack.peek())){
                    sb.append(stack.peek());
                    stack.pop();
                }
                stack.push(ch);
            }
        }
        if(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    private static boolean checkPrecedence(char incoming, char stackTop){
        if( incoming == '*' || incoming== '/'){
            if(stackTop == '/' || stackTop == '*'){
                return true;
            }
            return false;
        }else if(incoming == '+' || incoming == '-'){
            if(stackTop == '('){
                return false;
            }
            return true;
        }else if(incoming == '^'){
            if(stackTop == '^'){
                return true;
            }
            return false;
        }
        return true;
    }
}
