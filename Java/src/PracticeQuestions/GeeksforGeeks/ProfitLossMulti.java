package PracticeQuestions.GeeksforGeeks;

public class ProfitLossMulti {
    public int maxProfit(int prices[]) {
        int minNum = prices[0];
        int TotalProfit = 0, currentProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(minNum>prices[i]) {
                minNum = prices[i];
                TotalProfit = TotalProfit+currentProfit;
                currentProfit = 0;
            }

            currentProfit = Math.max(currentProfit, prices[i] - minNum);
        }

        return TotalProfit+currentProfit;
    }


public static void main() {
    int[] arr = {86,92,24,5,34,72,68,52,27,95,41,28,35};
    ProfitLossMulti pl = new ProfitLossMulti();

    System.out.println(pl.maxProfit(arr));
}
}