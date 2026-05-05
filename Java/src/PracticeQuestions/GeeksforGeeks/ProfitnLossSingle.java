package PracticeQuestions.GeeksforGeeks;

public class ProfitnLossSingle {
    public int maxProfit(int[] prices) {
        int minNum = prices[0];
        int maxProfit = 0;
        for(int i=1; i<prices.length; i++) {
            minNum = Math.min(minNum, prices[i]);
            maxProfit = Math.max(maxProfit, (prices[i]-minNum));
        }
        return maxProfit;
    }

    public static void main() {
        int[] arr = {10, 7, 1, 3, 6, 9, 2};
        ProfitnLossSingle ps = new ProfitnLossSingle();

        System.out.println(ps.maxProfit(arr));
    }
}
