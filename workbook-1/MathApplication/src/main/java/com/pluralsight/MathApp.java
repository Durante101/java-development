package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1:
// declare variables here
        int bobSalary = 50000;
        int garySalary = 100000;
        int carPrice = 400;
        int truckPrice = 500;
        double pie = Math.PI;
        double radiusSquared = Math.sqrt(7.25);
// then code solution
        int hightestSalary = Math.max(bobSalary, garySalary);
        int lowestSalary = Math.max(bobSalary, garySalary);
        double areaCircle = pie * radiusSquared;
// then use System.out.println() to display results
// ex: System.out.println("The answer is " + answer);
        System.out.println("The highest out put is " + hightestSalary);
        System.out.println( "area of a circle " + areaCircle);

    }
}
