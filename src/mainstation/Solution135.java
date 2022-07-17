package mainstation;

/**
 * @author 周意朗
 * Date: 2021/5/11
 * @since JDK 11
 * https://leetcode-cn.com/problems/candy/
 * <p>
 * 找出最小值以及其索引
 * <p>
 * 左右分别维护
 * <p>
 * 向左-->    ==左边  分一样的糖
 * <左边  多份一个
 * >左边
 * 左二大于左一  左一为1,左二为2
 * 左二小于左一  递归
 */
public class Solution135 {
    public int candy(int[] ratings) {
        int length = ratings.length;
        int min = Integer.MAX_VALUE;
        int index = 0;
        int total = 1;

        for (int i = 0; i < length; i++) {
            if (ratings[i] < min) {
                min = ratings[i];
                index = i;
            }
        }

        for (int i = (index - 1); i > 0; i++) {

        }

        for (int i = (index + 1); i <length; i++) {

        }
        return 0;
    }
}

