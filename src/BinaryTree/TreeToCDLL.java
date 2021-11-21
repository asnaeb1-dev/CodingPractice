package BinaryTree;

public class TreeToCDLL {
    TreeNode curr = null, head = null;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        TreeNode h = new TreeToCDLL().bToCDLL(root);
        TreeNode c = h;;
        while(c.right != h){
            System.out.print(c.data +" ");
            c = c.right;
        }
    }
    TreeNode bToCDLL(TreeNode root){
        //  Your code here
        inorder(root);
        curr.right = head;
        head.left = curr;
        return head;
    }
    void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        if(head == null){
            head = root;
            curr = root;
        }else{
            curr.right = root;
            root.left = curr;
            curr = curr.right;
        }
        inorder(root.right);
    }
}
