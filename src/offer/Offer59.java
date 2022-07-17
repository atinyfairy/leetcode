package offer;

import org.junit.Test;

/**
 * @author 周意朗
 * Date: 2021/4/12
 * @since JDK 11
 * <p>
 * https://leetcode-cn.com/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/
 * <p>
 * 给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。
 * <p>
 *
 *        public int[] maxSlidingWindow(int[] nums, int k) {
 *         if(nums.length == 0 || k == 0) return new int[0];
 *         Deque<Integer> deque = new LinkedList<>();
 *         int[] res = new int[nums.length - k + 1];
 *         // 未形成窗口
 *         for(int i = 0; i < k; i++) {
 *             while(!deque.isEmpty() && deque.peekLast() < nums[i])
 *                 deque.removeLast();
 *             deque.addLast(nums[i]);
 *         }
 *         res[0] = deque.peekFirst();
 *         // 形成窗口后
 *         for(int i = k; i < nums.length; i++) {
 *             if(deque.peekFirst() == nums[i - k])
 *                 deque.removeFirst();
 *             while(!deque.isEmpty() && deque.peekLast() < nums[i])
 *                 deque.removeLast();
 *             deque.addLast(nums[i]);
 *             res[i - k + 1] = deque.peekFirst();
 *         }
 *         return res;
 *     }
 *
 * 作者：jyd
 * 链接：https://leetcode-cn.com/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/solution/mian-shi-ti-59-i-hua-dong-chuang-kou-de-zui-da-1-6/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Offer59 {

    /**
     * 这个函数是为了找到目前区间最大值用的
     * @param i 窗口左侧位置
     * @param j 窗口右侧位置
     * @param nums 数组
     * @return 最大位置所在的值
     */
    public static int findMax(int i, int j, int[] nums) {
        int max = nums[i];
        int position = i;
        while (i <= j) {
            if (max <= nums[i]) {
                position = i;
                max = nums[position];
            }
            i++;
        }
        return position;
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {

        /*
            下面的几个特殊情况,数组为空,k值为1,k值和数组长度相同
         */

        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        if (k == 1) {
            return nums;
        }
        if (k == nums.length) {
            int max = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }
            return new int[]{max};
        }


        //最开始的窗口位置
        int i = 0, j = k - 1;

        //记录数组以及构成
        //记录在哪个位置
        int index = 1;
        int[] result = new int[nums.length - k + 1];

        //记录最大值以及最大值位置
        int max = 0, maxPosition = 0;

        //初始最大值
        maxPosition = findMax(i, j, nums);
        max = nums[maxPosition];

        result[0] = max;

        while (j < nums.length - 1) {
            j += 1;
            i += 1;
            if (maxPosition >= i) {
                if (nums[j] >= max) {
                    maxPosition = j;
                }
            } else {
                maxPosition = findMax(i, j, nums);
            }
            max = nums[maxPosition];
            result[index++] = max;
        }



        return result;
    }

    @Test
    public void test() {
//        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
//        int[] nums = {9, 11};
        int[] nums = {1,3,1,2,0,5};
        int[] ints = maxSlidingWindow(nums, 3);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
