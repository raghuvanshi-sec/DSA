package Linear_Structure.LInkedList;

import Linear_Structure.LInkedList.LinkedList.Node;

public class CheckLLisPalindrome {

    public Node findMid(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public boolean isPalindrome(Node head) {

        if (head == null || head.next == null) {
            return true;
        }

        // Step 1 - find mid
        Node midNode = findMid(head);

        // Step 2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        // Step 3 - compare
        while (right != null) {

            if (left.data != right.data) {
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);

        CheckLLisPalindrome check = new CheckLLisPalindrome();

        System.out.println(check.isPalindrome(ll.head));
    }
}