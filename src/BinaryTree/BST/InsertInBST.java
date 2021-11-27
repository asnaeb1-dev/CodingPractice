package BinaryTree.BST;

public class InsertInBST {
    public static void main(String[] args) {
        TreeNodeBST root = new TreeNodeBST(5);
        root.left = new TreeNodeBST(3);
        root.right = new TreeNodeBST(19);

        TreeNodeBST r = insert(root, 1);

    }
    private static TreeNodeBST insert(TreeNodeBST root, int x){
        if(root == null) return new TreeNodeBST(x);
        if(x < root.data){
            root.left = insert(root.left, x);
        }else{
            root.right = insert(root.right, x);
        }
        return root;
    }
    private static  TreeNodeBST insertIterative(TreeNodeBST root, int x){
        TreeNodeBST curr = root, parent = null;
        while( curr != null){
            parent = curr;
            if(x < curr.data){
                curr = curr.left;
            }else{
                curr = curr.right;
            }
        }
        if(x > parent.data){
            parent.right = new TreeNodeBST(x);
        }else{
            parent.left = new TreeNodeBST(x);
        }
        return root;
    }
}
