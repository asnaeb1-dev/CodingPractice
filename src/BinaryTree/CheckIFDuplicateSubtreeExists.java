package BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CheckIFDuplicateSubtreeExists {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(2);
        root.right.left.left = new TreeNode(4);
        root.right.right = new TreeNode(4);

        int v = dupSub(root);
        if(v == 1){
            System.out.println("Duplicates exists");
        }else{
            System.out.println("Doesn't exists");
        }
    }

    static Map<ArrayList<Integer>, Integer> map;
    static int dupSub(TreeNode root) {
        // code here
        map = new HashMap<>();
        traverse(root);

        for(Map.Entry<ArrayList<Integer>, Integer> e : map.entrySet()){
            if(e.getValue() > 1){
                return 1;
            }
        }
        return 0;
    }
    private static void traverse(TreeNode root){
        if(root == null) return;
        ArrayList<Integer> al = new ArrayList<>();
        getSubTree(root, al);
        if(map.containsKey(al)){
            map.put(al, map.get(al) + 1);
        }else{
            if(al.size() > 1){
                map.put(al, 1);
            }
        }
        traverse(root.left);
        traverse(root.right);
    }
    private static void getSubTree(TreeNode root, ArrayList<Integer> al){
        if(root == null) return;
        al.add(root.data);
        getSubTree(root.left, al);
        getSubTree(root.right, al);
    }
}
