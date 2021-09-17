package GraphDS;

import java.util.ArrayList;

public class CountIslands {
    public static void main(String[] args) {
        int[][] g = {
                {0, 1},
                {1, 0},
                {1, 1},
                {1, 0}
        };
        countIslands(g);
    }
    private static void countIslands(int[][] mat){
        int V = Math.max(mat.length, mat[0].length);
        int c = dfs(mat, V);
        System.out.println(c);
    }

    private static int dfs(int[][] mat, int v) {
        boolean[] vis = new boolean[v + 1];
        int c = 0;
        for(int i = 0;i<v;i++){
            if(!vis[i]){
                c++;
                dfsRec(mat, vis, i);
            }
        }
        return c;
    }

    private static void dfsRec(int[][] mat, boolean[] vis, int s){
        vis[s] = true;
        for(int v : mat[s]){
            if(!vis[v]){
                dfsRec(mat, vis, v);
            }
        }
    }

}
