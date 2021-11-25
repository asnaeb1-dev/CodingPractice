package BinaryTree;

public class FindSubTreeSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println(subtreeSum(root.left) + subtreeSum(root.right));
    }
    private static int subtreeSum(TreeNode root){
        if(root == null) return 0;
        return subtreeSum(root.left) + subtreeSum(root.right) + root.data;
    }
}
