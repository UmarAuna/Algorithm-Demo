package com.algorithm;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args){
        int height;
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter any number");
        height = enter.nextInt();


        draw(height);

        int number = 4;
        int[] list = new int[number];
        list[0] = 1;
        list[1] = 2;
        list[2] = 3;
        list[3] = 4;

        for (int i=0; i<4; i++){
            System.out.println(list[i]);
        }

    }

      static void draw(int h){
        for (int i=1; i<=h; i++){
            System.out.println();
            for(int j = 1; j<=i; j++)
            System.out.print("#");
        }
          System.out.println();
    }
}
