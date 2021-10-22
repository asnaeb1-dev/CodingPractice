package GraphDS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * find the shortest distance in the unweighted graph
 */
public class ShortestDistance {
    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);
        for(int i = 0;i<V;i++){
            ArrayList<Integer> a = new ArrayList<>();
            adj.add(a);
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(2).add(3);

        shortestDistance(adj, V);
    }

    private static void shortestDistance(ArrayList<ArrayList<Integer>> adj, int V){
        boolean[] vis = new boolean[V];
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;

        bfs(adj, vis, 0, dist);
        System.out.println(Arrays.toString(dist));
    }

    private static void bfs(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int s, int[] dist) {
        vis[s] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        while(!q.isEmpty()){
            int u = q.poll();
            for(Integer v : adj.get(u)){
                if(!vis[v]){
                    vis[v] = true;
                    q.add(v);
                    dist[v] = dist[u] + 1;
                }
            }
        }
    }
}
