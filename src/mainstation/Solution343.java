package mainstation;

/**
 * @author 周意朗
 * Date: 2021/5/23
 * @since JDK 11
 * https://leetcode-cn.com/problems/integer-break/
 *
 * https://leetcode-cn.com/problems/integer-break/solution/zheng-shu-chai-fen-shu-xue-fang-fa-han-wan-zheng-t/
 */
public class Solution343 {
    public static int integerBreak(int n) {
        int p = n % 3, q = n / 3, r = p + (2 * p + 1) % 5;
        return n <= 3 ? n - 1 : (int)(Math.pow(3, q - (p & 1)) * r);
    }

    public static void main(String[] args) {
        int i = integerBreak(7);
        System.out.println(i);
    }
}
