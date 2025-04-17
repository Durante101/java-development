package com.pluralsight;

import java.util.Scanner;

public class FullNameGenerator {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter first name.");
        String firstName = myScanner.nextLine().tim;

        System.out.println("Enter middle initial.");
        char middleInitial = myScanner.next().charAt(0);
        myScanner.nextLine();

        System.out.println("Enter last name.");
        String lastName = myScanner.nextLine();

        System.out.println("Enter Suffix name.");
        String suffix = myScanner.nextLine();

        if (suffix.isEmpty()){

        }

        System.out.println( firstName + " " + middleInitial + " " + lastName + " " + suffix);








    }
}
