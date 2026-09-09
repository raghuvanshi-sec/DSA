package Linear_Structure.ArrayList;


import java.util.*;

public class Sorting {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(2);
        list.add(8);
        list.add(4);
        list.add(7);
        
        System.out.println("Before Sorting: " + list);
        Collections.sort(list);
        System.out.println("After Sorting: " + list);

        //descending
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("After reverse Sorting: " + list);
    }

}
