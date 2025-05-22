package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        ArrayList<com.pluralsight.streams.Person> people = new ArrayList<>();

        people.add(new com.pluralsight.streams.Person("John", "Doe", 25));
        people.add(new com.pluralsight.streams.Person("Jane", "Smith", 32));
        people.add(new com.pluralsight.streams.Person("Emily", "Johnson", 18));
        people.add(new com.pluralsight.streams.Person("Michael", "Williams", 45));
        people.add(new com.pluralsight.streams.Person("Sarah", "Brown", 27));
        people.add(new com.pluralsight.streams.Person("Daniel", "Jones", 60));
        people.add(new com.pluralsight.streams.Person("Emma", "Garcia", 21));
        people.add(new com.pluralsight.streams.Person("David", "Martinez", 38));
        people.add(new com.pluralsight.streams.Person("Olivia", "Lee", 50));
        people.add(new com.pluralsight.streams.Person("James", "Clark", 29));

        System.out.println("Enter first name or last name");
        Scanner scanner = null;
        String name = scanner.nextLine().toLowerCase();

        List<String> results = people.stream()
                .filter(people -> people.contains())


    }
}
