package offer;

import org.junit.Test;

/**
 * @author 周意朗
 * Date: 2020/12/1
 * @since JDK 11
 *
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
 * 请定义一个函数实现字符串左旋转操作的功能。
 * 比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 * 示例 1：
 * 输入: s = "abcdefg", k = 2
 * 输出:"cdefgab"
 * 示例 2：
 * 输入: s = "lrloseumgh", k = 6
 * 输出:"umghlrlose"
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Offer58 {
    public String reverseLeftWords(String s, int n) {
        if (n >= s.length()) {
            StringBuilder sb = new StringBuilder(s);
            return sb.reverse().toString();
        } else {
            char[] chars = s.toCharArray();
            StringBuilder stringBuffer = new StringBuilder("");

            for (int i = n; i <s.length() ; i++) {
                stringBuffer.append(chars[i]);
            }

            for (int i = 0; i <n ; i++) {
                stringBuffer.append(chars[i]);
            }
            return stringBuffer.toString();
        }
    }

//    public String reverseLeftWords(String s, int n) {
//        String son = "",nu = "";
//        son = s.substring(0,n);
//        nu = s.substring(n,s.length());
//        nu += son;
//        return nu;
//    }
//
//    作者：mooncell123
//    链接：https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/solution/zhi-xing-0ms-100-xiao-hao-38mb-96-by-mooncell123/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

    @Test
    public void test() {
        String a = reverseLeftWords("akjh", 6);
        System.out.println(a);
    }
}
