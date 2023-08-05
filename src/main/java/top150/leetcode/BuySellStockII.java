package top150.leetcode;

public class BuySellStockII {

    public static void main(String[] args) {

        int[] nums = {7,1,5,3,6,4};
        int totalProfit = new BuySellStockII().maxProfit(nums);
        System.out.print(totalProfit);

    }

    public int maxProfit(int[] prices) {

        int totalProfit = 0;
        if(prices != null || prices.length > 1){

            for(int i=1; i < prices.length;i++){
                if(prices[i-1] < prices[i]){
                    totalProfit += prices[i]-prices[i-1];
                }
            }
        }
        return totalProfit;
    }
}
