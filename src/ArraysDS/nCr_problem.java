package ArraysDS;

import java.math.BigInteger;

public class nCr_problem {
    public static void main(String[] args) {
        int n = 3, r = 2;
        System.out.println(nCr(3, 2));
    }
    private static int nCr(int n, int r){
        BigInteger b1 = new BigInteger(String.valueOf(1));
        BigInteger b2 = new BigInteger(String.valueOf(1));
        BigInteger b3 = new BigInteger(String.valueOf(1));

        for(int i = 1;i<=n;i++){
            b1 = b1.multiply(new BigInteger(String.valueOf(i)));
        }
        for(int i = 1;i<=r;i++){
            b2 = b2.multiply(new BigInteger(String.valueOf(i)));
        }
        for(int i = 1;i<=n;i++){
            b3 = b3.multiply(new BigInteger(String.valueOf(i)));
        }
        b3 = b1.divide(b2.multiply(b3));
        b3 = b3.mod(new BigInteger(String.valueOf(10)).pow(9));
        return Integer.parseInt(b3.toString());
    }
}
