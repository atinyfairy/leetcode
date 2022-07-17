package solution;

/**
 * @author 周意朗
 * Date: 2021/8/17
 * @since JDK 11
 * https://leetcode-cn.com/problems/student-attendance-record-i/
 */
public class Solution551 {

    public static boolean checkRecord(String s) {
        if (s.length() < 2) {
            return true;
        }

        int absentTime = 0;
        int lateTime = 0;

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'P') {
                lateTime = 0;
            } else if (chars[i] == 'A') {
                absentTime += 1;
                lateTime = 0;
                if (absentTime > 1) {
                    return false;
                }
            } else {
                lateTime += 1;
                if (lateTime > 2) {
                    return false;
                }
            }
        }
        return true;
    }

}
