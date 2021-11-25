package BinaryTree.BST;

import BinaryTree.TreeNode;

public class ConvertLOTtoBST {
    public static void main(String[] args) {
        int[] a = {7,4,12,3,6,8,1,5,10};

        TreeNode node = constructBST(a);
        print(node);
    }

    private static void print(TreeNode root){
        if(root == null) return;
        System.out.print(root.data+" ");
        print(root.left);
        print(root.right);
    }
    static int i = 0;
    public static TreeNode constructBST(int[] arr){
        //Write your code here
        if(i >= arr.length || arr.length == 0){
            return null;
        }
        TreeNode node = new TreeNode(arr[i++]);
        node.left = constructBST(arr);
        node.right = constructBST(arr);
        return node;
    }
}
