package BinaryTree;

import com.sun.source.tree.Tree;

public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

    }
    private static void invert(TreeNode root){
        if(root == null) return;
        invert(root.left);
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
        invert(root.right);
    }
}
