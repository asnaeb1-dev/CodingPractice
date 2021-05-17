package GreedyAlgo;

import java.util.ArrayList;
import java.util.Collections;

public class JobSchedulingProblem {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> jobs = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(1);
        temp.add(2);
        temp.add(100);
        jobs.add(temp);
        temp = new ArrayList<>();
        temp.add(2);
        temp.add(1);
        temp.add(19);
        jobs.add(temp);
        temp = new ArrayList<>();
        temp.add(3);
        temp.add(1);
        temp.add(27);
        jobs.add(temp);

        System.out.println(maxProfit(jobs, 3));
    }
    private static int maxProfit(ArrayList<ArrayList<Integer>> jobs, int n){
        Collections.sort(jobs, ((o1, o2) -> o1.get(2).compareTo(o2.get(2))));
        System.out.println(jobs.toString());
        int[] schedule = new int[n + 1];
        //schedule[jobs.get(0).get(0)] =
        return -1;
    }
}
