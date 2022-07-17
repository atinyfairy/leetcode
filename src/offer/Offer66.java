package offer;

/**
 * @author 周意朗
 * Date: 2021/4/23
 * @since JDK 11
 * <p>
 * 给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，其中 B[i] 的值是数组 A 中除了下标 i 以外的元素的积, 即 B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
 * <p>
 * <p>
 * 示例:
 * <p>
 * 输入: [1,2,3,4,5]
 * 输出: [120,60,40,30,24]
 * <p>
 * 提示：
 * <p>
 * 所有元素乘积之和不会溢出 32 位整数
 * a.length <= 100000
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/gou-jian-cheng-ji-shu-zu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Offer66 {
    public static int[] constructArr(int[] a) {
        int n = a.length;
        int[] B = new int[n];
        /* 从左往右累乘 */
        for (int i = 0, product = 1; i < n; product *= a[i], i++) {
            System.out.println(product);
            B[i] = product;
        }

        System.out.println("=============");

        /* 从右往左累乘 */
        for (int i = n - 1, product = 1; i >= 0; product *= a[i], i--) {
            B[i] *= product;
            System.out.println(B[i]);
        }
        return B;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] ints = constructArr(a);
    }
}
