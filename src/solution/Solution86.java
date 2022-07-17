package solution;

/**
 * @author 周意朗
 * Date: 2021/1/6
 * @since JDK 11
 * 给你一个链表和一个特定值 x ，请你对链表进行分隔，使得所有小于 x 的节点都出现在大于或等于 x 的节点之前。
 * <p>
 * 你应当保留两个分区中每个节点的初始相对位置。
 * <p>
 * 示例：
 * <p>
 * 输入：head = 1->4->3->2->5->2, x = 3
 * 输出：1->2->2->4->3->5
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/partition-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution86 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode partition(ListNode head, int x) {
        ListNode listLess = new ListNode(0);
        ListNode listMore = new ListNode(0);
        ListNode iteratorLess = listLess;
        ListNode iteratorMore = listMore;
        while (head != null) {
            if (head.val < x) {
                iteratorLess.next = head;
                head = head.next;
                iteratorLess = iteratorLess.next;
                iteratorLess.next = null;
            } else {
                iteratorMore.next = head;
                head = head.next;
                iteratorMore = iteratorMore.next;
                iteratorMore.next = null;
            }
        }
        iteratorLess.next = listMore.next;
        return listLess.next;
    }

    public static void show(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(9);
        listNode.next = new ListNode(8);
        listNode.next.next = new ListNode(7);
        listNode.next.next.next = new ListNode(6);
        listNode.next.next.next.next = new ListNode(5);
        show(listNode);
        System.out.println("====");
        ListNode partition = partition(listNode, 7);
        show(partition);

    }

}
