

public void deleteNthfromEnd(int n){
    int size = 0;
    Node temp = head;
    while(temp = head){
        temp = temp.next;
        size++;
    }

    if(n == size){
        head = head.next;
        return;
    }

    int i = 1;
    int iToFind = size-n;
    Node prev = head;
    while(i < iToFind){
        prev = prev.next;
        i++;
    }

    prev.next = prev.next.next;
    return;
}

public static void main(String[] args){
    ll.addFirst(2);
    ll.addFirst(1);
    ll.addLast(3);
    ll.addLast(4);

    deleteNthfromEnd(2);
    ll.print();
}
