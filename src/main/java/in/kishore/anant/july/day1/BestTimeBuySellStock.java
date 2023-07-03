package in.kishore.anant.july.day1;

public class BestTimeBuySellStock {

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};//{7,1,5,3,6,4};
        int maxProfit = maxProfit(prices);
        System.out.println(maxProfit);
    }

    public static int maxProfit(int[] prices) {

        int maxProfit = 0;
        int lowPrice = prices[0];

        for (int i = 0; i < prices.length; i++) {

            if(prices[i]-lowPrice > maxProfit){
                maxProfit = prices[i] - lowPrice;
            }
            if(lowPrice > prices[i]){
                lowPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
