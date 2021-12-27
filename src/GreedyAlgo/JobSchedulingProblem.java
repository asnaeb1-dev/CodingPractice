package GreedyAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Question ==>
 * Given a set of N jobs where each jobi has a deadline and profit associated with it.
 *
 * Each job takes 1 unit of time to complete and only one job can be scheduled at a time.
 * We earn the profit associated with job if and only if the job is completed by its deadline.
 *
 * Find the number of jobs done and the maximum profit.
 *
 * Note: Jobs will be given in the form (Jobid, Deadline, Profit) associated with that Job.
 *
 *
 * Example 1:
 *
 * Input:
 * N = 4
 * Jobs = {(1,4,20),(2,1,10),(3,1,40),(4,1,30)}
 * Output:
 * 2 60
 * Explanation:
 * Job1 and Job3 can be done with
 * maximum profit of 60 (20+40).
 */
public class JobSchedulingProblem {
    static class Job{
        int jobId;
        int deadline;
        int profit;

        public Job(int jobId, int deadline, int profit) {
            this.jobId = jobId;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static void main(String[] args) {
        Job[] jobs = new Job[4];

    }
    int[] JobScheduling(Job arr[], int n){
        Arrays.sort(arr, (o1, o2) -> o2.profit - o1.profit);

        boolean[] isDone = new boolean[n];
        Arrays.fill(isDone, false);
        int jobDone = 0, profit = 0;
        for(int i = 0;i<n;i++){
            for(int j = Integer.min(n - 1, arr[i].deadline - 1);j>=0;j--){
                if(!isDone[j]){
                    isDone[j] = true;
                    profit+=arr[i].profit;
                    jobDone++;
                    break;
                }
            }
        }

        int[] result = new int[2];
        result[0] = jobDone;
        result[1] = profit;
        return result;
    }
}
