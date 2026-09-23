package Linear_Structure.Queue;

import java.util.*;

public class stackUsingDeque {
    

    static class Queue{
        Deque<Integer> dq = new LinkedList<>();

        public void add(int data){
            dq.addLast(data);
        }

        public int remove(){
            return dq.removeLast();
        }

        public int peek(){
            return dq.getLast();
        }

		public boolean isEmpty() {
			return dq.isEmpty();
		}
    }

    public static void main(String args[]){
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("peek = " + q.peek());
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
