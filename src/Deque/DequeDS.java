package Deque;

public class DequeDS {
    int capacity;
    int[] arr;
    int front, back;

    public DequeDS(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = capacity/2;
        back = capacity/2;
    }

    private void pushFront(int data){
        if(front != 0){
            arr[front] = data;
            front--;
        }else{
            System.out.println("Queue is at capacity");
        }
    }
    private void pushBack(int data){
        if(back != capacity - 1){
            arr[back] = data;
            back++;
        }else{
            System.out.println("Queue is at capacity");
        }
    }
    private int removeFront(){
        if(front != capacity / 2){
            int d = arr[front];
            front++;
            return d;
        }
        return -1;
    }
    private int removeBack(){
        if(back != capacity /2){
            int d = arr[back];
            back--;
            return d;
        }
        return -1;
    }
    private int size(){
        return back - front;
    }
    private void display(){
        for(int i = front; i<=back;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DequeDS dq = new DequeDS(10);
        dq.pushBack(10);
        dq.pushFront(30);
        dq.display();
    }
}
