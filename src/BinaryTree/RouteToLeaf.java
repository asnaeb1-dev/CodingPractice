package BinaryTree;

import java.util.ArrayList;

public class RouteToLeaf {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        ArrayList<Integer> al = new ArrayList<>();
        rootToLeaf(root, al);
    }
    private static void rootToLeaf(TreeNode root, ArrayList<Integer> al){
        if(root == null){
            return;
        }
        al.add(root.data);
        if(root.left == null && root.right == null){
            System.out.println(al.toString());
        }
        rootToLeaf(root.left, al);
        rootToLeaf(root.right, al);
        al.remove(al.size() - 1);
    }
}
