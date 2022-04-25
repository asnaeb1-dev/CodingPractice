package StackDS;

public class TwoStackInArray {
    int[] stack;
    int CAPACITY;
    int top1, top2;

    public TwoStackInArray(int CAPACITY) {
        stack = new int[CAPACITY];
        this.CAPACITY = CAPACITY;
        top1 = -1;
        top2 = CAPACITY;
    }

    void push1(int x){
        if(top1 + 1 == top2) return;
        stack[++top1] = x;
    }

    void push2(int x){
        if(top2 - 1 == top1) return;
        stack[--top2] = x;
    }

    int pop1(){
        if(top1 == -1) return -1;
        return stack[top1--];
    }

    int pop2(){
        if(top2 == CAPACITY) return -1;
        return stack[top2++];
    }

    boolean isEmpty1(){
        return top1 == -1;
    }

    boolean isEmpty2(){
        return top2 == CAPACITY;
    }

    public static void main(String[] args) {
        TwoStackInArray stack = new TwoStackInArray(20);
        stack.push1(10);
        stack.push1(20);
        stack.push2(40);
        stack.push2(50);

        while(!stack.isEmpty1()){
            System.out.println(stack.pop1());
        }
        while(!stack.isEmpty2()){
            System.out.println(stack.pop2());
        }
    }
}
