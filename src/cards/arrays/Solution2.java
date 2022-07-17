package cards.arrays;

/**
 * @author 周意朗
 * Date: 2021/9/16
 * @since JDK 11
 * 买卖股票的最佳时机 II
 */
public class Solution2 {

    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            res += Math.max(prices[i]-prices[i-1],0);
        }
        return res;
    }

}
