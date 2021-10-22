package GraphDS;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertRepresentation {
    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i = 0;i<V;i++){
            ArrayList<Integer> al = new ArrayList<>();
            adjList.add(al);
        }

        //completely connected graph
        addEdge(adjList, 0, 1);
        addEdge(adjList, 0, 2);
        addEdge(adjList, 1, 2);
        addEdge(adjList, 1, 3);
        addEdge(adjList, 2, 3);

        int[][] m = adj(adjList, V);
//        for(int[] i : m){
//            System.out.println(Arrays.toString(i));
//        }

//        ArrayList<ArrayList<Integer>> ret = fromMatrixToList(m, m.length);
//        for (int i = 0;i<ret.size();i++){
//            System.out.print(i +"-> ");
//            for (int j = 0;j<ret.get(i).size();j++){
//                System.out.print(ret.get(i).get(j) +" ");
//            }
//            System.out.println();
//        }
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    private static int[][] adj(ArrayList<ArrayList<Integer>> al, int V){
        int[][] mat = new int[V][V];
        for(int i = 0;i< V ;i++){
            for(int j = 0;j<al.get(i).size();j++){
                mat[i][al.get(i).get(j)] = 1;
            }
        }
        return mat;
    }

    public ArrayList<ArrayList<Integer>> fromMatrixToList(int[][] mat, int n){
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>(n);
        for(int i = 0;i<n;i++){
            ArrayList<Integer> al = new ArrayList<>();
            for(int j = 0;j<n;j++){
                if(mat[i][j] == 1){
                    al.add(j);
                }
            }
            adjList.add(al);
        }
        return adjList;
    }
}
