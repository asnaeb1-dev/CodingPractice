package BinaryTree;

import java.util.ArrayList;

public class LeftView {
    int max = 0;
    public static void main(String[] args) {

    }
    ArrayList<Integer> leftView(TreeNode node) {
        //add code here.
        ArrayList<Integer> al = new ArrayList<>();
        print(node, 1, al);
        return al;
    }
    void print(TreeNode root, int level, ArrayList<Integer> al){
        if(root == null){
            return;
        }
        if(max < level){
            max = level;
            al.add(root.data);
        }
        print(root.left, level + 1, al);
        print(root.right, level + 1, al);
    }
}
