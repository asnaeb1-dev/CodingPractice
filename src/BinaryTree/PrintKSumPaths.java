package BinaryTree;

import java.util.ArrayList;

public class PrintKSumPaths {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(-1);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(1);
        root.left.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);
        root.right.right.right = new TreeNode(6);
        root.right.left = new TreeNode(4);
        root.right.left.left = new TreeNode(1);
        root.right.left.right = new TreeNode(2);

        int k = 5;
        printPaths(root, k);
    }
    static ArrayList<Integer> al;
    private static void printPaths(TreeNode root, int K){
//        if(root == null) return;
        al = new ArrayList<>();
//        hasSum(root, K, 0, al);
//        printPaths(root.left, K);

//        printPaths(root.right, K);
        traverse(root, K);
    }

    private static void hasSum(TreeNode root, int K, int s, ArrayList<Integer> al){
       if(root == null) return;
       s+= root.data;
       al.add(root.data);
       if(s == K){
           System.out.println(al);
           return;
       }else if(s > K){
           s-= root.data;
       }
       hasSum(root.left, K, s, al);
       hasSum(root.right, K, s, al);
       al.remove(al.size() - 1);
    }

    private static void traverse(TreeNode root, int k){
        if(root == null) return;
        al.add(root.data);
        traverse(root.left, k);
        traverse(root.right, k);
        int s = 0;
        for (Integer integer : al) {
            s += integer;
            if(s == k){
                print(al);
            }
        }
        al.remove(al.size() - 1);
    }
    private static void print(ArrayList<Integer> al){
        for(int i = 0;i<al.size();i++)
            System.out.print(al.get(i) +" ");
        System.out.println();
    }
}
