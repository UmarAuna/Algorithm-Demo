package com.algorithm.linearsearch;

public class LinearSearchDemo1 {
    public static void main(String []args){
        String[] arr = { "Umar", "Bangis", "Yazid", "Zango", "Samiu" };
        String x = "Yazid";

        int result = SearchLinearDemo1.searchLinear(arr, x);
        if(result == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Element is present at index " + result);
    }

}

class SearchLinearDemo1 {
    public static int searchLinear(String[] arr ,String x ) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i].equals(x))
                return i;
        }
        return -1;
    }
}
