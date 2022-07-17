package offer;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * @author 周意朗
 * Date: 2021/3/14
 * @since JDK 11
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 * 示例 1:
 * 输入: n = 1
 * 输出: [1,2,3,4,5,6,7,8,9]
 * 说明：
 * 用返回一个整数列表来代替打印
 * n 为正整数
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 其实是靠的BIgInteger 再加一个Object转Int类
 */
public class Offer17 {
    public static Object[] printNumbers(int n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        sb.append("0".repeat(Math.max(0, n)));
        BigInteger bigInteger = new BigInteger(String.valueOf(sb));
        ArrayList<BigInteger> result = new ArrayList<>();
        BigInteger one = BigInteger.ONE;
        while (!one.equals(bigInteger)) {
            result.add(one);
            one.add(BigInteger.ONE);
        }
        return result.toArray();
    }

    public static void main(String[] args) {
        Object[] objects = printNumbers(2);
        for (Object object : objects) {
            System.out.println(object);
        }
    }
}
