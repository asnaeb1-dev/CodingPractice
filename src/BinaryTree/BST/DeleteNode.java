package BinaryTree.BST;

public class DeleteNode {
    public static void main(String[] args) {
        TreeNodeBST root = new TreeNodeBST(50);
        root.left = new TreeNodeBST(30);
        root.left.right = new TreeNodeBST(40);
        root.right = new TreeNodeBST(70);
        root.right.left = new TreeNodeBST(60);
        root.right.right = new TreeNodeBST(80);

        TreeNodeBST r = deleteTreeNodeBST(root, 50);
        System.out.println(r.data);
    }

    public static TreeNodeBST deleteTreeNodeBST(TreeNodeBST root, int X) {
        // code here.
        if(root == null) return null;
        if(X == root.data){
            //one of 3 cases arise here
            //case 1: the TreeNodeBST is a root TreeNodeBST
            if(root.left == null && root.right == null) return null;
            //case 2: one of the 2 child TreeNodeBSTs is null
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;
            //case 3: none of the children are null
            TreeNodeBST succ = getSucc(root);
            //swap the data of the succ TreeNodeBST and the current TreeNodeBST
            root.data = succ.data;
            //because we found the successor, we need to do root.right else we would do root.left
            root.right = deleteTreeNodeBST(root.right, succ.data);
        }else if( X > root.data){
            root.right = deleteTreeNodeBST(root.right, X);
        }else{
            root.left = deleteTreeNodeBST(root.left, X);
        }
        return root;
    }

    static TreeNodeBST getSucc(TreeNodeBST root){
        //go right once, then go left till null;
        //DOES NOT WORK FOR OTHER TEST CASES
        TreeNodeBST curr = root.right;
        while(curr != null && curr.left != null){
            curr = curr.left;
        }
        return curr;
    }
}
