package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DiagonalTraversal {
    private static ArrayList<Integer> diagonal(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Integer> al = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            al.add(temp.data);
            while (temp != null){
                if(temp.left != null){
                    q.add(temp.left);
                    System.out.println(q.peek().data);
                }
                if(temp.right != null){
                    al.add(temp.right.data);
                }
                temp = temp.right;
            }
        }
        return al;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.right.right = new TreeNode(5);
        root.right.right.left = new TreeNode(2);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.left.right.right = new TreeNode(7);
        root.left.right.left = new TreeNode(4);

        ArrayList<Integer> al = diagonal(root);
        for (Integer i : al){
            System.out.print(i +" ");
        }
        System.out.println();
    }
}
