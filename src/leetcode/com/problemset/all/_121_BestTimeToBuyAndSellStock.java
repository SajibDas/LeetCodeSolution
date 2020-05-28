/**
 * 
 */
package leetcode.com.problemset.all;

/**
 * @author Sajib Kr. Das
 *
 */
public class _121_BestTimeToBuyAndSellStock {
	/**
	 * Problem : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
	 * @param prices
	 * @return
	 */
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }else if(prices[i]-minPrice > profit){
                profit = prices[i]-minPrice;
            }
            
        }
        return profit;
    }

}
