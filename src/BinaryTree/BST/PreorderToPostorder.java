package BinaryTree.BST;

public class PreorderToPostorder {
    public static TreeNodeBST post_order(int pre[], int size) {
        //Your code here
        TreeNodeBST root = new TreeNodeBST(pre[0]);
        for(int i = 1;i<size;i++){
            root = convert(root, pre[i]);
        }
        return root;
    }

    private static TreeNodeBST convert(TreeNodeBST root, int v){
        TreeNodeBST curr = root, parent = null;
        while(curr != null){
            parent = curr;
            if(v > curr.data){
                curr = curr.right;
            }else{
                curr = curr.left;
            }
        }
        if(parent == null){
            return null;
        }else if(v < parent.data){
            parent.left = new TreeNodeBST(v);
        }else{
            parent.right = new TreeNodeBST(v);
        }
        return root;
    }
}
