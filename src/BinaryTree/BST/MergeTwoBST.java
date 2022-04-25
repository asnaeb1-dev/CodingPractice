package BinaryTree.BST;

public class MergeTwoBST {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

    }

    private static void merge(Node r1, Node r2){
        toLinkedList(r1);
        toLinkedList2(r2);

        Node head = new Node(-1);
    }
    static Node head1 = null, curr1 = null;
    private static void toLinkedList(Node root){
        if(root == null) return;
        toLinkedList(root.left);
        if(head1 == null){
            head1 = root;
            curr1 = root;
        }else{
            curr1.right = root;
            root.left = curr1;
            curr1 = curr1.right;
        }
        toLinkedList(root.right);
    }

    static Node head2 = null, curr2 = null;
    private static void toLinkedList2(Node root){
        if(root == null) return;
        toLinkedList2(root.left);
        if(head2 == null){
            head2 = root;
            curr2= root;
        }else{
            curr2.right = root;
            root.left = curr2;
            curr2 = curr2.right;
        }
        toLinkedList2(root.right);
    }
}
