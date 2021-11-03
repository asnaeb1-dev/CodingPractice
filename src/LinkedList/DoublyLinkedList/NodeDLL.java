package LinkedList.DoublyLinkedList;

/**
 * Node class of Doubly linked list
 */
public class NodeDLL {
    public int data;
    public NodeDLL prev;
    public NodeDLL nextNode;

    public NodeDLL(int data) {
        this.data = data;
        this.prev = null;
        this.nextNode = null;
    }
}
