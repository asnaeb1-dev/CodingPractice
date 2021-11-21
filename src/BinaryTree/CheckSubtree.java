package BinaryTree;

public class CheckSubtree {
    public static boolean isSubtree(TreeNode t, TreeNode s) {
        // add code here.
        if(t == null) return false;
        return checkSubtree(t, s)|| isSubtree(t.left, s) || isSubtree(t.right, s);
    }
    private static boolean checkSubtree(TreeNode t, TreeNode s){
        if(t == null && s == null) return true;
        if(s == null || t == null) return false;
        if(t.data != s.data) return false;
        return checkSubtree(t.left, s.left) && checkSubtree(t.right, s.right);
    }
}
