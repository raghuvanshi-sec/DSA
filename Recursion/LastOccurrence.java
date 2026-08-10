package Recursion;

public class LastOccurrence {
    public static int lastOccurr(int arr[], int key , int i){
        if(i == arr.length){
            return -1;
        }

        int isFound = lastOccurr(arr, key, i+1);
        
        if(isFound != -1){
            return isFound;
        }

        if(arr[i] == key){
            return i;
        }

        return isFound;
    }

    public static void main(String args[]){
        int arr[] = {2,4,7,5,3,3,3,7,5,2};
        System.out.println(lastOccurr(arr, 5, 0));
    }
}
