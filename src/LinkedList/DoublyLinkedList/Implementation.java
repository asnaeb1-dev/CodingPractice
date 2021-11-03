package LinkedList.DoublyLinkedList;

public class Implementation {
    public static void main(String[] args) {
        NodeDLL head = null;
        head = insertAtBegin(10, head);
        head = insertAtBegin(20, head);
        head = insertAtBegin(30, head);

        printList(head);
    }
    private static NodeDLL insertAtBegin(int d, NodeDLL head){
        if(head == null){
            head = new NodeDLL(d);
        }else{
            NodeDLL node = new NodeDLL(d);
            node.nextNode = head;
            head.prev = head;
            head = node;
        }

        return head;
    }

    private static void printList(NodeDLL head){
        while(head != null){
            System.out.print(head.data +" ");
            head = head.nextNode;
        }
    }
}
