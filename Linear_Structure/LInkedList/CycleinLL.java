package Linear_Structure.LInkedList;

import Linear_Structure.LInkedList.LinkedList.Node;

public class CycleinLL {

    public static boolean isCycle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;          // +1
            fast = fast.next.next;     // +2

            if (slow == fast) {
                return true;           // cycle exists
            }
        }

        return false;                  // cycle not present
    }

    public static void main(String args[]) {

        LinkedList ll = new LinkedList();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);

        Node head = ll.head;

        // Create cycle: 4 -> 2
        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = head.next;

        System.out.println(isCycle(head));
    }
}