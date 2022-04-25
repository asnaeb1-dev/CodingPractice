package StackDS;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingDq {
    public static void main(String[] args) {
        Deque<Integer> q = new LinkedList<>();
        push(q, 10);
        push(q, 20);
        push(q, 30);
        System.out.println(pop(q));
    }
    private static void push(Deque<Integer> s, int data){
        s.add(data);
    }
    private static int pop(Deque<Integer> s){
        if(s.isEmpty()) return -1;
        return s.removeLast();
    }
}
