package Backtracking;

import java.util.Arrays;

public class RatInAMaze {
    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };
        int[][] sol = new int[maze.length][maze.length];
        ratInMaze(maze, 0, 0, maze.length, sol);
        for(int[] m : sol){
            System.out.println(Arrays.toString(m));
        }
    }
    private static void ratInMaze(int[][] mat, int i, int j, int n, int[][] sol){
        if(i == n - 1 && j == n - 1){
            if(mat[i][j] == 1){
                sol[i][j] = 1;
                return;
            }
        }
        if(i < n && j<n){
            if(mat[i][j] == 0){
                sol[i][j] = 0;
                return;
            }
            sol[i][j] = 1;
            ratInMaze(mat, i + 1, j, n, sol);
            ratInMaze(mat, i, j + 1, n, sol);
        }
    }
}
