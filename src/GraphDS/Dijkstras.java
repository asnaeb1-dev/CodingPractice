package GraphDS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Dijkstras {

    static class Node{
        int distance;
        int vertex;

        public Node(int distance, int vertex) {
            this.distance = distance;
            this.vertex = vertex;
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Node>> adj = new ArrayList<>();
        for(int i = 0;i<V;i++){
            adj.add(new ArrayList<Node>());
        }
        addEdge(adj, 0, 1, 2);
        addEdge(adj, 0, 3, 1);
        addEdge(adj, 1, 2, 4);
        addEdge(adj, 1, 4, 5);
        addEdge(adj, 2, 3, 3);
        addEdge(adj, 2, 4, 1);

        dijkstras(adj, 5);
    }

    private static void addEdge(ArrayList<ArrayList<Node>> adj, int u, int v, int dist){
        adj.get(u).add(new Node(dist, v));
        adj.get(v).add(new Node(dist, u));
    }

    private static void dijkstras(ArrayList<ArrayList<Node>> adj, int V){
        PriorityQueue<Node> pq = new PriorityQueue<>(((o1, o2) -> o1.distance - o2.distance));
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        boolean[] vis = new boolean[V];

        while(!pq.isEmpty()){
            Node u = pq.remove();
            vis[u.vertex] = true;
            for(Node v : adj.get(u.vertex)){
                if(!vis[v.vertex] && dist[u.vertex] + adj.get(u.vertex).get(v.vertex).distance < dist[v.vertex]){
                    dist[v.vertex] = dist[u.vertex] + adj.get(u.vertex).get(v.vertex).distance;
                    pq.add(new Node(dist[v.vertex], v.vertex));
                }
            }
        }

        for(int i : dist){
            System.out.println(i);
        }
    }
}
