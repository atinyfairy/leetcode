package solution;

import java.util.Objects;

/**
 * @author 周意朗
 * Date: 2021/8/17
 * @since JDK 11
 * https://leetcode-cn.com/problems/regular-expression-matching/
 * 给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。
 */
public class Solution10 {
    public boolean isMatch(String s, String p) {

        if (Objects.equals(p, ".*") && s.length() > 0) {
            return true;
        }

        char[] char_s = s.toCharArray();
        char[] char_p = p.toCharArray();

        for (int i = 0, j = 0; i < s.length() && j < p.length(); ) {
            //base case
            if (char_s[i] == char_p[j]) {
                i++;
                j++;
                continue;
            }

            if (char_p[j] == '.') {

            }

            if (char_s[i] != char_p[j]) {
                if (char_s[j + 1] == '*' && char_s[i] == char_p[j + 2]) {

                }
            }
            if (char_p[j] == '*') {

                if (char_s[i] == char_s[i - 1]) {
                    i++;
                } else {
                    j++;
                }
                continue;
            }
            return false;
        }

        return true;
    }
}
