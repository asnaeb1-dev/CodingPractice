package GreedyAlgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ActivitySelectionProblem {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(1);
        temp.add(2);
        al.add(temp);
        temp = new ArrayList<>();
        temp.add(3);
        temp.add(4);
        al.add(temp);
        temp = new ArrayList<>();
        temp.add(2);
        temp.add(3);
        al.add(temp);
        temp = new ArrayList<>();
        temp.add(5);
        temp.add(6);
        al.add(temp);

        System.out.println(selectActivities(al, al.size()));
    }
    private static int selectActivities(ArrayList<ArrayList<Integer>> act, int n){
        Collections.sort(act, (o1, o2) -> o1.get(1).compareTo(o2.get(1)));
        int c = 1;
        ArrayList<Integer> temp = act.get(0);
        for(int i = 1;i<act.size();i++){
            if(temp.get(1) <= act.get(i).get(0)){
                c++;
                temp = act.get(i);
            }
        }
        return c;
    }
}
