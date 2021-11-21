package BinaryTree;

public class ChildrenParentSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(10);
        root.right = null;
        System.out.println(isSumProperty(root));
    }
    public static int isSumProperty(TreeNode root){
        // add your code here

        if(isSum(root)){
            return 1;
        }
        return 0;
    }
    //using dfs
    private static boolean isSum(TreeNode root){
        if(root == null) {
            return true;
        }
        if(root.left == null && root.right == null){
            return true;
        }
        if(root.left != null && root.right != null){
            if(root.left.data + root.right.data != root.data){
                return false;
            }
        }
        if(root.left == null){
            if(root.right.data != root.data){
                return false;
            }
        }
        if(root.right == null){
            if(root.left.data != root.data){
                return false;
            }
        }
        return isSum(root.left) && isSum(root.right);
    }
    //using bfs
}
