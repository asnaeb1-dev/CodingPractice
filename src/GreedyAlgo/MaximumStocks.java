package GreedyAlgo;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumStocks {
    static class Stock{
        int count;
        int price;

        public Stock(int count, int price) {
            this.count = count;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        int[] a = {10, 7, 19};
        System.out.println(maximumStock(a, a.length, 45));
    }
    private static int maximumStock(int[] a, int n, int K){
        ArrayList<Stock> stocks = new ArrayList<>();
        for(int i = 0;i<n;i++){
            stocks.add(new Stock(i + 1, a[i]));
        }
        Collections.sort(stocks, (o1, o2) -> o1.price - o2.price);

        int maxStock = 0;
        for(int i = 0;i<n;i++){
            int stockCount = stocks.get(i).count;
            int stockPrice = stocks.get(i).price;

            if((K / stockPrice) >= stockCount){
                maxStock+=stockCount;
                K-=(stockCount * stockPrice);
            }else{
                maxStock+=(K/stockPrice);
                K-=(stockCount * (K/stockPrice));
            }
        }
        return maxStock;
    }
}
