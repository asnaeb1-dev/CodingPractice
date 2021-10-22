package GraphDS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**Question --->
 * Given a Directed Acyclic Graph (DAG) with V vertices and E edges, Find any Topological Sorting of that Graph.
 */

public class TopologicalSort {
    public static void main(String[] args) {

    }
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // add your code here
        int[] d = new int[V];
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0;i<V;i++){
            if(d[i] == 0){
                q.add(d[i]);
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        int k = 0;
        while(!q.isEmpty()){
            int u = q.poll();
            al.add(u);
            for(int v : adj.get(u)){
                if(d[v] > 0){
                    d[v]--;
                }else if(d[v] == 0){
                    q.add(d[v]);
                }
            }
        }
        int r[] = new int[al.size()];
        for(int i = 0;i<r.length;i++){
            r[i] = al.get(i);
        }
        //System.out.println(Arrays.toString(r));
        return r;
    }
    private static void getIndegree(int V, ArrayList<ArrayList<Integer>> adj, int[] degree){
        for(int i = 0;i<adj.size();i++){
            for(int j = 0;j<adj.get(i).size();j++){
                degree[adj.get(i).get(j)]++;
            }
        }
    }
}
