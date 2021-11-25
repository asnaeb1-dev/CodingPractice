package BinaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ZigZag {
    static ArrayList<Integer> al = new ArrayList<Integer>();

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);

        ArrayList<Integer> result = zigZagTraversal(root);
        System.out.println(result.toString());
    }
    static ArrayList<Integer> zigZagTraversal(TreeNode root) {
        //Add your code here.
        if (root == null)
            return null;

        boolean even = false;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        ArrayDeque<Integer> s = new ArrayDeque<Integer>();

        q.add(root);
        while (!q.isEmpty()) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                TreeNode curr = q.poll();

                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);

                if (!even)
                    al.add(curr.data);
                else
                    s.push(curr.data);
            }
            if (even)
                while (s.size() != 0)
                    al.add(s.pop());

            even = !even;
        }
        return al;
    }
}
