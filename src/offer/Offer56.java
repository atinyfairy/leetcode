package offer;

import java.util.HashMap;

/**
 * @author 周意朗
 * Date: 2021/4/9
 * @since JDK 11
 * 在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。请找出那个只出现一次的数字。
 *
 * public int singleNumber(int[] nums) {
 *         int ones = 0, twos = 0;
 *         for(int num : nums){
 *             ones = ones ^ num & ~twos;
 *             twos = twos ^ num & ~ones;
 *         }
 *         return ones;
 *     }
 *
 * 作者：jyd
 * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-ii-lcof/solution/mian-shi-ti-56-ii-shu-zu-zhong-shu-zi-chu-xian-d-4/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 */
public class Offer56 {
    public int singleNumber(int[] nums) {
        if ( nums.length == 1) {
            return nums[0];
        }
        HashMap<Integer, Boolean> hashMap = new HashMap<>((nums.length + 2) / 3);
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], false);
            } else {
                hashMap.put(nums[i], true);
            }
        }

        int result = 0;

        for (Integer integer : hashMap.keySet()) {
            if (hashMap.get(integer).equals(true)) {
                result = integer;
            }
        }
        return result;
    }
}
