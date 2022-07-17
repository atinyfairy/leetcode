package offer;

import java.util.ArrayList;

/**
 * @author 周意朗
 * Date: 2021/4/11
 * @since JDK 11
 * <p>
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，则输出"student. a am I"。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入: "the sky is blue"
 * 输出: "blue is sky the"
 * 示例 2：
 * <p>
 * 输入: "  hello world!  "
 * 输出: "world! hello"
 * 解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 * 示例 3：
 * <p>
 * 输入: "a good   example"
 * 输出: "example good a"
 * 解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 *  
 * <p>
 * 说明：
 * <p>
 * 无空格字符构成一个单词。
 * 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 * 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Offer58_2 {
    public static String reverseWords(String s) {
        String[] splitString = s.trim().split(" ");
        StringBuilder sb = new StringBuilder("");
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = splitString.length - 1; i >= 0; i--) {
            if (splitString[i].equals("")) {
                continue;
            }
            sb.append(splitString[i]+" ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String this_is_the_police_station = reverseWords("This is The Police Station");
//        String this_is_the_police_station = reverseWords("  hello world!  ");
        System.out.println(this_is_the_police_station);
    }
}
