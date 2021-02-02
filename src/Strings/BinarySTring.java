package Strings;

public class BinarySTring {
    public static void main(String[] args) {
        System.out.println(binarySubstring("010101"));
    }
    public static int binarySubstring(String str)
    {
        int c = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == '1'){
                c++;
            }
        }
        return c * (c - 1)/2;
    }
}
