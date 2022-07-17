package offer;

import java.util.Stack;

/**
 * @author 周意朗
 * Date: 2021/1/12
 * @since JDK 11
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如，序列 {1,2,3,4,5} 是某栈的压栈序列，
 * 序列 {4,5,3,2,1} 是该压栈序列对应的一个弹出序列
 * 但 {4,3,5,1,2} 就不可能是该压栈序列的弹出序列。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Offer31 {

    /**
     * 考虑借用一个辅助栈 stack ，模拟 压入 / 弹出操作的排列。根据是否模拟成功，即可得到结果。
     *
     * 入栈操作： 按照压栈序列的顺序执行。
     * 出栈操作： 每次入栈后，循环判断 “栈顶元素 == 弹出序列的当前元素” 是否成立，将符合弹出序列顺序的栈顶元素全部弹出。
     * 由于题目规定 栈的所有数字均不相等 ，因此在循环入栈中，每个元素出栈的位置的可能性是唯一的（若有重复数字，则具有多个可出栈的位置）。因而，在遇到 “栈顶元素 == 弹出序列的当前元素” 就应立即执行出栈。
     *
     * 算法流程：
     * 初始化： 辅助栈 stack ，弹出序列的索引 i ；
     * 遍历压栈序列： 各元素记为 num ；
     * 元素 num 入栈；
     * 循环出栈：若 stack 的栈顶元素 == 弹出序列元素 popped[i]popped[i] ，则执行出栈与 i++ ；
     * 返回值： 若 stack 为空，则此弹出序列合法。
     * 复杂度分析：
     * 时间复杂度 O(N) ： 其中 N 为列表 pushed 的长度；每个元素最多入栈与出栈一次，即最多共 2N 次出入栈操作。
     * 空间复杂度 O(N) ： 辅助栈 stack 最多同时存储 N 个元素。
     *
     * 作者：jyd
     * 链接：https://leetcode-cn.com/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof/solution/mian-shi-ti-31-zhan-de-ya-ru-dan-chu-xu-lie-mo-n-2/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param pushed push stack
     * @param popped pop stack
     * @return Boolean
     */
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (int num : pushed) {
            stack.push(num);
            while (!stack.empty() && stack.peek() == popped[i]) {
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }
}
