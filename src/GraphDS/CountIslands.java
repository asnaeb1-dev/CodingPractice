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
       // System.out.println(numIslands(g));
    }
    public static int numIslands(char[][] grid)
    {
        int island = 0;
        int V = Math.max(grid.length, grid[0].length);
        System.out.println(V);
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0;i<V;i++){
            ArrayList<Integer> temp = new ArrayList<>();
        }
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                if(grid[i][j] == 1){
                    adj.get(i).add(j);
                }
            }
        }

        boolean[] vis = new boolean[V];
        for(int i = 0;i< V;i++){
            if(!vis[i]){
                island++;
                dfs(vis, adj , i);
            }
        }
        return island;
    }
    private static void dfs(boolean[] vis, ArrayList<ArrayList<Integer>> adj, int s){
        vis[s] = true;
        for(int v : adj.get(s)){
            if(!vis[v]){
                vis[v] = true;
                dfs(vis, adj, v);
            }
        }
    }
}
