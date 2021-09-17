package BinaryTree.BST;

import BinaryTree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;

class ConvertBTtoBST
{
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    TreeNodeBST binaryTreeToBST(TreeNodeBST root)
    {
        // Your code here
        ArrayList<Integer> al = new ArrayList<>();
        getList(root, al);
        Collections.sort(al);
        rearrange(root, al, 0);
        return root;
    }

    private static void getList(TreeNodeBST root, ArrayList<Integer> al){
            if(root == null) return;
            getList(root.left, al);
            al.add(root.data);
            getList(root.right, al);
        }
        private static void rearrange(TreeNodeBST root, ArrayList<Integer> al, int index){
            if(root == null) return;
            rearrange(root.left, al, index);
            root.data = al.get(index++);
            rearrange(root.right, al, index);
    }
}
