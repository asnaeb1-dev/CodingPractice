package Strings;

public class RabinKarpPatternSearch {
    public static void main(String[] args) {
        String str = "abhigyan";
        String patter = "hxgyan";
        System.out.println(search(str, patter, (int) Math.pow(10, 9) + 7));
    }
    //s = main string
    //p = pattern
    static int d = 256;
    private static boolean search(String s, String p, int q){
        int pSize = p.length();
        int mainSize = s.length();

        int patternHash = 0, mainHash = 0;
        for(int i = 0;i<pSize;i++){
            patternHash+= (p.charAt(i) * Math.pow(d, pSize - i - 1));
            mainHash += (s.charAt(i) * Math.pow(d, pSize - i - 1));
        }
        for(int i = 1;i<mainSize - pSize + 1;i++){
            if(mainHash == patternHash) return true;
            mainHash = (d * (mainHash - s.charAt(i - 1) * ((int) Math.pow(d, pSize - 1) % q))) + s.charAt(i + pSize - 1);
        }

        return false;
    }
}
