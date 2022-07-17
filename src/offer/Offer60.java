package offer;

import java.util.Arrays;

/**
 * @author 周意朗
 * Date: 2021/4/13
 * @since JDK 11
 * 把n个骰子扔在地上，所有骰子朝上一面的点数之和为s。输入n，打印出s的所有可能的值出现的概率。
 * <p>
 *  
 * <p>
 * 你需要用一个浮点数数组返回答案，其中第 i 个元素代表这 n 个骰子所能掷出的点数集合中第 i 小的那个的概率。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/nge-tou-zi-de-dian-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 解题
 * https://leetcode-cn.com/problems/nge-tou-zi-de-dian-shu-lcof/solution/javadong-tai-gui-hua-by-suan-cai-yu-20-3tig/
 */
public class Offer60 {
    public double[] dicesProbability(int n) {
        double[] ans = new double[5 * n + 1];
        double[][] dp = new double[n + 1][6 * n + 1];
        for (int i = 1; i <= 6; i++) {
            dp[1][i] = 1.0 / 6.0;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= 6 * n; j++) {
                for (int k = 1; k <= 6; k++) {
                    if (j > k) {
                        dp[i][j] += dp[i - 1][j - k] * dp[1][k];
                    }
                }
            }
        }
        for (int i = n; i <= 6 * n; i++) {
            ans[i - n] = dp[n][i];
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {9,2,3,5,4,8};
        Arrays.sort(nums);

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
