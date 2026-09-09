package Linear_Structure.ArrayList;

import java.util.ArrayList;

public class SwapTwoNumbers {
    public static void swap(ArrayList<Integer> list, int index1, int index2){
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(3);
        System.out.println("Before swap: " + list);
        swap(list, 1, 3);
        System.out.println("After swap: " + list);
    }
}
