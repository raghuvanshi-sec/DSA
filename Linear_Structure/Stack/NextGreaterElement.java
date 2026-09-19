package Linear_Structure.Stack;

import java.util.*;

public class NextGreaterElement {
    
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        int arr[] = {6,8,0,1,3};
        int nxtGreater[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtGreater[i] = -1;
            }else{
                nxtGreater[i] = arr[s.peek()];
            }
            s.push(i); 
        }
        for(int i=0; i<nxtGreater.length; i++){
            System.out.print(nxtGreater[i]+ " ");
        }
        System.out.println();

        //greatest in left
        //for(int i=0; i<n; i++)

        //next smallest in right
        //while(!s.isEmpty() && arr[s.peek()] >= arr[i])

        //next smallest left
        //for(int i=0; i<n; i++)
        //while(!s.isEmpty() && arr[s.peek()] >= arr[i])
        //
    }
}
