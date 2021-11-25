package BinaryTree;

import com.sun.source.tree.Tree;

/**Question --->
 * Given a binary tree, task is to find subtree with maximum sum in tree.
 * Examples:
 *
 *
 * Input :       1
 *             /   \
 *            2      3
 *           / \    / \
 *          4   5  6   7
 * Output : 28
 * As all the tree elements are positive,
 * the largest subtree sum is equal to
 * sum of all tree elements.
 *
 * Input :       1
 *             /    \
 *           -2      3
 *           / \    /  \
 *          4   5  -6   2
 * Output : 7
 * Subtree with largest sum is :  -2
 *                              /  \
 *                             4    5
 * Also, entire tree sum is also 7.
 */
public class FindLargestSubTreeSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(-2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(-6);
        root.right.right = new TreeNode(2);

        largestSubTreeSum(root);
        System.out.println(max);
    }
    static  int max = Integer.MIN_VALUE;
    private static void largestSubTreeSum(TreeNode root){
        if(root == null) return;
        int sum = getSum(root);
        max = Math.max(sum, max);
        largestSubTreeSum(root.left);
        largestSubTreeSum(root.right);
    }
    private static int getSum(TreeNode root){
        if(root == null) return 0;;
        return getSum(root.left) + getSum(root.right) + root.data;
    }
}
