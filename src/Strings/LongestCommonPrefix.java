package Strings;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flowering"};
        System.out.println(longestCommonPrefix(str));
    }
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        String str = strs[0];
        int k = 0;
        while(k != str.length()){
            for(int i = 1;i<strs.length;i++){
                if(k < strs[i].length()){
                    if(str.charAt(k) != strs[i].charAt(k)){
                        return prefix.toString();
                    }
                }else{
                    return prefix.toString();
                }
            }
            prefix.append(str.charAt(k));
            k++;
        }
        return prefix.toString();
    }
}
