package BinaryTree;

public class PrintLeaf {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        print(root);
    }
    private static void print(TreeNode node){
        if(node == null) return;
        print(node.left);
        if(node.left == null && node.right == null){
            System.out.println(node.data);
        }
        print(node.right);
    }
}
