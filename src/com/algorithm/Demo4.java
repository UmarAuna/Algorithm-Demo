package com.algorithm;

import java.util.ArrayList;

public class Demo4 {
    public static void main (String[] args){
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
