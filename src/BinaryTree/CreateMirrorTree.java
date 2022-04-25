package BinaryTree;

import java.util.ArrayList;

public class CreateMirrorTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }
    /*
         5
       / \
      3   6
     / \
    2   4
     */
    public static void main(String[] args) {
        Node node = new Node(5);
        node.left = new Node(3);
        node.right = new Node(6);
        node.left.left = new Node(2);
        node.left.right = new Node(4);


        inorder(node);
        create(node);
        System.out.println();
        inorder(node);
    }

    private static void inorder(Node root){
        if(root == null) return;;
        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);
    }

    private static void create(Node root){
        if(root == null) return;
        create(root.left);
        create(root.right);
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

    }
}
