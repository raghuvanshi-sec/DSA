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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        

        //edge case
        if(head == null || left == right){
            return head;
        }

        // dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // move prev to the node before left
        ListNode prev = dummy;

        for(int i=1; i< left; i++){
            prev = prev.next;
        }

        // curr is the first node to be reversed
        ListNode curr = prev.next;

        // reverse the sublist
        for(int i = 0; i< right- left; i++){
            ListNode next = curr.next;

            //Remove next from its current position
            curr.next = next.next;

            //put next before curr
            next.next = prev.next;

            // connect prev to next
            prev.next = next;
        }

        return dummy.next;
    }
}