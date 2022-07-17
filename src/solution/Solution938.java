package solution;

/**
 * @author 周意朗
 * Date: 2020/12/29
 * @since JDK 11
 */
public class Solution938 {

    private static int sum = 0;

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

//    public static int rangeSumBST(TreeNode root, int low, int high) {
//        if (root == null) {
//            return 0;
//        }
//        if (root.val >= low && root.val <= high) {
//            return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
//        }
//        if (root.val > high) {
//            return rangeSumBST(root.left, low, high);
//        } else {
//            return rangeSumBST(root.right, low, high);
//        }
//    }

    public static int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        if (root.val >= low && root.val <= high) {
            return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        }
        if (root.val > high) {
            return rangeSumBST(root.left, low, high);
        } else {
            return rangeSumBST(root.right, low, high);
        }
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(10);
        t1.left = new TreeNode(5);
        t1.right = new TreeNode(15);
        t1.left.left = new TreeNode(3);
        t1.left.right = new TreeNode(7);
        t1.right.left = new TreeNode(13);
        t1.right.right = new TreeNode(18);
        t1.right.right.left = new TreeNode(1);
        t1.right.left.left = new TreeNode(6);

        int i = rangeSumBST(t1, 6, 10);
        System.out.println("result " + i);
    }
}
