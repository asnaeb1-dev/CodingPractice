package Backtracking;

public class GenerateParanthesis {
    public static void main(String[] args) {
        generateParenthesis(3);
    }

    private static void generateParenthesis(int n){
        generate(n, n, "", n);
    }
    private static void generate(int open, int close, String str, int n){
        if(open == n && close == n) {
            System.out.println(str);
            return;
        }

        if(open < n){
            generate(open + 1, close, str+"(", n);
        }
        if(close < open){
            generate(open, close + 1, str+")", n);
        }
    }
}
