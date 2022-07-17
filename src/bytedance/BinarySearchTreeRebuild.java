package bytedance;

import java.util.ArrayList;

/**
 * @author 周意朗
 * Date: 2020/12/26
 * @since JDK 11
 * 根据一个二叉查找树重构一个二叉树
 */

@SuppressWarnings("all")
public class BinarySearchTreeRebuild {

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public static Node posArrayToBinarySearchTree(int[] posArr) {
        return process(posArr, 0, posArr.length - 1);
    }

    public static Node process(int[] posArr, int L, int R) {
        if (L > R) {
            return null;
        }
        Node head = new Node(posArr[R]);
        if (L == R) {
            return head;
        }

        int M = L - 1;
        int left = L;
        int right = R - 1;

        while (left <= right) {
            //mid = (left+right)/2  >>  位运算,防止溢出
            int mid = left + ((right - left) >> 1);
            if (posArr[mid] < posArr[R]) {
                M = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        head.left = process(posArr, L, M);
        head.right = process(posArr, M + 1, R - 1);
        return head;
    }

    public static int[] getBstPosArray(Node head) {
        ArrayList<Integer> posList = new ArrayList<>();
        pos(head, posList);
        int[] ans = new int[posList.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = posList.get(i);
        }
        return ans;
    }

    public static void pos(Node head, ArrayList<Integer> posList) {
        if (head != null) {
            pos(head.left, posList);
            pos(head.right, posList);
            posList.add(head.value);
        }
    }

    /**
     * test function
     *
     * @param min posArr中最小的数
     * @param max 大于min的一个数
     * @return 返回完整的二叉树头节点
     */
    public static Node generateRandomBST(int min, int max, int N) {
        if (min > max) {
            return null;
        }
        return createTree(min, max, 1, N);
    }

    /**
     * @param min   posArr中最小的数
     * @param max   大于min的一个数
     * @param level 层数
     * @param N     最大层数,大于就直接返回
     * @return 构造的二叉树头节点
     */
    public static Node createTree(int min, int max, int level, int N) {
        if (min > max || level > N) {
            return null;
        }
        Node head = new Node(random(min, max));
        head.left = createTree(min, head.value - 1, level + 1, N);
        head.right = createTree(head.value, max, level + 1, N);
        return head;
    }

    public static int random(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }

    public static boolean isSameValueStructure(Node head1, Node head2) {
        if (null == head1 && null != head2) {
            return false;
        }
        if (null != head1 && null == head2) {
            return false;
        }
        if (null == head1 && null == head2) {
            return true;
        }
        return head1.value == head2.value && isSameValueStructure(head1.left, head2.left) && isSameValueStructure(head1.right, head2.right);
    }

    public static void printTree(Node head) {
        System.out.println("Binary Tree");

    }

    public static void printInOrder(Node head, int height, String to, int len) {
        if (null == head) {
            return;
        }
        printInOrder(head.right, height + 1, "v", len);
        String val = to + head.value + to;
        int lenM = val.length();
        int lenL = (len - lenM) / 2;
        int lenR = len - lenM - lenL;
        val = getSpace(lenL) + val + getSpace(lenR);
        System.out.println(getSpace(height * len) + val);
        printInOrder(head.left, height + 1, "^", len);
    }

    public static String getSpace(int num) {
        String space = "";
//        StringBuffer buffer = new StringBuffer("");
//        for (int i = 0; i < num; i++) {
//            buffer.append(space);
//        }
        //return buffer.toString():
        //我也不知道idea直接给我精简到一行了,草
        return "" + space.repeat(Math.max(0, num));
    }

    public static void main(String[] args) {
        int min = 0;
        int max = 12;
        int level = 4;
        Node head = generateRandomBST(min, max, level);
        int[] pos = getBstPosArray(head);
//        不print,因为看不懂print出来的图
//        printTree(head);
//        printTree(posArrayToBinarySearchTree(pos));
//        System.out.println(isSameValueStructure(head, posArrayToBinarySearchTree(pos)));

        int testTime = 5000000;;
        System.out.println("test begin times: " + testTime);
        for (int i = 0; i < testTime; i++) {
            head = generateRandomBST(min, max, level);
            pos = getBstPosArray(head);
            if (!isSameValueStructure(head, posArrayToBinarySearchTree(pos))) {
                System.out.println("Oops");
            }
        }
        System.out.println("test finish");
    }

}
