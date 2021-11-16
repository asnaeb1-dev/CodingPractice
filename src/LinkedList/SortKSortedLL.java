package LinkedList;

import java.util.PriorityQueue;

public class SortKSortedLL {
    public static void main(String[] args) {
        int[] a = {9, 8, 7, 19, 18};
        int k = 2;
        LLNode head = new LLNode(-1), temp = head;
        for (int j : a) {
            temp.next = new LLNode(j);
            temp = temp.next;
        }
        LLNode curr = sort(head.next, k);
        while (curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }
    private static LLNode sort(LLNode head, int k){
        //Step 1: Make a priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        LLNode curr = head;
        //Step 2: Insert first k + 1 elements into the priority queue
        for(int i = 0;curr!= null && i<=k;i++){
            pq.add(curr.data);
            curr = curr.next;
        }
        //Step 3: start another pointer from the head, "temp" here
        LLNode temp = head;
        //Step 4: traverse rest of the ll
        while(curr != null){
            //Step 5: Remove an element from the priority Queue and since its a min heap, everytime, the minimum element will be popped
            //change the value of the temp pointer with the obtained value of the pq
            temp.data = pq.remove();
            //Step 6: Move to the next pointer
            temp = temp.next;
            //Step 7: Add the next element from the linked list into the priority queue
            pq.add(curr.data);
            curr = curr.next;
        }
        //Step 8: Now, after everything is done, simply pop all the elements from the pq and add the data to the linked list
        while (!pq.isEmpty()){
            temp.data = pq.remove();
            temp = temp.next;
        }
        return head;
    }
}
