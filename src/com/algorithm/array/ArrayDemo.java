package com.algorithm.array;

import com.algorithm.Print;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayDemo {
    public static void main (String[] args){

        //Array
        Scanner guduma = new Scanner(System.in);

        new Print().show("Enter any number");
        int array = guduma.nextInt();

        for(int i=1; i<=12; i++){
            new Print().show(array + " * " + i + " = " +array * i);
        }
        //ArrayList

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Cupcake");
        arrayList.add("Donut");
        arrayList.add("Eclair");
        arrayList.add("Gingerbread");

        if(arrayList.contains("Gingerbread")){
            new Print().show("found");
        }else{
            new Print().show("not found");
        }

        new Print().show(arrayList.get(0));
        arrayList.add(3,"Honeycomb");
        arrayList.remove(3);
        
        /*for(int j = 0; j< arrayList.size(); j++){
            new Print().show(arrayList.get(j));
        }*/

        for (String i : arrayList) {
            new Print().show(i);
        }
    }
}
