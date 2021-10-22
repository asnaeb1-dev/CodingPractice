package GraphDS;

import java.util.ArrayList;

/**Question --->
 * Given a connected undirected graph. Perform a Depth First Traversal of the graph.
 * Note: Use recursive approach to find the DFS traversal
 * of the graph starting from the 0th vertex from left to right according to the graph..
 */
public class DepthFirstSearch {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] vis = new boolean[V];
        for(int i = 0;i<V;i++){
            if(!vis[i]){
                dfsHelper(adj, result, i, vis);
            }
        }
        return result;
    }
    private static void dfsHelper(ArrayList<ArrayList<Integer>> adj,
                                  ArrayList<Integer> result, int u, boolean[] vis){

        vis[u] = true;
        result.add(u);
        for(Integer v : adj.get(u)){
            if(!vis[v]){
                dfsHelper(adj, result, v, vis);
            }
        }
    }
}
