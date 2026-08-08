package Recursion;

public class FirstOccurence {
    public static int firstOccur(int arr[] , int key , int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return firstOccur(arr, key, i+1);
    }

    public static void main(String args []){
        int arr[] = {2,5,9,6,8,3,7};
        System.out.println(firstOccur(arr, 6, 0));
    }
}
