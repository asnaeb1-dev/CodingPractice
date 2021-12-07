package BinaryTree.BST;

import java.util.LinkedList;
import java.util.Queue;

public class BSTFromLevelOrder {
    static class Element{
        int lr;
        TreeNodeBST mid;
        int rr;

        public Element(int lr, TreeNodeBST mid, int rr) {
            this.mid = mid;
            this.lr = lr;
            this.rr = rr;
        }
    }

    public static void main(String[] args) {
        int[] a = {7,4,12,3,6,8,1,5,10};
        TreeNodeBST root = constructBST(a, a.length);
        preorder(root);
    }

    private static void preorder(TreeNodeBST root){
        if(root == null) return;;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    private static TreeNodeBST constructBST(int[] arr, int n){
        Queue<Element> q = new LinkedList<>();
        TreeNodeBST root = new TreeNodeBST(arr[0]);
        q.add(new Element(Integer.MIN_VALUE, root, Integer.MAX_VALUE));
        int i = 1;
        while(i != n){
            Element curr = q.poll();
            TreeNodeBST node =  new TreeNodeBST(arr[i]);
            if(arr[i] > curr.lr &&  arr[i] < curr.mid.data){
                curr.mid.left = node;
                q.add(new Element(curr.lr, node, node.data));
                i++;
            }
            if(i != n && arr[i] > curr.mid.data && arr[i] < curr.rr){
                curr.mid.right = node;
                q.add(new Element(node.data, node, curr.rr));
                i++;
            }
        }
        return root;
    }

    private static TreeNodeBST construct(int[] arr){
        TreeNodeBST root = new TreeNodeBST(arr[0]);
        for(int i = 1;i<arr.length;i++){
            root = insert(root, arr[i]);
        }
        return root;
    }
    private static TreeNodeBST insert(TreeNodeBST root, int v){
        TreeNodeBST parent = null, curr = root;
        while(curr != null){
            parent = curr;
            if(v < curr.data){
                curr = curr.left;
            }else{
                curr = curr.right;
            }
        }
        if(parent == null){
            return null;
        }else if(v < parent.data){
            parent.left = new TreeNodeBST(v);
        }else{
            parent.right = new TreeNodeBST(v);
        }
        return root;
    }
}
