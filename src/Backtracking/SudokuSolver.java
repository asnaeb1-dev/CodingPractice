package Backtracking;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] g = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        boolean b = solve(g, g.length);
        System.out.println(b);
        print(g);
    }

    private static void print(int[][] g){
        for (int[] ints : g) {
            for (int j = 0; j < g.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
    private static boolean isSafe(int i, int j, int N, int k, int[][] g){
        //in order for a value to be safe we need to make sure of 2 things:
        //1) The value k must not be already present in the same row/column
        //2) The value k must not be present in the subgrid


        //1) Check if the row and column contains the value k already
        for(int x = 0;x< g.length;x++){
            if( g[x][j] == k || g[i][x] == k){
                return false;
            }
        }

        //2) check if the subgrid contains the value k
        int s = (int) Math.sqrt(N);
        int rs = i - i % s;
        int cs = j - j % s;

        for(int x = 0;x<s;x++){
            for(int y = 0;y<s;y++){
                if(g[x + rs][y + cs] == k){
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean solve(int[][] g, int n){
        int r = -1, c = -1;
        boolean isEmpty = true;
        //look for an empty cell; i.e. g[i][j] = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                //when you find an empty cell, break the execution
                if(g[i][j] == 0){
                    r = i;
                    c = j;
                    isEmpty = false;
                    break;
                }
            }
        }
        //check if we are at the end of the grid
        if(isEmpty) return true;
        //try to fill the cell with all the intended values
        for(int k = 1;k<=n;k++){
            //before putting the value, check if putting it will be a safe action
            if(isSafe(r, c, n, k, g)){
                //if it is safe then put value;
                g[r][c] = k;
                //now recursively check if other values can be put depending upon the value
                if(solve(g, n)) {
                    return true;
                }
                //if other values cannot be put because this value was a failed attempt,
                //then put back 0 in g[i][j]
                g[r][c] = 0;
            }
        }
        //if none of the solutions work out
        return false;
    }
}

