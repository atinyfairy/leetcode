package solution;

/**
 * @author 周意朗
 * Date: 2020/11/25
 * @since JDK 11
 * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
 * 请返回 nums 的动态和。
 * 示例 1：
 * 输入：nums = [1,2,3,4]
 * 输出：[1,3,6,10]
 * 解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/running-sum-of-1d-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution1480 {
    public int[] runningSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        int length = nums.length;
        int vector = nums[0];
        for (int i = 1; i < length; i++) {
            nums[i] = nums[i] + vector;
            vector = nums[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] ints = {1, 1, 1, 1, 1};
        Solution1480 solution1480 = new Solution1480();
        int[] ints1 = solution1480.runningSum(ints);
        for (int i : ints1) {
            System.out.println(i);
        }

    }
}
