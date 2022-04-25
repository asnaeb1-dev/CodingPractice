package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPaths {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6}
        };

        traverse(0, 0, grid.length, grid[0].length, grid, "");
    }
    private static void traverse(int x, int y, int n, int m, int[][] grid, String str){
        if(x < 0 || x >= n || y < 0 || y >= m) return;
        if(x == n && y == m){
            System.out.println(str);
            return;
        }

        traverse(x + 1, y, n, m, grid, str + grid[x][y]);
        traverse(x, y + 1, n, m, grid, str + grid[x][y]);
    }
}
