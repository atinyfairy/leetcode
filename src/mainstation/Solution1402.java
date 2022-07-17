package mainstation;

import java.util.Arrays;

/**
 * @author 周意朗
 * Date: 2021/5/21
 * @since JDK 11
 * https://leetcode-cn.com/problems/reducing-dishes/
 */
public class Solution1402 {
    public static int maxSatisfaction(int[] satisfaction) {
        int length = satisfaction.length;
        if (length == 0) {
            return 0;
        }

        Arrays.sort(satisfaction);

        if (length == 1 && satisfaction[0] <= 0) {
            return 0;
        }
        if (length == 1) {
            return satisfaction[0];
        }

        if (satisfaction[length - 1] <= 0) {
            return 0;
        }

        int zeroIndex = 0;
        int ori = 0, rep = 0;

        for (int i = 0; i < length; i++) {
            if (satisfaction[i] >= 0) {
                zeroIndex = i;
                break;
            }
        }

        for (int i = zeroIndex, j = 1; i < length; i++, j++) {
            ori += satisfaction[i] * j;
            rep += satisfaction[i];
        }

        for (int i = zeroIndex - 1; i >= 0; i--) {
            if (Math.abs(satisfaction[i]) > rep) {
                break;
            }
            rep = rep + satisfaction[i];
            ori = ori + rep;
        }
        return ori;
    }

    public static void main(String[] args) {
//        int[] s = {-1, -8, 0, 5, -9};
//        int[] s = {4, 3, 2};
//        int[] s = {-1, -4, -5};
        int[] s = {-2, 5, -1, 0, 3, -3};
        System.out.println(maxSatisfaction(s));
    }
}
