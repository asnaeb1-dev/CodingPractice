package QueueDS;

public class LLQueue {
    LLNode front, rear;

    public LLQueue() {
        front = null;
        rear = null;
    }

    private void enqueue(int data){
        LLNode node = new LLNode(data);
        if(front == null){
            front = node;
        }else{
            rear.next = node;
        }
        rear = node;
    }
    private int dequeue(){
        int data = front.data;
        front = front.next;
        return data;
    }

    private void displayQueue(){
        LLNode temp = front;
        while(temp != rear){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
    }

    public static void main(String[] args) {
        LLQueue q = new LLQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.displayQueue();
        q.dequeue();
        q.displayQueue();
    }
}
