package DynamicProgramming;

public class SticklerThief {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        //System.out.println(sticker(a, a.length));
        mem = new int[a.length + 1];
        int res = stickerThief(a, a.length);
        System.out.println(res);
    }
    private static int sticker(int[] a, int n){
        if(n == 0) return 0;
        if(n == 1) return a[0];
        if(n == 2) return Math.max(a[0], a[1]);
        int[] dp = new int[n];
        dp[0] = a[0];
        dp[1] = Math.max(dp[0], dp[1]);
        for(int i = 2;i<n;i++){
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + a[i]);
        }
        return Math.max(dp[n - 1], dp[n - 2]);
    }

    static int[] mem;
    private static int stickerThief(int[] a, int n){
        if(n == 0) return 0;
        if(n == 1) return a[n - 1];
        if(n == 2) return Integer.max(a[n - 1], a[0]);
        return Integer.max(a[n - 1] + stickerThief(a, n - 2), stickerThief(a, n - 1));
    }
}
