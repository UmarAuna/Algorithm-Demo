package com.algorithm.hashtable_hashmap;

import com.algorithm.Print;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Double,String> hashtable = new Hashtable<>();


        hashtable.put(1.0, "Cupcake");
        hashtable.put(1.1, "Donut");
        hashtable.put(1.2, "Eclair");
        hashtable.put(2.0, "Gingerbread");

        new Print().show(hashtable.get(1.0));
        new Print().show(hashtable.size());
        hashtable.put(3.0, "Honeycomb");

        hashtable.remove(3.0);
        hashtable.replace(2.0, "Gingerbread", "Honeycomb");

        if(hashtable.containsValue("Honeycomb") && hashtable.containsKey(2.0)){
            new Print().show("Found");
        }else{
            new Print().show("Not Found");
        }

        /*for(int i=0; i<= hashMap.size();i++){
            new Print().show(hashMap.get(i));
        }*/

        for(double androidVersion: hashtable.keySet()){
            new Print().show(androidVersion + " " + hashtable.get(androidVersion));
        }

    }
}
