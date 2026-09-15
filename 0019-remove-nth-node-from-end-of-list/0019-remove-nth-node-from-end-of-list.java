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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int size = 0;

        ListNode temp = head;

        // Find size
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        // Remove first node
        if (n == size) {
            head = head.next;
            return head;
        }

        // Find previous node
        int i = 1;
        int iToFind = size - n;

        ListNode prev = head;

        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        // Remove node
        prev.next = prev.next.next;

        return head;
    }
}