package BinaryTree.BST;

import java.util.ArrayList;

public class ConstructBSTFromArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        TreeNodeBST root = construct(a, 0, a.length - 1);

    }
    public int[] sortedArrayToBST(int[] nums){
        // Code here
        TreeNodeBST root = construct(nums, 0, nums.length - 1);
        int[] res = new int[nums.length];
        ArrayList<Integer> al = new ArrayList<>();
        traverse(al, root);
        for(int i = 0;i<al.size();i++){
            res[i] = al.get(i);
        }
        return res;
    }
    private static void traverse(ArrayList<Integer> al, TreeNodeBST root){
        if(root == null) return;
        al.add(root.data);
        traverse(al, root.left);
        traverse(al, root.right);
    }

    private static TreeNodeBST construct(int[] nums, int l, int h){
        if(l > h) return null;
        int mid = (l + h) / 2;
        TreeNodeBST node = new TreeNodeBST(nums[mid]);
        node.left = construct(nums, l, mid - 1);
        node.right = construct(nums, mid + 1, h);
        return node;
    }
}
