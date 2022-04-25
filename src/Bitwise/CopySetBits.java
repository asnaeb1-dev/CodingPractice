package Bitwise;

public class CopySetBits {
    public static void main(String[] args) {
        int x = 8, y = 7;
        int l = 1, r = 2;

        System.out.println(copyBits(x, y, l, r));
    }
    private static int copyBits(int x, int y, int l, int r){
        for(int i = l;i<= r;i++){
            if((y & (1 << i - 1)) != 0){
                x = x | (1 << i - 1);
            }
        }
        return x;
    }
}
