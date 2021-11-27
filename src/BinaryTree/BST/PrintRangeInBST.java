package BinaryTree.BST;

import java.util.ArrayList;
import java.util.TreeSet;

/**Question ---->
 * Given a Binary Search Tree and a range [low, high]. Find all the numbers in the BST that lie in the given range.
 * Note: Element greater than or equal to root go to the right side.
 *
 * Example 1:
 *
 * Input:
 *        17
 *      /    \
 *     4     18
 *   /   \
 *  2     9
 * l = 4, h = 24
 * Output: 4 9 17 18
 * Example 2:
 *
 * Input:
 *        16
 *      /    \
 *     7     20
 *   /   \
 *  1    10
 * l = 13, h = 23
 * Output: 16 20
 */
public class PrintRangeInBST {
    public static void main(String[] args) {
        TreeNodeBST root = new TreeNodeBST(5);
        root.left = new TreeNodeBST(3);
        root.right = new TreeNodeBST(19);
        root.left.left = new TreeNodeBST(1);
        root.right.left = new TreeNodeBST(10);
        root.right.right = new TreeNodeBST(20);

        ArrayList<Integer> a = printNearNodes(root, 10, 20);
        System.out.println(a.toString());
    }
    public static ArrayList<Integer> printNearNodes(TreeNodeBST root,int low,int high) {
        // code here.
        ArrayList<Integer> al = new ArrayList<>();
        traverse(root, low, high, al);

        return al;
    }
    private static void traverse(TreeNodeBST root, int l, int h, ArrayList<Integer> a){
        if(root == null) return;
        traverse(root.left, l, h, a);
        if(root.data >=l && root.data <= h){
            a.add(root.data);
        }
        traverse(root.right, l, h, a);
    }
}
