package Strings;

public class RabinKarpPatternSearch {
    public static void main(String[] args) {
        String str = "abdabcbabc";
        String patter = "abc";
        System.out.println(search(str, patter));
    }
    //s = main string
    //p = pattern
    private static boolean search(String s, String p){
        int d = 2;
        long pHash = 0;
        long tempHash = 0;
        for(int i = 0, pow = p.length() - 1;i<p.length();i++, pow--){
            pHash+= ((p.charAt(i) - 97 + 1) * Math.pow(d, pow));
            tempHash+= ((s.charAt(i) - 97 + 1) * Math.pow(d, pow));
        }

        for(int i = 1;i<s.length() - p.length() + 1;i++){
            if(tempHash == pHash){
                return true;
            }
            long prev = (long) ((s.charAt(i - 1) - 97 + 1) * Math.pow(d, p.length() - 1));
            tempHash =  (d * (tempHash - prev)) + ((s.charAt(i + p.length() - 1) - 97) + 1);
        }
        return tempHash == pHash;
    }
}
