package solution;

/**
 * @author 周意朗, 学号3120180905534
 * Date: 2020/9/4
 * Time: 0:16
 * @since JDK 11
 * 给定两个大小为 m 和 n 的正序（从小到大）数组nums1 和nums2。
 *
 * 请你找出这两个正序数组的中位数，并且要求算法的时间复杂度为O(log(m + n))。
 *
 * 你可以假设nums1和nums2不会同时为空。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * totalLength = num1.length + num2.length
 * 判断奇偶,然后从第一位开始遍历,BinarySearch
 */
public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int lengthOfOne = nums1.length;
        int i0 = 0;
        int lengthOfTwo = nums2.length;
        int j0 = 0;
        int all = lengthOfOne + lengthOfTwo;
        int[] allNums = new int[all];
        while (i0 + j0  != all) {
            for (int k = 0; k < all; k++) {
                if (nums1[i0] < nums2[j0]) {
                    allNums[k] = nums2[j0];
                    j0++;
                } else {
                    allNums[k] = nums1[i0];
                    i0++;
                }
            }
        }
        int le = allNums.length;
        if (le % 2 == 0) {
            return Float.parseFloat(String.valueOf(allNums[le / 2] + allNums[le / 2 + 1])) / 2;
        } else {
            return allNums[le / 2];
        }
    }

    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        int[] a = {1, 3};
        int[] b = {2};
        System.out.println(s4.findMedianSortedArrays(a, b));
    }
}
