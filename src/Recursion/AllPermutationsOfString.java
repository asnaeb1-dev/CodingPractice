package Recursion;

import java.util.ArrayList;

public class AllPermutationsOfString {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        new AllPermutationsOfString().permute("ABC", 0, al);
        for(String s: al){
            System.out.println(s);
        }
    }
    private void permute(String str, int i, ArrayList<String> al){
        if(i == str.length()){
            al.add(str);
            return;
        }
        for(int j = i;j<str.length();j++){
            str = swap(i, j, str);
            permute(str, i + 1, al);
            str = swap(j, i, str);
        }
    }
    private String swap(int i, int j, String str){
        char[] c = str.toCharArray();
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
        return c.toString();
    }
}
