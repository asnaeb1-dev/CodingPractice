package BinaryTree;

import java.util.TreeMap;

public class DiameterOfTree {
        TreeMap<Integer, Integer> tm = new TreeMap<>();

    /**
     * The diameter of a tree T is the largest of the following quantities:
     *
     * the diameter of T’s left subtree.
     * the diameter of T’s right subtree.
     * the longest path between leaves that goes through the root of T (this can be computed from the heights of the subtrees of T)
     */
    int diameter(TreeNode root) {

        // Your code here
        if(root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);

        int ld = diameter(root.left);
        int rd = diameter(root.right);

        return Math.max((1 + lh + rh), Math.max(ld, rd));
    }

    int height(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
