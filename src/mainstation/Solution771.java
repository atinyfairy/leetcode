package mainstation;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 周意朗
 * Date: 2021/5/25
 * @since JDK 11
 * https://leetcode-cn.com/problems/jewels-and-stones/
 */
public class Solution771 {
    public int numJewelsInStones(String jewels, String stones) {
        if (jewels.length() == 0 || stones.length() == 0) {
            return 0;
        }
        int res = 0;
        char[] jew = jewels.toCharArray();
        char[] sto = stones.toCharArray();
        Set<Character> set = new HashSet<>(jew.length);
        for (char c : jew) {
            set.add(c);
        }
        for (char c : sto) {
            if (set.contains(c)) {
                res = res + 1;
            }
        }
        return res;
    }
}
