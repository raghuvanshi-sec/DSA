package Linear_Structure.Queue;

import java.util.*;

public class DequqExample {
    
    public static void main(String args[]){
        Deque<Integer> dq = new LinkedList<>();

        dq.addLast(1);
        dq.addLast(2);
        dq.addFirst(0);
        dq.addLast(4);

        System.out.println(dq);

        dq.removeLast();
        System.out.println(dq);
        
    }
}
