package com.algorithm.hashtable_hashmap;

import com.algorithm.Print;

import java.util.HashMap;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<Double,String> hashMap = new HashMap<>();

        hashMap.put(1.0, "Cupcake");
        hashMap.put(1.1, "Donut");
        hashMap.put(1.2, "Eclair");
        hashMap.put(2.0, "Gingerbread");

        new Print().show(hashMap.get(1.0));
        new Print().show(hashMap.size());
        hashMap.put(3.0, "Honeycomb");

        hashMap.remove(3.0);
        hashMap.replace(2.0, "Gingerbread", "Honeycomb");

        if(hashMap.containsValue("Honeycomb") && hashMap.containsKey(2.0)){
            new Print().show("Found");
        }else{
            new Print().show("Not Found");
        }

        /*for(int i=0; i<= hashMap.size();i++){
            new Print().show(hashMap.get(i));
        }*/

        for(double androidVersion: hashMap.keySet()){
            new Print().show(androidVersion + " " + hashMap.get(androidVersion));
        }

    }
}
