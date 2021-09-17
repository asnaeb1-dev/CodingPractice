package BinaryTree;

/**
 * Given two binary trees, the task is to find if both of them are identical or not.
 */
public class IdenticalTrees {
    boolean isIdentical(TreeNode root1, TreeNode root2)
    {
        // Code Here
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        if(root1.data == root2.data){
            return (isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right));
        }
        return false;

    }
}
