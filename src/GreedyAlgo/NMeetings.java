package GreedyAlgo;

import java.util.ArrayList;
import java.util.Collections;

/**Question-->
 * There is one meeting room in a firm.
 * There are N meetings in the form of (S[i], F[i]) where S[i] is start time of meeting i and F[i] is finish time of meeting i.
 * What is the maximum number of meetings that can be accommodated in the meeting room when only one meeting can be held in the meeting room at a particular time?
 * Also note start time of one chosen meeting can't be equal to the end time of the other chosen meeting.
 *
 * Example 1:
 *
 * Input:
 * N = 6
 * S[] = {1,3,0,5,8,5}
 * F[] = {2,4,6,7,9,9}
 * Output:
 * 4
 * Explanation:
 * Four meetings can be held with
 * given start and end timings.
 * Example 2:
 *
 * Input:
 * N = 8
 * S[] = {75250, 50074, 43659, 8931, 11273,
 * 27545, 50879, 77924}
 * F[] = {112960, 114515, 81825, 93424, 54316,
 * 35533, 73383, 160252}
 * Output:
 * 3
 * Explanation:
 * Only three meetings can be held
 * with given start and end timings.
 */

public class NMeetings {
    public static void main(String[] args) {
        int[] s = {75250, 50074, 43659, 8931, 11273, 27545, 50879, 77924};
        int[] f = {112960, 114515, 81825, 93424, 54316, 35533, 73383, 160252};

        System.out.println(meetings(s, f));
    }
    private static int meetings(int[] s, int[] f){
        ArrayList<ArrayList<Integer>> tasks = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0;i<s.length;i++){
            temp.add(s[i]);
            temp.add(f[i]);
            tasks.add(temp);
            temp = new ArrayList<>();
        }

        Collections.sort(tasks, ((o1, o2) -> o1.get(1).compareTo(o2.get(1))));
        int c = 1;
        int prev = tasks.get(0).get(1);
        for(int i = 1;i<s.length;i++){
            if(tasks.get(i).get(0) > prev){
                c++;
                prev = tasks.get(i).get(1);
            }
        }
        return c;
    }
}
