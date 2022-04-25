package LinkedList;

public class CircularLinkedList {
    private static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node head = insertAtBegin(10, null);
        insertAtBegin(20, head);
        insertAtBegin(30, head);

        printList(head);
    }

    private static void printList(Node head){
        Node curr = head;
        while(curr.next != head){
            System.out.print(curr.data +" ");
        }
        System.out.println();
    }

    private static Node insertAtBegin(int d, Node head){
        //technique 1:
        Node node = new Node(d);
        if(head == null){
            head = node;
            head.next = head;
        }else{
            Node curr = head;
            while(curr.next != head){
                curr = curr.next;
            }

            curr.next = node;
            node.next = head;
        }

        //technique 2: we can enter the new node after the head node and swap the data of that node and the head node

        return head;
    }

    private static Node insertAtEnd(Node head, int d){
        //idea is to insert a node after head; and swap the node and the head data and then move the head forward
        Node node = new Node(d);
        if(head == null){
            head = node;
            head.next = head;
        }else{
            node.next = head.next;
            head.next = node;

            int t = node.data;
            node.data = head.data;
            head.data = t;

            head = head.next;
        }
        return head;
    }

    private static Node deleteHeadNode(Node head){
        if(head == null) return null;
        if(head.next == null){
            head = null;
            return head;
        }
        int t = head.data;
        head.data = head.next.data;
        head.next.data = t;

        head.next = head.next.next;
        return head;
    }

    private static Node deleteKNode(Node head, int K){
        if(K == 1){
            return deleteHeadNode(head);
        }else{
            Node prev = null;
            Node curr = head;
            for(int i = 1;i<K && curr.next != head;i++){
                prev = curr;
                curr = curr.next;
            }
            prev.next = curr.next;
        }
        return head;
    }
}
