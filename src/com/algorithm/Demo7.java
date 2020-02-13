package com.algorithm;

import java.util.Scanner;

public class Demo7 {
    private static double addTax(double price, double tax){
        double result;

        return result =price*(1+ tax/100);

    }
    public static void main(String[] args) {
        double price;
        double tax;
        char option;
        Scanner guduma = new Scanner(System.in);
        do{
            System.out.print("Enter Price: ");
            price=guduma.nextDouble();

            System.out.print("Enter Tax: ");
            tax=guduma.nextDouble();
            //price=price*(1+tax/100);
            System.out.println("**** Balance Details ****");
            System.out.println("Balance is: "+ addTax(price,tax));
            System.out.println();

            System.out.print("Do you want to try Again y/n");
            option=guduma.next().charAt(0);

        }while(option=='y' || option=='Y');
        System.out.println("Thank You");
    }


}
