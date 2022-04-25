package Backtracking;

import java.util.Arrays;

public class KnightTour {
    public static void main(String[] args) {
        int n = 8;
        int[][] mat = new int[n][n];
        for(int i = 0;i<n;i++){
            Arrays.fill(mat[i], -1);
        }

        if(knightOnTour(mat, n, 0, 0, 0)){
            printGrid(mat, mat.length);
        }else{
            System.out.println("Nothing!");
        }
    }

    static void printGrid(int[][] m, int n){
        for(int[] i : m){
            Arrays.toString(i);
        }
    }

    static int[] xMove = {1, 2, 1, 2, -1, -2, -1, -2};
    static int[] yMove = {2, 1, -2, -1, 2, 1, -2, -1};
    private static boolean knightOnTour(int[][] mat, int n, int x, int y, int data){

        if(data == (n * n) - 1) return true;

        for(int i = 0;i<8;i++){
            int xM = x + xMove[i];
            int yM = y + yMove[i];

            if(isSafe(xM, yM, n, mat)){
                mat[xM][yM] = data;
                if(knightOnTour(mat, n, xM, yM, data + 1)) return true;
                mat[xM][yM] = -1;
            }
        }
        return false;
    }

    private static boolean isSafe(int x, int y, int n, int[][] mat){
       if(x < 0 || x >= n || y < 0 || y >= n || mat[x][y] != -1) return false;
       return true;
    }
}
