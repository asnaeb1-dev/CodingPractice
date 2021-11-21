package BinaryTree;

public class SizeOfTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(4);

        System.out.println(count(root));
    }
    private static int count(TreeNode root){
        if(root == null) return 0;
        return 1 + count(root.left) + count(root.right);
    }
}
