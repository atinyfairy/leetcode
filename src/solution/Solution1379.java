package solution;

/**
 * @author 周意朗
 * Date: 2020/12/29
 * @since JDK 11
 * 给你两棵二叉树，原始树 original 和克隆树 cloned，以及一个位于原始树 original中的目标节点target。
 * 其中，克隆树 cloned是原始树 original的一个 副本 。
 * 请找出在树cloned中，与target相同的节点，并返回对该节点的引用（在 C/C++ 等有指针的语言中返回 节点指针，其他语言返回节点本身）。
 * 注意：
 * 你 不能 对两棵二叉树，以及 target节点进行更改。
 * 只能 返回对克隆树cloned中已有的节点的引用。
 * 进阶：如果树中允许出现值相同的节点，你将如何解答？
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution1379 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null || target == null) {
            return null;
        }

        //target是original中的一个节点, 所以用cloned去比较,都是错的, 草(一种植物
        if (original == target) {
            return cloned;
        }
        TreeNode left = getTargetCopy(original.left, cloned.left, target);
        if (left != null) {
            return left;
        }
        return getTargetCopy(original.right, cloned.right, target);
    }


}
