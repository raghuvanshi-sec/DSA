package Greedy_Algorithm;

import java.util.*;

public class ActivitySelection {
    

    public static void main(String args[]){
        int start[] = {10, 12, 20};
        int end[] = {20, 25, 30};

        
        //greedy choice
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st activity is always perform
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];

        for(int i=1; i<end.length; i++){
            if(start[i] >= lastEnd){
                //activity select
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        
        //print
        System.out.println("Maximum activities = "+maxAct);
        System.out.print("Selected activities are = ");
        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ ans.get(i) + " ");
        }
        System.out.println();
    }
}
