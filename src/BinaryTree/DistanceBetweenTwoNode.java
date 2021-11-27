package BinaryTree;

/**Question ---->
 * Given a binary tree and two node values your task is to find the minimum distance between them.
 *
 * Example 1:
 *
 * Input:
 *         1
 *       /  \
 *      2    3
 * a = 2, b = 3
 * Output: 2
 * Explanation: The tree formed is:
 *        1
 *      /   \
 *     2     3
 * We need the distance between 2 and 3.
 * Being at node 2, we need to take two
 * steps ahead in order to reach node 3.
 * The path followed will be:
 * 2 -> 1 -> 3. Hence, the result is 2.
 */

public class DistanceBetweenTwoNode {
    int findDist(TreeNode root, int a, int b) {
        // Your code here
        TreeNode lca = getLca(root, a, b);
        //System.out.println(lca.data);
        int l = getDist(lca, a);
        int r = getDist(lca, b);
        //System.out.println(l +" " + r);
        return  l + r;
    }
    int getDist(TreeNode root, int target){
        if(root == null) return -1;
        int d = -1;
        if(root.data == target ||
                (d = getDist(root.left, target)) >= 0 ||
                (d = getDist(root.right, target)) >= 0){
            return d + 1;
        }
        return d;
    }

    TreeNode getLca(TreeNode root, int a, int b){
        if(root == null) return null;
        if(root.data == a || root.data == b) return root;
        TreeNode l = getLca(root.left, a, b);
        TreeNode r = getLca(root.right, a, b);
        if(l != null && r != null){
            return root;
        }
        if(l != null){
            return l;
        }
        return r;
    }
}
