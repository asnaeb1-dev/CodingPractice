package StackDS;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueue {
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    //Function to push an element into stack using two queues.
    void push(int a){
        // Your code here
        q1.add(a);
    }

    //Function to pop an element from stack using two queues.
    int pop(){
        // Your code here
        if(q1.isEmpty()) return -1;
        int i = 0;
        while(i < q1.size() - 1){
            q2.add(q1.poll());
        }
        int del =q1.poll();
        while(!q2.isEmpty()){
            q1.add(q2.poll());
        }
        return del;
    }

    public static void main(String[] args) {
        StackUsingTwoQueue stack = new StackUsingTwoQueue();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
    }
}
