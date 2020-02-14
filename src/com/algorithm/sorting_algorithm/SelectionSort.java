package com.algorithm.sorting_algorithm;

import com.algorithm.Print;

public class SelectionSort {
    public static void main(String[] args) {

        SelectionSort ob = new SelectionSort();
        int[] arr = {64,25,12,22,11};
        ob.sort(arr);
        new Print().show("Sorted Array");
        ob.printArray(arr);
    }

    void sort(int[] arr){
        int n = arr.length;
        //one by one move boundary of unsorted subarray
        for(int i = 0; i < n-1; i++){
            //Find the minimum element in unsorted array
            int min_idx = i;
            for(int j = i+1; j < n;j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            //Swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    //Prints the array
    void printArray(int[] arr){
        int n = arr.length;
        for (int i=0; i < n; ++i){
            System.out.print(arr[i]+" ");
        }
        new Print().show();
    }
}
