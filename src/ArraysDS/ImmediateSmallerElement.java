package ArraysDS;

/**
 * 4203 2899 9022 8070 2594 9520 4082 687 3962 6833 7852 8269 7891 2511 5757 1711 9707 93 8626 4149 626 721 5461 6727 8399 9822 2890 8985 5591 3088 948 6146 2339 6322 4217 4934 2195 8299 1973 6157 1484 6177 779 5727 8689 6536 3791 4748 2981 2417 5249 3608 9490 710 335 4242 533 3225 3227 6124 2665 4175 8623 5005 6850 2840 6291 9045 7491 8264 5202 5327 793 5981 7406 5834 8870 1197 583 1851 9966 5832 5459 9457 6543 2146 3699 7076 5371 3278 9552 8037 3806 8175 9394 656 7367 5685 9701 1210 3949 4903 6537 1094 7237 3944 6929 6107 1493 7512 7958 1460 3344 9770 7269 9887 1916 7320 3315 3640 598 2868 1677 4404 7395 1071 1412 4763 3108 1113 5973 3409 2369 8863 4503 5958 2807 1432 8417 652 8944 6375 2112 8641 2497 9381 8528 4414 3053 8196 8054 3652 1064 6083 4408 4811 3506 2173 9574 6614 9638 1900 23 2007 763 4526 4317 9922 5959 2734 574 1255 5462 9039 9896 7959 4772 4777 8725 7826 2973 6779 7830 389 9214 8590 5200 2720 763 1127 9334 402 3027 9357 8761 142 236 3079 64
 * 1963
 */
public class ImmediateSmallerElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(smaller(arr, 1963));
    }
    private static int smaller(int[] arr, int x){
        int minDiff = Integer.MAX_VALUE;
        int el = -1;
        for (int j : arr) {
            int diff = Math.abs(x - j);
            if (diff < minDiff) {
                minDiff = diff;
                el = j;
            }
        }
        return el;
    }
}