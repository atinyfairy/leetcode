package offer;

import org.junit.Test;

/**
 * @author 周意朗
 * Date: 2021/3/22
 * @since JDK 11
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */
public class Offer05 {
    public String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder("");
        int i = 0;
        while (i != chars.length) {
            if (chars[i] != ' ') {
                stringBuilder.append(chars[i]);
            } else {
                stringBuilder.append("%20");
            }
            i++;
        }
        return stringBuilder.toString();
    }
    @Test
    public void test(){
        String s = "We are happy.";
        System.out.println("===========================");
        System.out.println("===========================");
        System.out.println(replaceSpace(s));
    }
}
