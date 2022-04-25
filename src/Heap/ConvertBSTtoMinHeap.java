package Heap;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *     input        4
 *                /   \
 *               2     6
 *             /  \   /  \
 *            1   3  5    7
 *
 *
 *    output       1
 *               /   \
 *              2     5
 *            /  \   /  \
 *           3   4  6    7
 *
 *    condition: all the values on the left subtree must be smaller than all the values on the right subtree
 */
public class ConvertBSTtoMinHeap {
    static private class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(7);

        Node r = transform(root);
        preorder(r);
    }

    private static Node transform(Node root){

        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);
        return populate(inorder);
    }

    private static void preorder(Node root){
        if(root == null) return;;
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    private static void getInorder(Node root, ArrayList<Integer> al){
        if(root == null) return;
        getInorder(root.left, al);
        al.add(root.data);
        getInorder(root.right, al);
    }

    static int index = 0;
    private static Node populate(ArrayList<Integer> al){
        if(index == al.size()) return null;
        Node node = new Node(al.get(index++));
        node.left = populate(al);
        node.right = populate(al);
        return node;
    }
}
