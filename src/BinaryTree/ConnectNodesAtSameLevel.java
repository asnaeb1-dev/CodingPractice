package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
//Complete Solution -- > https://practice.geeksforgeeks.org/problems/connect-nodes-at-same-level/0/?track=DSASP-Tree&batchId=154#
public class ConnectNodesAtSameLevel {
    public void connect(TreeNode root)
    {
        // Your code goes here.
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        TreeNode prev = null;
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(prev != null){
                //prev.nextRight = curr;
            }
            prev = curr;
            if(curr == null){
                if(!q.isEmpty()){
                    prev = null;
                    q.add(null);
                }
            }else{
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
    }
}
