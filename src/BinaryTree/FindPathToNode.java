package BinaryTree;

import java.util.ArrayList;

public class FindPathToNode {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        ArrayList<TreeNode> al = new ArrayList<>();
        path(al, root, 3);
        for(TreeNode n : al)
            System.out.println(n.data);
    }
    private static boolean path(ArrayList<TreeNode> al, TreeNode node, int x){
        if(node == null) {
            return false;
        }
        al.add(node);
        if(node.data == x){
            return true;
        }
        if(path(al, node.left, x) || path(al, node.right, x)){
            return true;
        }
        al.remove(al.size() - 1);
        return false;
    }
}
