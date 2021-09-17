package BinaryTree.BST;

import java.util.HashSet;

/**Question
 * Given two BSTs containing N1 and N2 distinct nodes respectively and given a value x.
 * Your task is to complete the function countPairs(), that returns the count of all pairs from both the BSTs whose sum is equal to x.
 *
 * Example 1:
 *
 * Input:
 * BST1:
 *        5
 *      /   \
 *     3     7
 *    / \   / \
 *   2   4 6   8
 *
 * BST2:
 *        10
 *      /    \
 *     6      15
 *    / \    /  \
 *   3   8  11   18
 *
 * x = 16
 * Output:
 * 3
 * Explanation:
 * The pairs are: (5, 11), (6, 10) and (8, 8)
 *
 *
 * Example 2:
 *
 * Input:
 * BST1:
 *   1
 *    \
 *     3
 *    /
 *   2
 * BST2:
 *     3
 *    / \
 *   2   4
 *  /
 * 1
 *
 * x = 4
 * Output:
 * 3
 * Explanation:
 * The pairs are: (2, 2), (3, 1) and (1, 3)
 */

public class CheckIfPairExist {
    public static int countPairs(TreeNodeBST root1, TreeNodeBST root2, int x)
    {
        // Code here
        int count = 0;
        HashSet<Integer> h1 = new HashSet<>(), h2 = new HashSet<>();
        getList(root1, h1);
        getList(root2, h2);
        for(Integer i : h1){
            if(h2.contains(x - i)){
                count++;
            }
        }
        return count;
    }
    private static void getList(TreeNodeBST root, HashSet<Integer> set){
        if(root == null) return;
        getList(root.left, set);
        set.add(root.data);
        getList(root.right, set);
    }
}
