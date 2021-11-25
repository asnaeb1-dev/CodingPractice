package BinaryTree;

public class CountSubtreeSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(-10);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(8);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(-4);
        countSubtreesWithSumX(root, 7);
        System.out.println(c);
    }
    static int c = 0;
    static int countSubtreesWithSumX(TreeNode root, int X){
        //Add your code here.
        if(root == null) return 0;
        if(root.data == X) {
            c++;
        }
        if(root.data + isSum(root.left, X) + isSum(root.right, X) == X){
            c++;
        }
        return 1 + countSubtreesWithSumX(root.left, X) + countSubtreesWithSumX(root.right, X);
    }
    static int isSum(TreeNode root, int X){
        if(root == null) return 0;
        return isSum(root.left, X) + isSum(root.right, X);
    }
}
