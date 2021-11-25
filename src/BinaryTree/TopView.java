package BinaryTree;

import java.util.*;

/**Question --->
 * Given below is a binary tree.
 * The task is to print the top view of binary tree.
 * Top view of a binary tree is the set of nodes visible when the tree is viewed from the top.
 * For the given below tree
 *
 *        1
 *     /     \
 *    2       3
 *   /  \    /   \
 * 4    5  6   7
 *
 * Top view will be: 4 2 1 3 7
 * Note: Return nodes from leftmost node to rightmost node.
 *
 * Example 1:
 *
 * Input:
 *       1
 *    /    \
 *   2      3
 * Output: 2 1 3
 * Example 2:
 *
 * Input:
 *        10
 *     /      \
 *   20        30
 *  /   \    /    \
 * 40   60  90    100
 * Output: 40 20 10 30 100
 * Your Task:
 * Since this is a function problem.
 * You don't have to take input.
 * Just complete the function topView() that takes root node as
 * parameter and returns a list of nodes visible from the top view from left to right.
 *
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(N).
 */
public class TopView {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        System.out.println(topView(root).toString());
    }
    static class Pair{
        int level;
        TreeNode TreeNode;
        public Pair(TreeNode TreeNode, int level){
            this.TreeNode = TreeNode;
            this.level = level;
        }
    }

    static ArrayList<Integer> topView(TreeNode root){
        // add your code
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        TreeMap<Integer, Integer> map = new TreeMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        while(!q.isEmpty()){
            Pair p = q.poll();
            if(p != null){
                if(!map.containsKey(p.level)){
                    map.put(p.level, p.TreeNode.data);
                }
                if(p.TreeNode.left != null){
                    q.add(new Pair(p.TreeNode.left, p.level - 1));
                }
                if(p.TreeNode.right != null){
                    q.add(new Pair(p.TreeNode.right, p.level + 1));
                }
            }
        }

        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            al.add(e.getValue());
        }
        return al;
    }
}
