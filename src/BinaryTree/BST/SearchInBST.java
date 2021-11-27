package BinaryTree.BST;

public class SearchInBST {
    public static void main(String[] args) {
        TreeNodeBST root = new TreeNodeBST(5);
        root.left = new TreeNodeBST(3);
        root.right = new TreeNodeBST(19);

        System.out.println(search(root, 5));
    }

    //recursive
    static boolean search(TreeNodeBST root, int x) {
        // Your code here
        if(root == null) return false;
        if(x == root.data) return true;
        if(x < root.data) return search(root.left, x);
        return search(root.right, x);
    }

    //iterative
    static boolean searchI(TreeNodeBST root, int x){
        TreeNodeBST curr = root;
        while(curr != null){
            if(x == curr.data){
                return true;
            }else if(x < curr.data){
                curr = curr.left;
            }else{
                curr = curr.right;
            }
        }
        return false;
    }
}
