package solution;

/**
 * @author 周意朗
 * Date: 2020/12/26
 * @since JDK 11
 * 给定一个非空二叉树，返回其最大路径和。
 * <p>
 * 本题中，路径被定义为一条从树中任意节点出发，沿父节点-子节点连接，达到任意节点的序列。该路径至少包含一个节点，且不一定经过根节点。
 */
public class Solution124 {

    private int ret = Integer.MIN_VALUE;

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * 对于任意一个节点, 如果最大和路径包含该节点, 那么只可能是两种情况:
     * 1. 其左右子树中所构成的和路径值较大的那个加上该节点的值后向父节点回溯构成最大路径
     * 2. 左右子树都在最大路径中, 加上该节点的值构成了最终的最大路径
     *
     * @param root 父节点
     * @return 得到的最大值
     */
    public int maxPathSum(TreeNode root) {
        getMax(root);
        return ret;
    }

    private int getMax(TreeNode r) {
        if (r == null) {
            return 0;
        }
        // 如果子树路径和为负则应当置0表示最大路径不包含子树
        //这是求子路径的表达式
        int left = Math.max(0, getMax(r.left));
        int right = Math.max(0, getMax(r.right));
        // 判断在该节点包含左右子树的路径和是否大于当前最大路径和
        //left,right如果小于0在上面的表达式就会被变成0,不影响
        ret = Math.max(ret, r.val + left + right);
        if (ret < 0) {
            ret = 0;
        }
        return Math.max(left, right) + r.val;
    }

    public static void main(String[] args) {
        Solution124 s = new Solution124();

    }
}