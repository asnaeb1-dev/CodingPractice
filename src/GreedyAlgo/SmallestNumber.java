package GreedyAlgo;

public class SmallestNumber {
    public static void main(String[] args) {
        int S = 17, d = 2;
        System.out.println(smallestNumber(S, d));
    }
    private static String smallestNumber(int S, int D){
        if(S > 9 * D){
            return "";
        }
        int[] ch = new int[D];
        S--;
        for(int i = D - 1;i>0;i--){
            if(S > 9){
                ch[i] = 9;
                S-=9;
            }else{
                ch[i] = S;
                S = 0;
            }
        }

        ch[0] = S+1;
        String s = "";
        for(int i: ch){
            s+=i;
        }
        return s;
    }
}
