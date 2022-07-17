package cards.arrays;

import org.junit.Test;

/**
 * @author 周意朗
 * Date: 2021/9/16
 * @since JDK 11
 */
public class Solution3 {
    public static void rotate(int[] nums, int k) {
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[(i+k)%nums.length] = nums[i];
        }
        nums=res;
        for (int num : nums) {
            System.out.println(num);
        }
    }
    @Test
    public void test(){
        int[] a = {1,2,3,4,5,6,7};
        rotate(a,3);

    }
}
