package BinaryTree;

import java.util.*;

public class BottomView {
    class Pair{
        int level;
        TreeNode node;
        Pair(TreeNode node, int level){
            this.node = node;
            this.level = level;
        }
    }
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList<Integer> bottomView(TreeNode root){
        // Code here
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        TreeMap<Integer, Integer> map = new TreeMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        while(!q.isEmpty()){
            Pair p = q.poll();
            if(p != null){
                map.put(p.level, p.node.data);
                if(p.node.left != null){
                    q.add(new Pair(p.node.left, p.level - 1));
                }
                if(p.node.right != null){
                    q.add(new Pair(p.node.right, p.level + 1));
                }
            }
        }

        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            al.add(e.getValue());
        }
        return al;
    }
}
