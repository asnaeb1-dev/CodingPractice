package Trie;

class TrieImplementation{
    static TrieNode root = null;

    //search a string in TrieDS
    private static boolean searchKey(String search){
        TrieNode curr = root;
        int n = search.length();
        for(int i = 0;i<n;i++){
            char ch = search.charAt(i);
            int index = ch - 'a';
            if(curr.children[index] == null) return false;
            curr = curr.children[index];
        }
        return curr.isEnd;
    }

    //insert a string in TrieDS
    private static void insertKey(String key){
        TrieNode curr = root;

        int n = key.length();
        for(int i = 0;i<n;i++){
            char ch = key.charAt(i);
            if(curr.children[ch - 'a'] == null){
                curr.children[ch - 'a'] = new TrieNode();
            }
            curr = curr.children[ch - 'a'];
        }
        curr.isEnd = true;
    }

    //remove a key
    //can be solved using recursion
    private static TrieNode removeKey(String str, TrieNode root, int i){
        if(root == null) return null;
        if(i == str.length()){
            root.isEnd = false;
            if(isEmpty(root)){
                root = null;
            }
            return root;
        }

        int index = str.charAt(i) - 'a';
        root.children[index] = removeKey(str, root.children[index], i + 1);
        if(isEmpty(root) && !root.isEnd){
            root = null;
        }
        return root;
    }

    //checks if a node is empty i.e. has no connections
    private static boolean isEmpty(TrieNode root){
        for(int i = 0;i<26;i++){
            if(root.children[i] != null) return false;
        }
        return true;
    }


}
