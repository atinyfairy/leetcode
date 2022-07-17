package cards.arrays;

import org.junit.Test;

/**
 * @author 周意朗
 * Date: 2021/9/16
 * @since JDK 11
 */
public class Solution8 {
    public static void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        while (nums[i] != 0) {
            i = i + 1;
            if (nums.length <= i) {
                break;
            }
        }
        j = i;
        while (j < nums.length) {
            if (nums[j] == 0) {
                j++;
                continue;
            }
            nums[i] = nums[j];
            nums[j] = 0;
            i = findNextZero(nums, i);
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static int findNextZero(int[] nums, int begin) {
        while (nums[begin] != 0) {
            begin++;
        }
        return begin;
    }

    @Test
    public void test() {
        int[] a = {1, 2, 3, 6, 0, 0, 0, 1, 2, 5, 1, 5, 5};
        int[] b = {2,1};
        moveZeroes(b);
    }
}
