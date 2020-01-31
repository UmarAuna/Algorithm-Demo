package com.algorithm;

import static java.lang.Thread.sleep;

public class Demo2 {
    public static void main(String[] args) throws InterruptedException {
        for(int i = 1111; i<=9999;i++){
            Thread.sleep(120);
            if(i ==1130){
                new Print().show("found it");
            }else{
                new Print().show(i);
            }
        }
    }
}
