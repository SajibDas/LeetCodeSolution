/**
 * 
 */
package leetcode.com.problemset.all;

/**
 * @author Sajib Kr. Das
 *
 */
public class _122_BestTimeToBuyAndSellStockII {
	/**
	 * Problem : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/submissions/
	 * @param prices
	 * @return
	 */
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 1; i < prices.length; i++){

            if(prices[i] > prices[i-1]){
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }

}
