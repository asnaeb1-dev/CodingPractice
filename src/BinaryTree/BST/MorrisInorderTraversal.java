package BinaryTree.BST;

import java.util.ArrayList;

/**
 * NOTE: WORKS FOR TREE/BST/THREADED BINARY TREE
 */
public class MorrisInorderTraversal {

    public static void main(String[] args) {
        TreeNodeBST root = new TreeNodeBST(2);
        root.left = new TreeNodeBST(13);
        root.left.left = new TreeNodeBST(8);
        root.right = new TreeNodeBST(10);
        root.right.right = new TreeNodeBST(7);
        root.right.left = new TreeNodeBST(9);

        System.out.println(morrisInorderTraversal(root).toString());
    }

    //Time Complexity - O(n)
    //Space - O(1)
    private static ArrayList<Integer> morrisInorderTraversal(TreeNodeBST root){
        ArrayList<Integer> al = new ArrayList<>();
        TreeNodeBST current = root;
        while(current != null){
            //check if the left subtree exists; if not then more to the right subtree
            if(current.left == null){
                al.add(current.data);
                current = current.right;
            }else{
                //left subtree exists, get the inorder predecessor
                TreeNodeBST pre = current.left;
                while(pre.right != current && pre.right != null){
                    pre = pre.right;
                }
                //check if predecoors' right is null; that means we haven't been here before
                if(pre.right == null){
                    //connect the pre.right to the current node
                    pre.right = current;
                    current = current.left;
                }else{
                    //we have been here before

                    //clean up all the reference pointers
                    pre.right = null;
                    //add the results
                    al.add(current.data);
                    //move right
                    current = current.right;
                }
            }
        }
        return al;
    }
}
