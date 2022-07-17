package algorithm;

import org.junit.Test;

/**
 * @author 周意朗
 * Date: 2021/8/2
 * @since JDK 11
 * 有这样一个序列：
 * A , B，C .… ， Z ,(1 - 26)
 * AA , AB, AC …AZ，BA , BB ,BC… ，BZ ,… ZZ ,(27 - 26*26)
 * AAA , AAB , AAC ，… AAZ,ABA , ABB , ABC… ，(26*26+1 - 26*26*26)
 * (26^(n-1) - 26^n)
 * 请找出规律编写函数，并调用函数分别输出第 700和20000 位的值
 * <p>
 * 分析: 就是10进制转26进制
 */
public class TheFirstProblem {
    /**
     * 解决方法
     * 这里没有考虑超出int范围的输入(应该不至于用BigInteger吧)
     *
     * @param number 需要查找的位置
     * @return 查找出的字符串
     */
    public static String function(int number) {

        //特殊情况
        if (number <= 0) {
            return "input a positive number please";
        }

        StringBuilder stringBuilder = new StringBuilder();
        //记录余数
        int rest;

        //10进制转26进制
        while (number > 0) {
            rest = number % 26;
            //取模为0的时候,应该是Z
            if (rest == 0) {
                rest = 26;
                number = number - 26;
            }
            stringBuilder.append((char) (rest + 64));
            number = number / 26;
        }

        return stringBuilder.reverse().toString();
    }


    @Test
    public void test() {
        System.out.println("700的结果" + function(700));
        System.out.println("20000的结果" + function(20000));
    }

}
