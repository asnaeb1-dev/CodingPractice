package GraphDS;

import java.util.ArrayList;

public class AdjacencyListImplementation {
    public static void main(String[] args) {
        int v = 4;
        ArrayList<ArrayList<Integer>> res = adjacencyList(v);
        System.out.println("Graph connections ------> ");
        for(int i = 0;i<res.size();i++){
            for (int j = 0;j<res.get(i).size();j++){
                System.out.print(i +" -> "+ res.get(i).get(j) + "  ");
            }
            System.out.println();
        }
    }
    private static ArrayList<ArrayList<Integer>> adjacencyList(int v){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(v);
        for(int i = 0;i<v;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            list.add(temp);
        }
        list.get(0).add(1);
        list.get(0).add(2);
        list.get(1).add(0);
        list.get(1).add(2);
        list.get(1).add(3);
        list.get(2).add(0);
        list.get(2).add(1);
        list.get(3).add(1);
        return list;
    }
}
