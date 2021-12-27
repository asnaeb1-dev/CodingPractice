package Strings;

import java.util.ArrayList;

public class PrintAllSubsequences {
    private static ArrayList<String> res = new ArrayList<>();
    public static void main(String[] args) {
        print("gfg", "");
        System.out.println(res.toString());
    }
    private static void print(String str, String result){
        if(str.length() == 0){
            res.add(result);
            return;
        }
        print(str.substring(1), result+ str.charAt(0));
        print(str.substring(1), result);
    }
}
