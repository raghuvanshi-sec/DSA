package Linear_Structure.LInkedList;

import Linear_Structure.LInkedList.LinkedList.Node;


public class removeCycleinLL {
    
    public static void removeCycle(Node head){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }

        slow = head;
        Node prev = null;

        // Special case: Cycle starts at head (tail points back to head)
        if (slow == fast) {
            while (fast.next != head) {
                fast = fast.next;
            }
            fast.next = null;
            return;
        }

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }

    public static void main(String args[]){
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

        removeCycle(head);
        System.out.println(isCycle(head));
    }

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
}
