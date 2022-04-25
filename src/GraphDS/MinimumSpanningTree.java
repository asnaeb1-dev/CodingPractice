package GraphDS;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumSpanningTree {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//        addEdge();
    }
    private static void addEdge(int u, int v, ArrayList<ArrayList<Integer>> adj){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    private static void primsAlgorithm( ArrayList<ArrayList<Integer>> adj, int V){
        int[] key = new int[V];
        boolean[] mstSet = new boolean[V];
        int[] parent = new int[V];

        Arrays.fill(key, Integer.MAX_VALUE);
        Arrays.fill(parent, -1);

        key[0] = 0;

        for(int i = 0;i<V;i++){

            int u = -1;
            int minVal = Integer.MAX_VALUE;
            for(int v = 0;v<V;v++){
                if(key[v] < minVal){
                    minVal = key[v];
                    u = v;
                }
            }
            mstSet[u] = true;
            for(int v : adj.get(u)) {
                if (!mstSet[v] && adj.get(u).get(v) < key[v]) {
                    key[v] = adj.get(u).get(v);
                    parent[v] = u;
                }
            }
        }

        for(int i = 0;i<V;i++){
            System.out.println(parent[i]);
        }

    }
}
