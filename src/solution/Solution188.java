package solution;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author 周意朗
 * Date: 2020/12/28
 * @since JDK 11
 *
 * UNSOLVED
 *
 * 给定一个整数数组prices ，它的第 i 个元素prices[i] 是一支给定的股票在第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你最多可以完成 k 笔交易。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * 示例 1：
 * 输入：k = 2, prices = [2,4,1]
 * 输出：2
 * 解释：在第 1 天 (股票价格 = 2) 的时候买入，在第 2 天 (股票价格 = 4) 的时候卖出，这笔交易所能获得利润 = 4-2 = 2 。
 * 示例 2：
 * 输入：k = 2, prices = [3,2,6,5,0,3]
 * 输出：7
 * 解释：在第 2 天 (股票价格 = 2) 的时候买入，在第 3 天 (股票价格 = 6) 的时候卖出, 这笔交易所能获得利润 = 6-2 = 4 。
 * 随后，在第 5 天 (股票价格 = 0) 的时候买入，在第 6 天 (股票价格 = 3) 的时候卖出, 这笔交易所能获得利润 = 3-0 = 3 。
 * 提示：
 * 0 <= k <= 10^9
 * 0 <= prices.length <= 1000
 * 0 <= prices[i] <= 1000
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-iv
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution188 {
//
//    public int maxProfit(int k, int[] prices) {
//        if (prices.length == 0) {
//            return 0;
//        }
//
//        int n = prices.length;
//        k = Math.min(k, n / 2);
//        int[][] buy = new int[n][k + 1];
//        int[][] sell = new int[n][k + 1];
//
//        buy[0][0] = -prices[0];
//        sell[0][0] = 0;
//        for (int i = 1; i <= k; ++i) {
//            buy[0][i] = sell[0][i] = Integer.MIN_VALUE / 2;
//        }
//
//        for (int i = 1; i < n; ++i) {
//            buy[i][0] = Math.max(buy[i - 1][0], sell[i - 1][0] - prices[i]);
//            for (int j = 1; j <= k; ++j) {
//                buy[i][j] = Math.max(buy[i - 1][j], sell[i - 1][j] - prices[i]);
//                sell[i][j] = Math.max(sell[i - 1][j], buy[i - 1][j - 1] + prices[i]);
//            }
//        }
//
//        return Arrays.stream(sell[n - 1]).max().getAsInt();
//    }
//
//    作者：LeetCode-Solution
//    链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-iv/solution/mai-mai-gu-piao-de-zui-jia-shi-ji-iv-by-8xtkp/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
//
    public static int maxProfit(int k, int[] prices) {
        int length = prices.length;
        int iterator;
        ArrayList<Integer> arr = new ArrayList<>();
//        int[] theKeys = new int[k];
//        for (int a = 0; a < k; a++) {
//            theKeys[a] = 0;
//        }
        for (int i = 0; i < length - 1; ) {
            int money = 0;
            if (prices[i] < prices[i + 1]) {
                int j = i + 1;
                iterator = j + 1;
                while (iterator < length && prices[iterator] > prices[j]) {
                    j = iterator;
                    iterator = iterator + 1;
                }
                money += (prices[j] - prices[i]);
                System.out.println(money);
                arr.add(money);
//                for (int z = 0; z < k; z++) {
//                    int min = 0;
//                    if (money > theKeys[z]) {
//                        theKeys[z]=money;
//                    }
//                }
                i = j;
            } else {
                i++;
            }
        }

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub
                return o2 - o1;
            }
        };

        arr.sort(c);
        int result = 0;
        for (int i = 0; i < k && i < arr.size(); i++) {
            if (null != arr.get(i)) {
                result += arr.get(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        int[] ints = {6, 1, 3, 2, 4, 7};
//        int[] ints = {2, 4, 1};
        int[] ints = {1, 2, 4, 2, 5, 7, 2, 4, 9, 0};
        System.out.println(maxProfit(2, ints));
    }
}











