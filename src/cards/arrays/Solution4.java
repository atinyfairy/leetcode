package cards.arrays;

import java.util.BitSet;
import java.util.HashSet;

/**
 * @author 周意朗
 * Date: 2021/9/16
 * @since JDK 11
 */
public class Solution4 {
    public boolean containsDuplicate(int[] nums) {
        return method2(nums);
    }

    public static boolean method1(int[] nums){
        //只能比较正数
        BitSet bitSet = new BitSet();
        for (int i = 0; i < nums.length; i++) {
            if (bitSet.get(nums[i])) {
                return true;
            }
            bitSet.set(nums[i]);
        }
        return false;
    }

    public static boolean method2(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        return set.size()==nums.length;
    }
}
