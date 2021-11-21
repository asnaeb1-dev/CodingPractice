package BinaryTree;

/**Question -->
 * Given a Binary Tree (BT), convert it to a Doubly Linked List(DLL) In-Place.
 * The left and right pointers in nodes are to be used as previous and next pointers respectively in converted DLL.
 * The order of nodes in DLL must be same as Inorder of the given Binary Tree.
 * The first node of Inorder traversal (leftmost node in BT) must be the head node of the DLL.
 */
public class TreeToDLL {
    TreeNode curr = null, head = null;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        TreeNode h = new TreeToDLL().bToDLL(root);
    }
    TreeNode bToDLL(TreeNode root){
        //  Your code here
        inorder(root);
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
