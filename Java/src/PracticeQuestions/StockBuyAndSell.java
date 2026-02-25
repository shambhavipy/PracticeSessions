package PracticeQuestions;

public class StockBuyAndSell {

    public int maxProfit(int[] prices) {
        int i, j, temp;
        for (i = 0; i < prices.length; i++) {
            System.out.println(i);
        }
        return i;
    }


    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        StockBuyAndSell sbs = new StockBuyAndSell();
        System.out.println(sbs.maxProfit(prices));

    }
}
