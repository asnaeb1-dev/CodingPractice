package Trie;

public class MaximumXOR {
    private static class TrieNode{
        TrieNode[] child = new TrieNode[2];
        boolean isEnd;
    }

    static TrieNode root = new TrieNode();
    private static void insert(int[] a){
        for(int i = 0;i<a.length;i++){
            TrieNode c = root;
            for(int j = 31;i>=0;i--){
                int currBit = (a[i] >> j) & 1;
                if(c.child[currBit] == null){
                    c.child[currBit] = new TrieNode();
                }
                c = c.child[currBit];
            }
        }
    }

    public int findMaximumXOR(int[] a){
        insert(a);
        int max = 0;

        TrieNode curr = root;
        for(int num : a){
            for(int i = 31;i>=0;i--){
                int requireBit = 1 - ((num >> i) & 1);
                if(curr.child[requireBit] == null){

                }else{

                }
            }
        }
        return max;
    }
}
