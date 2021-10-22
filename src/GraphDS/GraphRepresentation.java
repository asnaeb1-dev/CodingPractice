package GraphDS;

import java.util.ArrayList;

/**
 * Adjacency list representation of the a graph
 */
public class GraphRepresentation {
    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i = 0;i<V;i++){
            ArrayList<Integer> al = new ArrayList<>();
            adjList.add(al);
        }

        addEdge(adjList, 0, 1);
        addEdge(adjList, 0, 2);
        addEdge(adjList, 1, 2);
        addEdge(adjList, 1, 3);
        addEdge(adjList, 2, 3);

        printgraph(adjList);
    }
    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    private static void printgraph(ArrayList<ArrayList<Integer>> adj){
        for(int i = 0;i<adj.size();i++){
            System.out.print(i +"-> ");
            for (int j = 0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j)+", ");
            }
            System.out.println();
        }
    }
}
