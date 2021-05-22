package GraphDS;

import java.util.ArrayList;

/**Q
 * Given an undirected graph with V vertices and E edges, check whether it contains any cycle or not.
 */
public class DetectCycleUndirected {
    public static void main(String[] args) {

    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        boolean[] vis = new boolean[V];
        for(int i = 0;i<V;i++){
            if(!vis[i]){
                if(isCycleRec(adj, vis, i, -1)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean isCycleRec( ArrayList<ArrayList<Integer>> adj, boolean[] vis, int s, int parent){
        //starting from that vertex, so marking it visted
        vis[s] = true;
        //looping through all the v's for the one u
        for(Integer v : adj.get(s)){
            //checking if the next vertex is visted
            if(!vis[v]){
                //if not then mark as true
                vis[v] = true;
                //recursively call for the next vertex by passing "s" as parent
                if(isCycleRec(adj, vis, v, s)){
                    return true;
                }
            }else if(v != parent){
                return true;
            }
        }
        return false;
    }
}
