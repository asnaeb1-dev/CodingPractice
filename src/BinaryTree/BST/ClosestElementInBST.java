package BinaryTree.BST;

import java.util.ArrayList;

public class ClosestElementInBST {
    public static void main(String[] args) {
        TreeNodeBST root = new TreeNodeBST(11);
        root.left = new TreeNodeBST(5);
        root.right = new TreeNodeBST(12);
//        root.left.left = new TreeNodeBST(1);
//        root.right.left = new TreeNodeBST(10);
//        root.right.right = new TreeNodeBST(20);

        //System.out.println(minimumDifference(root, 3));
        traversal(root, 13);
        System.out.println(mD);
    }
    //Time - O(n); Space - O(n)
    private static int minimumDifference(TreeNodeBST root, int k){
        ArrayList<Integer> al = new ArrayList<>();
        traverse(root, al);
        int minDiff = Integer.MAX_VALUE;
        for(Integer i : al){
            minDiff = Math.min(Math.abs(i - k), minDiff);
        }
        return minDiff;
    }

    private static void traverse(TreeNodeBST root, ArrayList<Integer> al){
        if(root == null) return;
        al.add(root.data);
        traverse(root.left, al);
        traverse(root.right, al);
    }

    static int mD = Integer.MAX_VALUE;
    private static void traversal(TreeNodeBST root, int k){
        if(root == null) return;
        mD = Math.min(Math.abs(root.data - k), mD);
        traversal(root.left, k);
        traversal(root.right, k);
    }
}
