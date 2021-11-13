package Backtracking;

/**Question -->
 * https://www.geeksforgeeks.org/n-queen-problem-backtracking-3/
 */
public class NQueenProblem {
    public static void main(String[] args) {
        int[][] g = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };
        placeQueen(g, g.length, 0);

        for (int[] ints : g) {
            for (int j = 0; j < g.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
    private static boolean placeQueen(int[][] grid, int n, int r){
        if(r == n) return true;

        for(int j = 0;j<n;j++){
            if(isSafe(grid, r, j, n)){
                grid[r][j] = 1;
                if(placeQueen(grid, n, r + 1)) return true;
                grid[r][j] = 0;
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] g, int i, int j, int n){
        //check if the entire row and column have any queen already present
        for(int x = 0;x < n;x++){
            if(g[x][j] == 1 || g[i][x] == 1) return false;
        }

        //check for diagonals
        //top left
        for(int x = j, y = i; y >=0 && x < n; x++, y --){
            if(g[y][x] == 1){
                return false;
            }
        }

        //top right
        for(int x = j, y = i; x>=0 && y < n; x--, y++){
            if(g[y][x] == 1){
                return false;
            }
        }

        //bottom right
        for(int x = j, y = i;x<n && y<n;x++, y++){
            if(g[y][x] == 1){
                return false;
            }
        }

        //bottom left
        for(int x = j, y = i; x>=0 && y >=0;x--, y--){
            if(g[y][x] == 1){
                return false;
            }
        }
        return true;
    }
}
