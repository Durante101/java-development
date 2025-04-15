package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        double regularSandwich = 5.45;
        double largeSandwich = 8.95;
        int studentAge = 0;
        int seniorAge = 0;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Would you like to eat a large sandwich or a regular sandwich?");
        String sandwich = myScanner.nextLine();

        if (sandwich.equals("regular")) {
            System.out.println("The price of the regular sandwich is " + regularSandwich);
            if (age <= 17) {
                discount = sandwich * 0.10;
                System.out.println("Congratulations You get a 10% discount " + largeSandwich);
            }
        }

        if (sandwich.equals("large")) {
            System.out.println("The price of the large sandwich is " + largeSandwich);
        }

        System.out.println("How old are you?");
        int age = myScanner.nextLine();

        if (age <= 17) {
            discount = sandwich * 0.10;
            System.out.println("Congratulations You get a 10% discount " + largeSandwich);
        }



    }
}



