package offer;

import utils.TreeNode;

/**
 * @author 周意朗
 * Date: 2021/5/3
 * @since JDK 11
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 * https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-zui-jin-gong-gong-zu-xian-lcof/solution/mian-shi-ti-68-i-er-cha-sou-suo-shu-de-zui-jin-g-7/
 */
public class Offer68_1 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (root.val < p.val && root.val < q.val) {
                root = root.right;
            } else if (root.val > p.val && root.val > q.val) {
                root = root.right;
            } else {
                break;
            }
        }
        return root;
    }

}
