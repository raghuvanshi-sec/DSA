package Sorting;

import java.util.Arrays;

public class InsertionSort {
    
    public static void InsertionSort(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int prev = i - 1;
            // find out the position to insert
            while(prev >= 0 && arr[prev] > key){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = key;
        }
    }

    public static void printArr(int arr[]){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){ 
        int arr[] = {5,4,1,3,2};
        //InsertionSort(arr);
        Arrays.sort(arr);
        printArr(arr);
    }
}
