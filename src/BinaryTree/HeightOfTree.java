package BinaryTree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class HeightOfTree {
    private static int height(TreeNode node){
        if(node == null){
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }
    private static int heightLOT(TreeNode node){
        ArrayList<Integer> al = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            TreeNode n = q.poll();
            if(n == null){
                al.add(null);
            }else{
                al.add(n.data);
                if(n.left!= null){
                    q.add(n.left);
                }
                if(n.right != null) {
                    q.add(n.right);
                }
            }
        }
        int c = 0;
        for(Integer i : al){
            if(i == null){
                c++;
            }
        }
        return c;
    }
}
