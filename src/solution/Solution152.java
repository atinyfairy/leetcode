package solution;

import java.util.ArrayList;

/**
 * @author 周意朗
 * Date: 2021/8/8
 * @since JDK 11
 * https://leetcode-cn.com/problems/maximum-product-subarray/
 */
public class Solution152 {
    public int maxProduct(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }
        int res = Integer.MIN_VALUE;

        int n = nums.length;
        int ans = nums[0];
        ArrayList<Integer> maxN = new ArrayList<>(n);
        ArrayList<Integer> minN = new ArrayList<>(n);
        maxN.set(0, ans);
        minN.set(0, ans);
        for (int i = 1; i < n; i++) {
            if (nums[i] > 0) {
                maxN.set(i, Math.max(nums[i], maxN.get(i - 1) * nums[i]));
                minN.set(i, Math.min(nums[i], minN.get(i - 1) * nums[i]));
            } else {
                maxN.set(i, Math.max(nums[i], minN.get(i - 1) * nums[i]));
                minN.set(i, Math.min(nums[i], maxN.get(i - 1) * nums[i]));
            }
            ans = Math.max(ans, maxN.get(i));
        }
        return res;
    }
}
