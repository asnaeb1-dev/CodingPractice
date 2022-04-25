package BinaryTree;

import java.util.ArrayList;

public class RouteToLeaf {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//        root.right.left = new TreeNode(6);
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<ArrayList<Integer>> temp = new ArrayList<>();
        rootToLeaf(root, al, temp);

        for(ArrayList<Integer> res : temp){
            System.out.println(res.toString());
        }
    }
    private static void rootToLeaf(TreeNode root, ArrayList<Integer> al, ArrayList<ArrayList<Integer>> temp){
        if(root == null){
            return;
        }
        al.add(root.data);
        if(root.left == null && root.right == null){
            System.out.println(al.toString());
            //temp.add(al);
            return;
        }
        rootToLeaf(root.left, new ArrayList<>(al), temp);
        rootToLeaf(root.right, al, temp);
        //al.remove(al.size() - 1);
    }
}
