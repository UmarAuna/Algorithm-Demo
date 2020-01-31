package com.algorithm;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.Stack;

import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Demo6 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(bufferedReader.readLine().trim());
            arr.add(arrItem);
        }

        int result = Result.getMinimumUniqueSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

    }
}

class Result {

    /*
     * Complete the 'getMinimumUniqueSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static int getMinimumUniqueSum(List<Integer> arr) {
        // Write your code here
        int sum = 0, val = 0;
        ArrayList<Integer> arrayList = new ArrayList<Integer>(arr.size());
        arrayList.add(arr.get(0));
        for(int i=1; i< arr.size(); i++){
            val = arr.get(i);
            while (arrayList.contains(val)){
                val++;
            }
            arrayList.add(val);
        }
        for(int i = 0; i< arrayList.size();i++){
            sum = sum + arrayList.get(i);
        }

        return sum;


    }

}


