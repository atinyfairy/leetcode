package solution;

import org.junit.Test;

/**
 * @author 周意朗
 * Date: 2021/10/19
 * @since JDK 11
 * https://leetcode-cn.com/problems/jump-game/
 * 给定一个非负整数数组 nums ，你最初位于数组的 第一个下标 。
 * <p>
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * <p>
 * 判断你是否能够到达最后一个下标。
 */
public class Solution55 {
    public boolean canJump(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return true;
        }
        int position = 0;
        int max = nums[0];
        while (position <= max && position < (length - 1)) {
            max = Math.max(max, position + nums[position]);
            position = position + 1;
            if (max >= length) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void test() {
        int[] nums = {2, 1, 1, 3, 4};
        int[] nums1 = {3, 2, 1, 0, 4};
        System.out.println(canJump(nums));
    }
}
