package BinaryTree;

import java.util.ArrayList;

public class KthAncestor {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.left.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println(kthAncestor(root, 6, 2));
    }
    private static int kthAncestor(TreeNode node, int x, int k){
        ArrayList<Integer> path = new ArrayList<>();
        traverse(node, path, x);
        //System.out.println(path);
        if(k > path.size()){
            return -1;
        }
        return path.get(path.size() - k);
    }
    private static boolean traverse(TreeNode root, ArrayList<Integer> al, int x){
        if(root == null) return false;
        if(root.data == x){
            //System.out.println(al);
            return true;
        }
        al.add(root.data);
        if(traverse(root.left, al, x) ||traverse(root.right, al, x)){
            return true;
        }
        al.remove(al.size() - 1);
        return false;
    }
}
