package BinaryTree;

import LinkedList.LLNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a Linked List Representation of Complete Binary Tree. The task is to construct the Binary tree.
 * Note : The complete binary tree is represented as a linked list in a way where if root node is stored at position i,
 * its left, and right children are stored at position 2*i+1, 2*i+2 respectively.
 *
 * HOW TO DO:
 * 1. Create an empty queue.
 * 2. Make the first node of the list as root, and enqueue it to the queue.
 * 3. Until we reach the end of the list, do the following.
 * ………a. Dequeue one node from the queue. This is the current parent.
 * ………b. Traverse two nodes in the list, add them as children of the current parent.
 * ………c. Enqueue the two nodes into the queue
 */
public class MakeBinaryTreeFromLL {
    public static TreeNode convert(LLNode head, TreeNode node) {
        // add code here.}
        Queue<TreeNode> q = new LinkedList<>();
        node = new TreeNode(head.data);
        q.add(node);
        head = head.next;
        while(head != null){
            TreeNode curr = q.poll();
            curr.left = new TreeNode(head.data);
            q.add(curr.left);
            head = head.next;
            if(head != null){
                curr.right = new TreeNode(head.data);
                head = head.next;
                q.add(curr.right);
            }
        }
        return node;
    }
}
