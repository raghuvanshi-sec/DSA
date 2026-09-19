package Linear_Structure.LInkedList;

import Linear_Structure.LInkedList.DoublyLL.Node;

public class reverseDLL {
    
    public void reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }

        DoublyLL.tail = DoublyLL.head;
        DoublyLL.head = prev;
    }

    
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();

        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);

        dll.print();
        reverseDLL r = new reverseDLL();
        r.reverse(DoublyLL.head);    
        dll.print();
    }
}
