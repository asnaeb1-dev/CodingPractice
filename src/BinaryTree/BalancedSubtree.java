package BinaryTree;

/**Question
 * Given a binary tree, find if it is height balanced or not.
 * A tree is height balanced if difference between heights of left and right subtrees is not more than one for all nodes of tree.
 */
public class BalancedSubtree {
    boolean isBalanced(TreeNode root)
    {
        // Your code here
        if(root == null){
            return true;
        }
        return (isBalanced(root.left)
                && isBalanced(root.right)
                && Math.abs(height(root.left) - height(root.right)) <= 1);
    }
    int height(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max( height(root.left), height(root.right) );
    }
}
