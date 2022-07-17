package offer;

import java.util.Arrays;

/**
 * @author 周意朗
 * Date: 2021/4/13
 * @since JDK 11
 * <p>
 * 从扑克牌中随机抽5张牌，判断是不是一个顺子，即这5张牌是不是连续的。2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3,4,5]
 * 输出: True
 *  
 * <p>
 * 示例 2:
 * <p>
 * 输入: [0,0,1,2,5]
 * 输出: True
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/bu-ke-pai-zhong-de-shun-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * <p>
 * 0可以认为是替代
 */
public class Offer61 {
    public static boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int joker = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                joker++;
            } else {
                break;
            }
        }

        for (int i = joker; i < (nums.length - 1); i++) {
            if (nums[i + 1] - nums[i] == 1) {
                continue;
            } else if ((nums[i + 1] - nums[i] - 1) <= joker) {
                joker = joker - nums[i + 1] + nums[i];
            } else if (nums[i + 1] == nums[i]) {
                return false;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
//        int[] nums = {1,2,3,4,5};
        int[] nums = {0, 0, 11, 0, 9};
//        int[] nums = {0, 0, 1, 2, 5};
        boolean straight = isStraight(nums);
        System.out.println(straight);
    }
}
