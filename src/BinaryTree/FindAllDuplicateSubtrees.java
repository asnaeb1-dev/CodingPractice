package BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindAllDuplicateSubtrees {
    static HashMap<ArrayList<Integer>, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(2);
        root.right.left.left = new TreeNode(4);
        root.right.right = new TreeNode(4);

        findAll(root);
    }
    private static void findAll(TreeNode root){
        traverse(root);
        for(Map.Entry<ArrayList<Integer>, Integer> e : map.entrySet()){
            if(e.getValue() > 1){
                System.out.println(e.getKey().toString());
            }
        }
    }
    private static void traverse(TreeNode root){
        if(root == null) return;
        ArrayList<Integer> t = new ArrayList<>();
        getSubtree(root, t);
        if(!map.containsKey(t)){
            map.put(t, 1);
        }else{
            map.put(t, map.get(t) + 1);
        }
        traverse(root.left);
        traverse(root.right);
    }
    private static void getSubtree(TreeNode root, ArrayList<Integer> al){
        if(root == null){
            //al.add(null);
            return;
        }
        al.add(root.data);
        getSubtree(root.left, al);
        getSubtree(root.right, al);
    }
}
