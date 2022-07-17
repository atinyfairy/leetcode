package base;

import java.util.Arrays;

/**
 * @author 周意朗
 * Date: 2021/8/12
 * @since JDK 11
 */
public class Kmp {

    public static void main(String[] args) {
        String pat = "ABACABAD";
        String txt = "BBCABACABACABADBCDABDE";
        int result = kmp(txt, pat);

        //打印结果：和字符串获得匹配的位置
        System.out.println("result Position:" + result);
    }

    /**
     * KMP 匹配
     */
    public static int kmp(String txt, String pat) {
        //1.首先计算出 部分匹配表
        int[] next = kmpnext(pat);

        System.out.println("next =" + Arrays.toString(next));
        //2.查找匹配位置
        for (int i = 0, j = 0; i < txt.length(); i++) {
            while (j > 0 && txt.charAt(i) != pat.charAt(j)) {
                j = next[j - 1];
            }
            if (txt.charAt(i) == pat.charAt(j)) {
                j++;
            }
            if (j == pat.length()) {
                return i - j + 1;
            }
        }
        return -1;
    }

    /**
     * 计算部分匹配表
     */
    public static int[] kmpnext(String pat) {
//        String a = "ABACABAD";
//        String b = "BBCABACABACABADBCDABDE";
        int[] next = new int[pat.length()];
        next[0] = 0;

        for (int i = 1, j = 0; i < pat.length(); i++) {
            while (j > 0 && pat.charAt(j) != pat.charAt(i)) {
                j = next[j - 1];
            }
            if (pat.charAt(i) == pat.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }
}
