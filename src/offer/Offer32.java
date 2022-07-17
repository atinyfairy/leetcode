package offer;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author 周意朗
 * Date: 2021/1/9
 * @since JDK 11
 * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
 */

public class Offer32 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue =new LinkedList<>();
        return null;
    }
}
