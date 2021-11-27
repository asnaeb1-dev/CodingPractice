package BinaryTree;

public class DistanceOfRootToNode {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//        root.right.left = new TreeNode(6);

        System.out.println(findDistance(root, 2));
    }
    private static int findDistance(TreeNode root, int x){
        if(root == null) return 0;
        int d = -1;
        if ((root.data == x) ||
                (d = findDistance(root.left, x)) >= 0 ||
                (d = findDistance(root.right, x)) >= 0)
            return d + 1;
        return d;
    }
}
