package cards.arrays;

import org.junit.Test;

/**
 * @author 周意朗
 * Date: 2021/9/15
 * @since JDK 11
 * 删除排序数组中的重复项
 */
public class Solution1 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums[0] == nums[nums.length - 1]) {
            return 1;
        }
        int i = 1, j = 1;
        while (j < nums.length) {
            if (nums[j - 1] != nums[j]) {
                nums[i] = nums[j];
                i++;
            }
            j++;

        }
        return i ;
    }

    @Test
    public void test() {
//        int[] nums = {1,1,1,1,2,3,4,4,4,7,8};
//        int[] nums = {1,1,1,1,2,3,4,4,4,7,8};
        int[] nums = {1, 2, 2};
//        int[] nums = {1,1,1,1};
        System.out.println(removeDuplicates(nums));
    }
}
