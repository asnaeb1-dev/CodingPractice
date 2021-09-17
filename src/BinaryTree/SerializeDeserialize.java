package BinaryTree;

import java.util.ArrayList;

public class SerializeDeserialize {
    public void serialize(TreeNode root, ArrayList<Integer> A)
    {
        //code here
        if(root != null){
            A.add(-1);
            return;
        }
        A.add(root.data);
        serialize(root.left, A);
        serialize(root.right, A);
    }

    //Function to deserialize a list and construct the tree.
    int index = 0;
    public TreeNode deSerialize(ArrayList<Integer> A)
    {
        //code here
        if(index >= A.size() || A.get(index) == -1){
            index++;
            return null;
        }

        TreeNode node = new TreeNode(A.get(index));
        index++;
        node.left = deSerialize(A);
        node.right = deSerialize(A);
        return node;

    }
}
