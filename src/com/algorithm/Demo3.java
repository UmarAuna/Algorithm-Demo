package com.algorithm;

import java.util.Scanner;

public class Demo3 {
    public static void main(String []args) {
        int num;
        Scanner guduma = new Scanner(System.in);

        new Print().show("Enter any number to print");
        num = guduma.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
               new Print().show("FUZZBUZZ");
            } else if (i % 3 == 0) {
                new Print().show("FUZZ");
            } else if (i % 5 == 0) {
                new Print().show("BUZZ");
            } else {
                new Print().show(i);
            }

        }
    }

}
