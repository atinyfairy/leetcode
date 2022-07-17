package algorithm;

import org.junit.Test;

/**
 * @author 周意朗
 * Date: 2021/8/2
 * @since JDK 11
 * 输出一串字符中连续出现最多次的字符(不使用工具类)。
 *
 * 这里我访问了 https://docs.oracle.com/javase/8/docs/api/java/util/package-summary.html 确定了没有使用util下面的任何工具
 */
public class TheSecondProblem {

    public static Character function(String string) {

        //特殊情况
        if (string.length() == 0) {
            return null;
        }
        if (string.length() == 1) {
            return string.charAt(0);
        }

        //初始化值
        char res = string.charAt(0);
        //最大值
        int max = 0;
        //当前最大值
        int currMax = 1;
        //双向指针
        int i = 0;
        int j = 1;

        while (j < string.length()) {
            //左右指针相等
            if (string.charAt(i) == string.charAt(j)) {
                currMax = currMax + 1;
                if (j == string.length() - 1) {
                    if (currMax > max) {
                        res = string.charAt(i);
                    }
                }
                j++;
            }
            //左右指针不等
            else {
                if (currMax > max) {
                    max = currMax;
                    res = string.charAt(i);
                }
                i = j;
                j = j + 1;
                currMax = 1;
            }
        }
        return res;
    }

    @Test
    public void test() {
        System.out.println(function("aegpigbbbbaeeeriiiiiiabigbripagggggggppppabg"));
    }

}
