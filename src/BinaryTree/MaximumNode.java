package BinaryTree;

public class MaximumNode {
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(2);
        max(root);
        System.out.println(max);
    }
    private static void max(TreeNode root){
        if(root == null) return;
        max(root.left);
        max = Math.max(root.data, max);
        max(root.right);
    }
}
