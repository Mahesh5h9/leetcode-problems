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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;

        while (curr != null) {
            int sum = 0;
            ListNode next = curr.next;
            while (next != null) {
                sum += next.val;
                if (sum == 0) {
                    curr.next = next.next;
                }
                next = next.next;
            }
            curr = curr.next;
        }

        return dummy.next;
    }
}