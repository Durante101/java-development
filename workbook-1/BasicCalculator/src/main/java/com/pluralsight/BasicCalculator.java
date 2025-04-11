package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        //Name
        System.out.println("What is your name?");
        String name = myScanner.nextLine();

        //Hours
        System.out.println("How many hours have you worked");
        float hoursWorked = myScanner.nextFloat();

        //Pay Rate
        System.out.println("How many hours have you worked");
        float payRate = myScanner.nextFloat();

        //Calculate their gross pay
        float grossPay = hoursWorked * payRate;

        System.out.println();

    }



}



