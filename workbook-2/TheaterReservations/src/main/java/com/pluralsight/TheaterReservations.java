package com.pluralsight;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class TheaterReservations {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter first name");
        String firstName = myScanner.nextLine();

        System.out.println("Enter last name");
        String lastName = myScanner.nextLine();


        String date = "2025-04-17";

        LocalDate reservationDate = LocalDate.parse(date);
        System.out.println(reservationDate);

        System.out.println("Enter a date for reservation (MM/DD/YYYY)");
        String reservationDate

    }
}
