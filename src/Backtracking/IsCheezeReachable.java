package Backtracking;

public class IsCheezeReachable {
    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 1, 1, 1, 0, 0, 1},
                {1, 0, 0, 0, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 1, 0, 9, 0, 1, 1},
                {1, 1, 1, 0, 1, 0, 0, 1},
                {1, 0, 1, 0, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1}
        };

        boolean b = isPath(maze, 0, 0, maze.length);
        System.out.println(b);
    }
    private static boolean isPath(int[][] m, int i, int j, int n){
        if(i < 0 || i > n - 1 || j < 0 || j > n - 1) return false;
        if(m[i][j] == 9){
            return true;
        }
        if(m[i][j] == 0) return false;
        m[i][j] = 0;
        if(isPath(m,i + 1, j, n)) return true;
        if(isPath(m,i - 1, j, n)) return true;
        if(isPath(m,i, j + 1, n)) return true;
        if(isPath(m,i, j - 1, n)) return true;
        return false;
    }
}
