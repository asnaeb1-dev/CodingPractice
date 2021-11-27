package BinaryTree;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumRootToLeafSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(3);
        //root.left.right.left = new TreeNode(2);

        //System.out.println(sumOfLongRootToLeafPath(root));
        //System.out.println(maxList);
        traverseX(root, 0, 0);
        System.out.println(maxSum);
    }
    static  ArrayList<Integer> maxList;
    public static int sumOfLongRootToLeafPath(TreeNode root){
        //code here
        maxList = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        traverse(root, temp);

        int s = 0;
        for(Integer i : maxList){
            s+=i;
        }
        return s;
    }

    public static void traverse(TreeNode root, ArrayList<Integer> al){
        if(root == null) return;
        al.add(root.data);
        if(root.left == null && root.right == null){
            if(al.size() > maxList.size()){
                maxList.clear();
                maxList.addAll(al);
            }else if(al.size() == maxList.size()){
                int s1 = 0, s2 = 0;
                for(int i = 0;i<al.size();i++){
                    s1+=al.get(i);
                    s2+=maxList.get(i);
                }
                if(s1 > s2){
                    maxList.clear();
                    maxList.addAll(al);
                }
            }
        }
        traverse(root.left, al);
        traverse(root.right, al);
        al.remove(al.size() - 1);
    }


    static int maxLen = Integer.MIN_VALUE, maxSum = Integer.MIN_VALUE;
    private static void traverseX(TreeNode root, int len, int sum){
        if(root == null) {
            return;
        }
        len++;
        sum+=root.data;
        if(root.left == null && root.right == null){
            if(len > maxLen){
                maxLen = len;
                maxSum = sum;
            }else if(len == maxLen){
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        traverseX(root.left, len, sum);
        traverseX(root.right, len, sum);
    }
}
