package Linear_Structure.LInkedList;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    public void addFirst(int data){
        //step1 - create new node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step2 - newNode next = head
        newNode.next = head; //link

        //step3 - head = newNode
        head = newNode; //update
    }

    public void addLast(int data){
        //step1 - create new node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step2 - tail next = newNode
        tail.next = newNode;

        //step3 - tail = newNode
        tail = newNode;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
    }
}
