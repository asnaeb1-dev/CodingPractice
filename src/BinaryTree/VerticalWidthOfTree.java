package BinaryTree;

import java.util.*;

/**
 * Given a Binary Tree of N nodes. Find the vertical width of the tree.
 *
 * Example 1:
 *
 * Input:
 *           1
 *        /    \
 *       2      3
 *      / \    / \
 *     4   5  6   7
 *             \   \
 *              8   9
 * Output: 6
 * Explanation: The width of a binary tree is
 * the number of vertical paths in that tree.
 */
public class VerticalWidthOfTree {
    private static int verticalTraversalRec(TreeNode root){
        Set<Integer> set = new HashSet<>();
        countLevel(root, set, 0);
        return set.size();
    }

    private static void countLevel(TreeNode node, Set<Integer> set, int hd){
        if(node == null) return;
        countLevel(node.left, set, hd - 1);
        set.add(hd);
        countLevel(node.right, set, hd + 1);
    }

    //this is level order traversal
    private static int countLevel(TreeNode root){
        int hd = 0;
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        Map<TreeNode, Integer> map = new HashMap<>();
        q.add(root);
        map.put(root, hd);
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            if(temp != null){
                if(temp.left != null){
                    map.put(temp.left, map.get(temp) - 1);
                    q.add(temp.left);
                }
                if(temp.right != null){
                    map.put(temp.right, map.get(temp) +1);
                    q.add(temp.right);
                }
            }
        }
        Set<Integer> set = new HashSet<>();
        for(Map.Entry<TreeNode, Integer> val : map.entrySet()){
            //System.out.print(val.getValue() + " ");
            set.add(val.getValue());
        }
        return set.size();
    }
}
