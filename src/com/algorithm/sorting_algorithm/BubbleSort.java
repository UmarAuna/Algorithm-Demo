package com.algorithm.sorting_algorithm;

import com.algorithm.Print;

public class BubbleSort {
    public static void main(String[] args) {

        BubbleSort ob =  new BubbleSort();
        int[] arr = {64,34,25,12,22,11,90};
        ob.bubbleSort(arr);
        new Print().show("Sorted Array");
        ob.printArray(arr);

    }

    void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n-1; i++){
            for(int j = 0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    //swap arr[j+1] and ar[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //Prints the Array
    void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            new Print().show(arr[i] + " ");
        }
        new Print().show();
    }

}
