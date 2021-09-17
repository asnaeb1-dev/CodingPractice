package GraphDS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort {
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // add your code here
        int[] degree = new int[V];
        getIndegree(V, adj, degree);
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0;i<V;i++){
            if(degree[i] == 0){
                q.add(i);
            }
        }
        int[] r = new int[V];
        int k = 0;
        while(!q.isEmpty()){
            Integer u = q.poll();
            r[k] = u;
            k++;
            for(Integer v : adj.get(u)){
                degree[v]--;
                if(degree[v] == 0){
                    q.add(v);
                }
            }
        }
        //System.out.println(Arrays.toString(r));
        return r;
    }
    private static void getIndegree(int V, ArrayList<ArrayList<Integer>> adj, int[] degree){
        for(int i = 0;i<V;i++){
            for(Integer v : adj.get(i)){
                degree[v]++;
            }
        }
    }
}
