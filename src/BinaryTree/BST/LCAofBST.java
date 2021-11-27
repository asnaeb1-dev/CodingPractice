package BinaryTree.BST;

public class LCAofBST {
    TreeNodeBST LCA(TreeNodeBST root, int n1, int n2){
        // code here.
        if(root == null) return null;
        if(n1 == root.data || n2 == root.data){
            return root;
        }
        TreeNodeBST l = LCA(root.left, n1, n2);
        TreeNodeBST r = LCA(root.right, n1, n2);
        if(l != null && r != null){
            return root;
        }
        if(l != null){
            return l;
        }
        return r;
    }
}
