package QueueDS;

import java.util.*;

public class InterleaveHalves {
    public static void main(String[] args) {
        Deque<Integer> q = new LinkedList<>();

        q.add(11);
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(16);
        q.add(17);
        q.add(18);
        q.add(19);
        q.add(20);

        rearrangeQueue(q);
    }
    //using deque
    //Time - O(n) and Space - O(n)
    private static void rearrangeQueue(Deque<Integer> q){
        Stack<Integer> s = new Stack<>();
        int size = q.size() / 2;
        for(int i = 0;i<size;i++){
            s.push(q.removeFirst());
        }

        while(!s.empty()){
            q.add(s.pop());
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<size;i++){
            sb.append(q.removeLast()).append(" ").append(q.removeFirst()).append(" ");
        }
        if(!q.isEmpty()){
            sb.append(q.poll());
        }
        System.out.println(sb.toString());
    }

    private static void rearrangeQueueAlt(Queue<Integer> q){

    }
}
