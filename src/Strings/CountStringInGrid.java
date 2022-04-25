package Strings;

public class CountStringInGrid {
    public static void main(String[] args) {
        char[][] g = {
                {'a', 'b', 'c', 'e'},
                {'s', 'f', 'c', 's'},
                {'a', 'd', 'e', 'e'}
            };
        boolean res = exist(g, "abcced");
        System.out.println(res);
    }
    public static boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        boolean[][] vis;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                vis = new boolean[n][m];
                boolean f = isFound(board, i, j, 0, n, m, word, vis);
                if(f){
                    System.out.println(i +", "+ j);
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isFound(char[][] g, int i, int j, int k, int n, int m, String s, boolean[][] vis){
        if(k > s.length() - 1) return true;
        if(i < 0 || j < 0 || i >= n || j >= m) return false;
        if(vis[i][j]) return false;
        if(s.charAt(k) != g[i][j]) return false;
        System.out.println(s.charAt(k));
        vis[i][j] = true;
        isFound(g, i + 1, j, k + 1, n, m, s, vis);
        isFound(g, i - 1, j, k + 1, n, m, s, vis);
        isFound(g, i, j + 1, k + 1, n, m, s, vis);
        return isFound(g, i, j - 1, k + 1, n, m, s, vis);
    }
}
