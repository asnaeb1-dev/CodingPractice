package GreedyAlgo;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class HuffmanCoding {
    static class TreeNode{
        int count;
        char ch;
        TreeNode left;
        TreeNode right;

        TreeNode(int count, char ch){
            this.count = count;
            this.ch = ch;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {
        int[] f = {5, 9, 12, 13, 16, 45};
        String s = "abcdef";
        ArrayList<String> al = new ArrayList<>();
        TreeNode root = encodeToTree(s, f, f.length);
        print(root, al, new StringBuilder(""));
        System.out.println(al.toString());
    }
    private static void print(TreeNode root, ArrayList<String> al, StringBuilder path){
        if(root == null) return;
        if(root.left == null && root.right == null){
            al.add(path.toString());
            return;
        }
        print(root.left, al, path.append("0"));
        print(root.right, al, path.append("1"));
        path.deleteCharAt(path.length() - 1);
    }
    private static TreeNode encodeToTree(String s, int[]f, int N){
        PriorityQueue<TreeNode> pq = new PriorityQueue<>((o1, o2) -> o1.count - o2.count);
        for(int i = 0;i<N;i++){
            pq.add(new TreeNode(f[i], s.charAt(i)));
        }
        while(pq.size() > 1){
            TreeNode left = pq.poll();
            TreeNode right = pq.poll();
            TreeNode center = new TreeNode(left.count + right.count, '$');
            center.left = left;
            center.right = right;
            pq.add(center);
        }
        return pq.peek();
    }
}
