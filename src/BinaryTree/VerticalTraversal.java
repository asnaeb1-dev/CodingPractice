package BinaryTree;

import BinaryTree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class VerticalTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        traverse(root, 0);

        for(Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()){
            System.out.println(entry.getKey() +"-> "+ entry.getValue().toString());
        }
    }
    static Map<Integer, ArrayList<Integer>> map = new LinkedHashMap<>();
    private static void traverse(TreeNode root, int level){
        if(root == null) return;
        traverse(root.left, level - 1);
        ArrayList<Integer> a;
        if(map.containsKey(level)){
            a = map.get(level);
        }else{
            a = new ArrayList<>();
        }
        a.add(root.data);
        map.put(level,a);
        traverse(root.right, level + 1);
    }
}
