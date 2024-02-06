/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        int length = getLength(head);
        while (length >= k) {
            current = reverseNextKNodes(current, k);
            length -= k;
        }
        return dummy.next;
    }

    private int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    private ListNode reverseNextKNodes(ListNode start, int k) {
        ListNode prev = start.next;
        ListNode curr = prev.next;
        for (int i = 1; i < k; i++) {
            prev.next = curr.next;
            curr.next = start.next;
            start.next = curr;
            curr = prev.next;
        }
        return prev;
    }
}