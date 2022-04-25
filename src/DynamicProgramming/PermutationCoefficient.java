package DynamicProgramming;

public class PermutationCoefficient {
    public static void main(String[] args) {
        int n = 10;
        int k = 2;
        System.out.println(eff(n, k));
    }
    private static int pc(int n, int k){
        if(n == 0) return 0;
        if(k == 0) return 1;
        if(k == 1) return n;
        return pc(n - 1, k) + k * pc(n - 1, k - 1);
    }

    private static int eff(int n, int k){
        int fn = 1, fk = 1;
        for(int i = 1;i<=n;i++){
            fn*=i;
            if(i == n - k){
                fk = fn;
            }
        }
        return fn / fk;
    }
}
