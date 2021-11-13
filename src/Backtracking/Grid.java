package Backtracking;

public class Grid {
    public static void main(String[] args) {
        int[][] g = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        printDiagonal(g, 2, 1, g.length);
    }
    private static void printRowColumn(int[][] g){
        //row
        for(int i = 0;i< g.length;i++){
            System.out.println(g[i][0]);
        }
        //column
        for(int j = 0;j<g.length;j++){
            System.out.print(g[0][j] +" ");
        }
    }
    private static void printDiagonal(int[][] grid, int i, int j, int n){
        //top left
        for(int x = j, y = i; y >=0 && x < n; x++, y --){
            System.out.print(grid[y][x]+" ");
        }
        System.out.println();

        //top right
        for(int x = j, y = i; x>=0 && y < n; x--, y++){
            System.out.print(grid[y][x] +" ");
        }
        System.out.println();

        //bottom right
        for(int x = j, y = i;x<n && y<n;x++, y++){
            System.out.print(grid[y][x] + " ");
        }
        System.out.println();

        //bottom left
        for(int x = j, y = i; x>=0 && y >=0;x--, y--){
            System.out.print(grid[y][x] +" ");
        }
        System.out.println();
    }
}
