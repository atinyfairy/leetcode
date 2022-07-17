package solution;

/**
 * @author 周意朗
 * Date: 2020/11/25
 * @since JDK 11
 * 给你一个字符串s，请你根据下面的算法重新构造字符串：
 * <p>
 * 从 s中选出 最小的字符，将它 接在结果字符串的后面。
 * 从 s剩余字符中选出最小的字符，且该字符比上一个添加的字符大，将它 接在结果字符串后面。
 * 重复步骤 2 ，直到你没法从 s中选择字符。
 * 从 s中选出 最大的字符，将它 接在结果字符串的后面。
 * 从 s剩余字符中选出最大的字符，且该字符比上一个添加的字符小，将它 接在结果字符串后面。
 * 重复步骤 5，直到你没法从 s中选择字符。
 * 重复步骤 1 到 6 ，直到 s中所有字符都已经被选过。
 * 在任何一步中，如果最小或者最大字符不止一个，你可以选择其中任意一个，并将其添加到结果字符串。
 * 请你返回将s中字符重新排序后的 结果字符串 。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/increasing-decreasing-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution1370 {
    public String sortString(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        int length = s.length();
        char[] chars = s.toCharArray();
//
//        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
//        for (int b = 0; b < length; b++) {
//            hashMap.put(chars[b],1);
//        }

        StringBuilder sb = new StringBuilder("");
        int[] map = new int[26];

        //初始化每个字母的含有量为0
        for (int k = 0; k < 26; k++) {
            map[k] = 0;
        }

        for (int a = 0; a < length; a++) {
            map[(chars[a] - 97)] += 1;
        }

        while (length != 0) {
            for (int i = 0; i < 26; i++) {
                if (map[i] > 0) {
                    sb.append((char) (i + 97));
                    map[i] = map[i] - 1;
                    length--;
                }
            }
            for (int j = 25; j >= 0; j--) {
                if (map[j] > 0) {
                    sb.append((char) (j + 97));
                    map[j] = map[j] - 1;
                    length--;
                }
            }
            System.out.println(sb.toString());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "aaaabbbbcccc";
        Solution1370 solution1370 = new Solution1370();
        String s1 = solution1370.sortString(s);
        System.out.println(s1);
    }
}
