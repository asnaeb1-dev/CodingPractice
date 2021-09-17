package GraphDS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Given a grid of size n*n filled with 0, 1, 2, 3. Check whether there is a path possible from the source to destination.
 * You can traverse up, down, right and left.
 * The description of cells is as follows:
 *
 * A value of cell 1 means Source.
 * A value of cell 2 means Destination.
 * A value of cell 3 means Blank cell.
 * A value of cell 0 means Wall.
 * Note: There are only a single source and a single destination.
 *
 *
 * Example 1:
 *
 * Input: grid = {{3,0,3,0,0},{3,0,0,0,3}
 * ,{3,3,3,3,3},{0,2,3,0,0},{3,0,0,1,3}}
 * Output: 0
 * Explanation: The grid is-
 * 3 0 3 0 0
 * 3 0 0 0 3
 * 3 3 3 3 3
 * 0 2 3 0 0
 * 3 0 0 1 3
 * There is no path to reach at (3,1) i,e at
 * destination from (4,3) i,e source.
 * Example 2:
 *
 * Input: grid = {{1,3},{3,2}}
 * Output: 1
 * Explanation: The grid is-
 * 1 3
 * 3 2
 * There is a path from (0,0) i,e source to (1,1)
 * i,e destination.
 */
public class FindWhetherPathExits {
    public static void main(String[] args) {
        int[][] mat = {
                {3, 0, 3, 0, 0},
                {3, 0, 0, 0, 3},
                {3, 3, 3, 3, 3},
                {0, 2, 3, 0, 0},
                {3, 0, 0, 1, 3}
        };

        ArrayList<ArrayList<Integer>> al = returnAdjacent(mat, mat.length);
        for(int i = 0;i<al.size();i++){
            for (int j = 0;j<al.get(i).size();j++){
                System.out.print(i+" "+al.get(i).toString());
            }
        }
    }

    public static boolean isSafe(int i, int j, int [][] m){
        int N = m.length;
        if ((i < 0 || i >= N) || (j < 0 || j >= N) || m[i][j] == 0)
            return false;
        return true;
    }

    public static ArrayList<ArrayList<Integer>> returnAdjacent(int[][] mat, int m){
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for(int i = 0;i<m;i++){
            ArrayList<Integer> temp;
            for(int j = 0;j<mat.length;j++) {
                if (mat[i][j] != 0) {
                    temp = new ArrayList<>();
                    if (isSafe(i, j + 1, mat)) {
                        temp.add(mat[i][j + 1]);
                    }
                    if (isSafe(i, j - 1, mat)) {
                        temp.add(mat[i][j - 1]);
                    }
                    if (i < m - 1 && isSafe(i + 1, j, mat)) {
                        temp.add(mat[i + 1][j]);
                    }
                    if (i > 0 && isSafe(i, j + 1, mat)) {
                        temp.add(mat[i][j + 1]);
                    }

                    al.add(i, temp);
                }
            }
        }
        return al;
    }
}
