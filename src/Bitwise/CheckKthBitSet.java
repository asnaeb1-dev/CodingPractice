package Bitwise;

public class CheckKthBitSet {
    public static void main(String[] args) {

    }
    private static boolean check(int n, int k){
        //using left shift operator
        if((n & (1 << k)) != 0){
            return true;
        }
        return false;
    }
    private static boolean checkAlt(int n, int k){
        if(((n >> k) & 1) == 1){
            return true;
        }
        return false;
    }
}
