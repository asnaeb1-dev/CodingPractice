package GraphDS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i = 0;i<V;i++){
            ArrayList<Integer> al = new ArrayList<>();
            adjList.add(al);
        }

        //completely connected graph
//        addEdge(adjList, 0, 1);
//        addEdge(adjList, 0, 2);
//        addEdge(adjList, 1, 2);
//        addEdge(adjList, 1, 3);
//        addEdge(adjList, 2, 3);
//        bfs(adjList, V, 0);

        //for disconected graph
        addEdge(adjList, 0, 1);
        addEdge(adjList, 0, 2);
        addEdge(adjList, 1, 2);

        boolean[] v = new boolean[V + 1];
        for(int i = 0;i<V;i++){
            if(!v[i]){
                bfs(adjList, V, v, i);
            }
        }

    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    private static void bfs(ArrayList<ArrayList<Integer>> adj, int V, boolean[] visited, int s){
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        visited[0] = true;
        while(!q.isEmpty()){
            int u = q.poll();
            System.out.println(u);
            for(int v : adj.get(u)){
                if(!visited[v]){
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
    }
}
