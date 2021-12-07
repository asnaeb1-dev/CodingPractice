package BinaryTree.BST;

import java.util.HashSet;
import java.util.Set;

/**Question ---->
 * Given a Binary search Tree that contains positive integer values greater then 0.
 * The task is to complete the function isDeadEnd which returns true if the BST contains a dead end else returns false.
 * Here Dead End means, we are not able to insert any element after that node.
 *
 * Examples:
 *
 * Input :
 *                8
 *              /   \
 *            5      9
 *          /  \
 *         2    7
 *        /
 *       1
 *
 * Output : Yes
 * Explanation : Node "1" is the dead End because after that
 *               we cant insert any element.
 *
 * Input :
 *               8
 *             /   \
 *            7     10
 *          /      /   \
 *         2      9     13
 *
 * Output : Yes
 * Explanation : We can't insert any element at
 *               node 9.
 */
public class DeadEnd {
    public static void main(String[] args) {
        TreeNodeBST root = new TreeNodeBST(8);
        root.left = new TreeNodeBST(7);
        root.left.left = new TreeNodeBST(2);
        root.right = new TreeNodeBST(10);
        root.right.right = new TreeNodeBST(13);
        root.right.left = new TreeNodeBST(9);

        //System.out.println(isDeadEnd(root));
        System.out.println(checkDeadEnd(root));
    }

    private static boolean checkDeadEnd(TreeNodeBST root){
        return check(root, 1, Integer.MAX_VALUE);
    }

    private static boolean check(TreeNodeBST root, int lr, int rr){
        if(root == null) return false;
        if(lr == rr) return true;
        return check(root.left, lr, root.data - 1) || check(root.right, root.data + 1, rr);
    }

    public static boolean isDeadEnd(TreeNodeBST root){
        //Add your code here.
        Set<Integer> set = new HashSet<>();
        traverse(root, set);
        boolean b = isDead(root, set);
        if(b){
            return true;
        }
        return false;
    }

    private static boolean isDead(TreeNodeBST root, Set<Integer> set){
        if(root == null) return false;
        if(root.left == null && root.right == null){
            if(set.contains(root.data + 1) && (root.data - 1 < 0 || set.contains(root.data - 1))){
                return true;
            }
        }
        return isDead(root.left, set) || isDead(root.right, set);
    }

    private static void traverse(TreeNodeBST root, Set<Integer> set){
        if(root == null) return;
        set.add(root.data);
        traverse(root.left, set);
        traverse(root.right, set);
    }
}
