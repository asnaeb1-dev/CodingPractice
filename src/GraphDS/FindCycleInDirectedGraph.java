package GraphDS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**Question --->
 * Given a Directed Graph with V vertices (Numbered from 0 to V-1) and E edges, check whether it contains any cycle or not.
 */
//Solution --> Use Kahn's Algorithm but modified
/**
 * Idea - When we observe the Kahn's algorithm for topological sorting and introduce a count variable, we notice that the count of all the
 * vertices having 0 in-degrees will never be equals to nos. of vertices V when a cycle exists.
 * If a cycle doesn't exist then count shall always be equals to V as there are no cycles in the graph and all the vertices are independent.
 */
public class FindCycleInDirectedGraph {
    public static void main(String[] args) {

    }
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        int[] indegree = new int[V];
        getIndegrees(V, adj, indegree);
        Queue<Integer> q = new LinkedList<>();
        int c = 0;
        for(int i = 0;i<V;i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int u = q.poll();
            for(int v : adj.get(u)){
                indegree[v]--;
                if(indegree[v] == 0){
                    q.add(v);
                }
            }
            c++;
        }
        return c < V;
    }
    private void getIndegrees(int V, ArrayList<ArrayList<Integer>> adj, int[] indegree){
        for(int i = 0;i<adj.size();i++){
            for(int j = 0;j<adj.get(i).size();j++){
                indegree[adj.get(i).get(j)]++;
            }
        }
    }
}
