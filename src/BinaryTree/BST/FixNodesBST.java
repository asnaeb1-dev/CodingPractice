package BinaryTree.BST;

public class FixNodesBST {
    public static void main(String[] args) {
        TreeNodeBST root = new TreeNodeBST(60);
        root.left = new TreeNodeBST(8);
        root.left.left = new TreeNodeBST(4);
        root.left.right = new TreeNodeBST(10);
        root.right = new TreeNodeBST(80);
        root.right.left = new TreeNodeBST(20);
        root.right.right = new TreeNodeBST(100);

        inorder(root);
        fixNode(root);
        System.out.println();
        if(start == null && mid == null && end == null){
            System.out.println("Tree is fine");
            return;
        }
        if(end == null){
            int t = start.data;
            start.data = mid.data;
            mid.data = t;
        }else{
            int t = start.data;
            start.data = end.data;
            end.data = t;
        }
        System.out.println("Fixed tree:");
        inorder(root);
    }

    static TreeNodeBST prev = null, start = null, mid = null, end = null;
    private static void inorder(TreeNodeBST root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);
    }

    private static void fixNode(TreeNodeBST root){
        if(root == null) return;
        fixNode(root.left);
        if(prev != null && root.data < prev.data){
            if(start == null){
                start = prev;
                mid = root;
            }else{
                end = root;
            }
        }
        prev = root;
        fixNode(root.right);
    }
}
