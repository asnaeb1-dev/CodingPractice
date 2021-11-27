package BinaryTree.BST;

public class MinimumInBST {
    public static void main(String[] args) {
        TreeNodeBST root = new TreeNodeBST(5);
        root.left = new TreeNodeBST(3);
        root.right = new TreeNodeBST(19);

        System.out.println(minValue(root));
    }
    //recursive
    static int minValue(TreeNodeBST node) {
        if(node.left == null) return node.data;
        return minValue(node.left);
    }
    //iteravtive
    static int minValueI(TreeNodeBST root){
        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }
}
