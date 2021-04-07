package QueueDS;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueue {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();
    public static void main(String[] args) {
        StackUsingTwoQueue stack = new StackUsingTwoQueue();
        stack.push(1);
        //stack.push(15);
        //stack.push(20);

        stack.displayQueue();
        System.out.println(stack.pop());
        stack.displayQueue();
    }
    private  void push(int data){
    }
    private int pop(){
        return  -1;
    }
    private void displayQueue(){
        for(Integer i : q1){
            System.out.print(i +" ");
        }
        System.out.println();
    }
}
