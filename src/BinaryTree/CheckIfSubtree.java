package BinaryTree;

public class CheckIfSubtree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        if(isSumTree(root)){
            System.out.println("yes!");
        }else{
            System.out.println("No :(");
        }
    }
    static boolean isSumTree(TreeNode root){
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        if(root.data != getSubtreeSum(root.left) + getSubtreeSum(root.right)) {
            return false;
        }
        return isSumTree(root.left) && isSumTree(root.right);
    }
    static int getSubtreeSum(TreeNode root){
        if(root == null) return 0;
        return getSubtreeSum(root.left) + getSubtreeSum(root.right) + root.data;
    }
}
