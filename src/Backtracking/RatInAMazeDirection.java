package Backtracking;

import java.util.ArrayList;

/**Question --->
 * Consider a rat placed at (0, 0) in a square matrix of order N * N.
 * It has to reach the destination at (N - 1, N - 1).
 * Find all possible paths that the rat can take to reach from source to destination.
 * The directions in which the rat can move are 'U'(up), 'D'(down), 'L' (left), 'R' (right).
 * Value 0 at a cell in the matrix represents that it is blocked and rat cannot move to it while value 1 at a cell in the matrix represents that rat can be travel through it.
 * Note: In a path, no cell can be visited more than one time.
 *
 * Example 1:
 *
 * Input:
 * N = 4
 * m[][] = {{1, 0, 0, 0},
 *          {1, 1, 0, 1},
 *          {1, 1, 0, 0},
 *          {0, 1, 1, 1}}
 * Output:
 * DDRDRR DRDDRR
 * Explanation:
 * The rat can reach the destination at
 * (3, 3) from (0, 0) by two paths - DRDDRR
 * and DDRDRR, when printed in sorted order
 * we get DDRDRR DRDDRR.
 * Example 2:
 * Input:
 * N = 2
 * m[][] = {{1, 0},
 *          {1, 0}}
 * Output:
 * -1
 * Explanation:
 * No path exists and destination cell is
 * blocked.
 */
public class RatInAMazeDirection {
    public static void main(String[] args) {
        int[][] m = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };
        ArrayList<String> paths = findPath(m, m.length);
        System.out.println(paths);
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> al = new ArrayList<>();
        getPaths(m, 0, 0, n, al, "");
        return al;
    }
    private static void getPaths(int[][] mat, int i, int j, int n,
                                 ArrayList<String> p, String route){
        if(i == n - 1 && j == n - 1){
            if(mat[i][j] == 1){
                p.add(route);
                return;
            }
            return;
        }
        if((i < 0 || i > n - 1) || (j < 0 || j > n - 1)) return;
        if(mat[i][j] == 0) return;
        mat[i][j] = 0;
        getPaths(mat, i + 1, j, n, p, route + "D");
        getPaths(mat, i, j - 1, n, p, route + "L");
        getPaths(mat, i, j + 1, n, p, route + "R");
        getPaths(mat, i - 1, j, n, p, route + "U");
        mat[i][j] = 1;
    }
}
