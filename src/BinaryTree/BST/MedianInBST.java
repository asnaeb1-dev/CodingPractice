package BinaryTree.BST;

/**Question
 * Find median of BST in O(n) time and O(1) space
 * Given a Binary Search Tree, find median of it.
 * If no. of nodes are even: then median = ((n/2th node + (n+1)/2th node) /2
 * If no. of nodes are odd : then median = (n+1)/2th node.
 * For example, median of below BST is 12.
 *
 * Example:
 * Given BST(with odd no. of nodes) is :
 *                     6
 *                  /    \
 *                 3       8
 *               /   \    /  \
 *              1     4  7    9
 *
 * Inorder of Given BST will be : 1, 3, 4, 6, 7, 8, 9
 * So, here median will 6.
 *
 * Given BST(with even no. of nodes) is :
 *                     6
 *                  /    \
 *                 3       8
 *               /   \    /
 *              1     4  7
 *
 * Inorder of Given BST will be : 1, 3, 4, 6, 7, 8
 * So, here median will  (4+6)/2 = 5.
 */
public class MedianInBST {
    public static void main(String[] args) {
        TreeNodeBST root = new TreeNodeBST(50);
        root.left = new TreeNodeBST(30);
        root.left.right = new TreeNodeBST(40);
        root.right = new TreeNodeBST(70);
        root.right.left = new TreeNodeBST(60);
        root.right.right = new TreeNodeBST(80);

        System.out.println(medianOfNodes(root));
    }
    private static int medianOfNodes(TreeNodeBST root){
        //int n = countNodes(root);
        return getMedian(root, 6);
    }
    private static int getMedian(TreeNodeBST root, int n){
        TreeNodeBST curr = root, prev = curr;
        int c = 0;
        while(curr != null){
            if(curr.left == null){
                c++;
                if(c % 2 != 0 && c == (n + 1) / 2){
                    return prev.data;
                }
                if (c % 2 == 0 && c == (n + 1)/ 2){
                    return (prev.data + curr.data) / 2;
                }
                prev = curr;
                curr = curr.right;
            }else {
                TreeNodeBST pred = curr.left;
                while(pred.right != curr && pred.right != null){
                    pred = pred.right;
                }
                if(pred.right == null){
                    pred.right = curr;
                    curr = curr.left;
                }else{
                    pred.right = null;
                    c++;
                    if(c % 2 != 0 && c == (n + 1) / 2){
                        return curr.data;
                    }
                    if (c % 2 == 0 && c == (n + 1)/ 2){
                        return (prev.data + curr.data) / 2;
                    }
                    prev = curr;
                    curr = curr.right;
                }
            }
        }
        return c;
    }

    private static int countNodes(TreeNodeBST root){
        TreeNodeBST curr = root;
        int c = 0;
        while(curr != null){
            if(curr.left == null){
                c++;
                curr = curr.right;
            }else{
                TreeNodeBST pred = curr.left;
                while(pred.right != curr && pred.right != null){
                    pred = pred.right;
                }
                if(pred.right == null){
                    pred.right = curr;
                    curr = curr.left;
                }else{
                    c++;
                    pred.right = null;
                    curr = curr.right;
                }
            }
        }
        return  c;
    }
}
