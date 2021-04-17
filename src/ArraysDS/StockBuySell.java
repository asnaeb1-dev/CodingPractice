package ArraysDS;

public class StockBuySell {
    public static void main(String[] args) {
        int[] stock = {4, 2, 2, 2, 4};
        stockBuySell(stock, stock.length);
    }
    private static void stockBuySell(int[] a, int n){
        boolean isFirstValue = true;
        int fv = -1, lv = -1;
        for(int i = 0;i<a.length;i++){
            if(a[i + 1] - a[i] >= 0){
                if(isFirstValue){
                    fv = i;
                    isFirstValue = false;
                }
            }else{

            }
        }
    }
}
