package com.pluralsight.streams;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        System.out.println("Enter first name or last name");

        people.add(new Person("John", "Doe", 25));
        people.add(new Person("Jane", "Smith", 32));
        people.add(new Person("Emily", "Johnson", 18));
        people.add(new Person("Michael", "Williams", 45));
        people.add(new Person("Sarah", "Brown", 27));
        people.add(new Person("Daniel", "Jones", 60));
        people.add(new Person("Emma", "Garcia", 21));
        people.add(new Person("David", "Martinez", 38));
        people.add(new Person("Olivia", "Lee", 50));
        people.add(new Person("James", "Clark", 29));

    }
}
