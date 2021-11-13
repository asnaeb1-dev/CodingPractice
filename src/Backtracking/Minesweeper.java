package Backtracking;

public class Minesweeper {
    public static void main(String[] args) {
        int[][] mineField = {
                {1, 1, 1, 0, 1},
                {1, 1, 0, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1}
        };
        markUnsafeSpots(mineField, mineField.length,mineField[0].length);
        for(int i = 0;i<mineField.length;i++){
            for(int j = 0;j<mineField[0].length;j++){
                System.out.print(mineField[i][j] +" ");
            }
            System.out.println();
        }
    }


    private static void markUnsafeSpots(int[][] g, int n, int m){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(g[i][j] == 0){
                    if(i > 0){
                        g[i - 1][j] = -1;
                    }
                    if(i < n - 1){
                        g[i + 1][j] = -1;
                    }
                    if(j > 0){
                        g[i][j - 1] = -1;
                    }
                    if(j < n - 1){
                        g[i][j + 1] = -1;
                    }
                }
            }
        }
    }
}
