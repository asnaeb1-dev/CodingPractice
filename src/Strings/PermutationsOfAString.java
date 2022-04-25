package Strings;


public class PermutationsOfAString {
    public static void main(String[] args) {
        String str ="abc";
        boolean[] vis = new boolean[str.length()];
        //permute(str, new StringBuilder(""), vis);
        permuteAlt(str, new StringBuilder(""), 0);
    }
    private static void permute(String str, StringBuilder res, boolean[] vis){
        if(res.length() == str.length()){
            System.out.println(res);
            return;
        }
        for(int i = 0;i<str.length();i++){
            if(!vis[i]){
                vis[i] = true;
                res.append(str.charAt(i));
                permute(str, res, vis);
                res.deleteCharAt(res.length() - 1);
                vis[i] = false;
            }
        }

    }

    private static void permuteAlt(String str, StringBuilder res, int i){
        if(res.length() == str.length()){
            System.out.println(res);
            return;
        }
        for(int j = i;j<str.length();j++){
                res.append(str.charAt(i));
                permuteAlt(str, res, i + 1);
                res.deleteCharAt(res.length() - 1);
        }
    }
}
