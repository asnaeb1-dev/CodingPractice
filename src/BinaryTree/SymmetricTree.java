package BinaryTree;

/**Question --->
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return false;
        return checkSymmetry(root.left, root.right);
    }
    public static boolean checkSymmetry(TreeNode leftS, TreeNode rightS){
        if(leftS == null && rightS == null) return true;
        if(leftS != null && rightS != null){
            if(leftS.data != rightS.data){
                return false;
            }
        }else
        if(leftS != null || rightS != null) return false;
        return checkSymmetry(leftS.left, rightS.right) && checkSymmetry(leftS.right, rightS.left);

    }
}
