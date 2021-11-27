package BinaryTree;

public class LCA {
    TreeNode getLca(TreeNode root, int a, int b){
        if(root == null) return null;
        if(root.data == a || root.data == b) return root;
        TreeNode l = getLca(root.left, a, b);
        TreeNode r = getLca(root.right, a, b);
        if(l != null && r != null){
            return root;
        }
        if(l != null){
            return l;
        }
        return r;
    }
}
