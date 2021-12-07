package BinaryTree.BST;

public class InorderSuccessorAndPredecessor {
    public static void main(String[] args) {
        TreeNodeBST root = new TreeNodeBST(50);
        root.left = new TreeNodeBST(30);
        root.left.right = new TreeNodeBST(40);
        root.right = new TreeNodeBST(70);
        root.right.left = new TreeNodeBST(60);
        root.right.right = new TreeNodeBST(80);

        pre = new TreeNodeBST(-1);
        suc = new TreeNodeBST(-1);
        getPredecessor(root, 65);
        System.out.println("Predecessor - " + pre.data +" Successor - " + suc.data);
    }
    static TreeNodeBST pre, suc;
    private static void  getPredecessor(TreeNodeBST root, int x){
        if(root == null) return;
        if(root.data == x){
            if(root.left != null){
                TreeNodeBST curr = root.left;
                while(curr != null && curr.right != null){
                    curr = curr.right;
                }
                pre.data = curr.data;
            }
            if(root.right != null){
                TreeNodeBST curr = root.right;
                while(curr != null && curr.left != null){
                    curr = curr.left;
                }
                suc.data = curr.data;
            }
            return;

        }else if( x > root.data){
            suc.data = root.data;
            getPredecessor(root.left, x);
        }else {
            pre.data = root.data;
            getPredecessor(root.right, x);
        }
    }
}
