package QueueDS;

public class ArrayImplementationQueue {
    int[] arr;
    int capacity;
    int front, rear;

    public ArrayImplementationQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = 0;
    }
    //FIFO format
    //insert
    private void enqueue(int data){
        if(rear != capacity){
            arr[rear] = data;
            rear++;
        }else{
            System.out.println("Queue is at capacity");
        }
    }
    //remove
    private int dequeue(){
        if(front != rear){
            int d = arr[front];
            front++;
            return d;
        }
        return -1;
    }
    //get size
    private int getSize(){
        return rear - front;
    }
    private int getFront(){
        return arr[front];
    }
    private int getRear(){
        return arr[rear -1];
    }

    private void displayQueue(){
        for(int i = front;i<rear;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayImplementationQueue q = new ArrayImplementationQueue(5);
        q.enqueue(5);
        q.enqueue(15);
        q.enqueue(25);
        q.enqueue(35);
        q.enqueue(45);
        q.displayQueue();
        q.dequeue();
        q.displayQueue();
        System.out.println(q.getFront());
        System.out.println(q.getRear());
        System.out.println(q.getSize());
    }
}
