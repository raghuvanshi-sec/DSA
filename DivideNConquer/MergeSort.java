package DivideNConquer;

import java.util.Arrays;

public class MergeSort {
    public static void MergeSort(int arr[], int si, int ei){ 

        if(si >= ei) return; 

        int mid = si + (ei - si) / 2;
        MergeSort(arr, si, mid);
        MergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei); 
    }

    public static void merge(int arr[], int si, int mid, int ei){ 
        //left(0,mid) right(mid+1,ei)
        int temp[] = new int[ei - si + 1];
        int i = si;      // iterator for left part
        int j = mid + 1; // Fix #4: was mid-1, right part starts at mid+1
        int k = 0;       // iterator for temp arr

        while(i <= mid && j <= ei){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++; k++;
            } else {
                temp[k] = arr[j];
                j++; k++; // Fix #5: k++ moved inside else (was double-incrementing outside)
            }
        }

        // left part remaining
        while(i <= mid){
            temp[k++] = arr[i++]; // Fix #5: was arr[j+1] and i was never incremented
        }

        // right part remaining
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        // copy temp to original arr
        for(k = 0, i = si; k < temp.length; k++, i++){ // Fix #6: comma -> semicolon after i=si
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]){
        int arr[] = {6, 3, 9, 5, 2, 8};
        MergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr)); // Fix #7: printArr(arr[]) is invalid
    }
}
