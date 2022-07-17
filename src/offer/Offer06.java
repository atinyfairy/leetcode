package offer;

/**
 * @author 周意朗
 * Date: 2021/3/24
 * @since JDK 11
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * 示例 1：
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 */

import utils.ListNode;
import org.junit.Test;

import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Offer06 {
    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[0];
        }
        Stack<Integer> stack = new Stack<>();
        while (true) {
            System.out.println("head-->"+head.val);
            stack.push(head.val);
            if (head.next == null) {
                break;
            } else {
                head = head.next;
            }
        }
        int[] result = new int[stack.size()];
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            result[i] = stack.pop();
            System.out.println("result-->"+result[i]);
        }
        return result;
    }

    @Test
    public void test() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(3);
        listNode.next.next = new ListNode(2);
        ListNode one = new ListNode(1);
        int[] ints = reversePrint(listNode);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
