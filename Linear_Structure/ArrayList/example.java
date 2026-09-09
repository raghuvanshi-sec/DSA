package Linear_Structure.ArrayList;

import java.util.ArrayList;
public class example {
    
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        list.add(1,10);

        System.out.println(list);

        list.remove(0);

        System.out.println(list);
        
    }
}
