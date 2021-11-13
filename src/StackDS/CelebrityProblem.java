package StackDS;

import java.util.Stack;
/**IMP
 *
 */

/**Question -->
 * A celebrity is a person who is known to all but does not know anyone at a party.
 * If you go to a party of N people, find if there is a celebrity in the party or not.
 * A square NxN matrix M[][] is used to represent people at the party such that if an element of row i and column j  is set to 1 it means ith person knows jth person.
 * Here M[i][i] will always be 0.
 * Note: Follow 0 based indexing.
 *
 *
 * Example 1:
 *
 * Input:
 * N = 3
 * M[][] = {{0 1 0},
 *          {0 0 0},
 *          {0 1 0}}
 * Output: 1
 * Explanation: 0th and 2nd person both
 * know 1. Therefore, 1 is the celebrity.
 *
 * Example 2:
 *
 * Input:
 * N = 2
 * M[][] = {{0 1},
 *          {1 0}}
 * Output: -1
 * Explanation: The two people at the party both
 * know each other. None of them is a celebrity.
 */
public class CelebrityProblem {
    //https://www.youtube.com/watch?v=Z5AEc12ieOs
    public static void main(String[] args) {
        int[][] g = {
                {0, 0, 0, 1},
                {0, 0, 0, 1},
                {0, 0, 0, 1},
                {0, 0, 0, 0}
        };
       // System.out.println(getCelebrity(g, g.length));
        System.out.println(celebrity(g, g.length));
    }
    static int celebrity(int g[][], int n){
        // code here
        Stack<Integer> stack = new Stack<>();
        //push all the candidates
        for(int i = n - 1;i>=0;i--){
            stack.push(i);
        }
        int i1 = -1, i2 = -1;
        //Now run a loop till stack is empty
        while(!stack.empty()){
            //pop top
            i1 = stack.pop();
            if(!stack.empty()){
                //pop top twice
                i2 = stack.pop();
            }else{
                break;
            }
            //now check if i1 knows i2; if i1 knows i2 then i1 cannot be a celebrity; push i2 in stack
            // else i1 is celebrity; push i1 into stack
            if(g[i1][i2] == 1){
                stack.push(i2);
            }else{
                stack.push(i1);
            }
        }
        //System.out.println(i1);
        // by the above operation we know which are not celebrity but not the one which is celebrity
        //for confirming which is celebrity, we now traverse the row and column and for row we check if the suspected
        //celebrity has all zeros(except itself)
        //for column we check if all are 1's (except itself)
        //if all the above conditions satisfy then we declare the suspected celevbrity (i1) as a real celebrity
        for(int i = 0;i<n;i++){
            if( i != i1 && g[i1][i] != 0){
                return -1;
            }
            if(i != i1 &&g[i][i1] != 1){
                return -1;
            }
        }
        return i1;
    }

    private static int getCelebrity(int[][] g , int n){
        int c = 0;
        for(int i = 1;i<n;i++){
            if(g[c][i] == 1){
                c = i;
            }
        }

        for(int i = 0;i<n;i++){
            if(i != c && ( g[c][i] == 1 || g[i][c] == 0 )){
                return -1;
            }
        }
        return c;
    }
}
