package lv.acodemy.classroom;

import java.util.Arrays;

public class VariablesDataTypes {
    public static void main(String[] args) {

        // byte data type
        byte myCurrentAge = 25;
        System.out.println(myCurrentAge);

        // short data type
        short salaryPerMonth = 1000;
        System.out.println(salaryPerMonth);

        // char short data type
        char firstNameLetter = 119; // "N"
        System.out.println(firstNameLetter);

        // int short data type
        int dateOfBirth = 60397;
        System.out.println(dateOfBirth);

        //long short data type
        long populationOfLatvia = 180000;
        System.out.println(populationOfLatvia);

        //float data type
        float lapTime = 32.30f;
        System.out.println(lapTime);

        // double data type
        double weight = 65.5;
        System.out.println(weight);

        // boolean is; has;
        boolean isWinter = false;
        boolean isSpring = true;
        System.out.println(isWinter);

        // String
        String name = "Inna";
        String surName = "Burko";

        //Concatenation
        String fullNamr = name + " " + surName;
        System.out.println(fullNamr);

        String fullNameWithAge = fullNamr + myCurrentAge;
        //System.out.println ("Inna Burko25");
        // Inna Burko25

        System.out.printf("My full name is: %s. I am %d years old. %n%n", fullNamr, myCurrentAge);
        System.out.printf("My full name is: %s. I am %d years old. \n", fullNamr, myCurrentAge);

        //*
        int a = 10;
        int b = 20;
        int c = a * b;
        System.out.println(c);
        System.out.println(10 * 20);
        System.out.println(a * b);
        System.out.println("20 * 10");

        // / division
        double result = (double) a / b;
        System.out.println(result);

        // %
        int number = 10 % 4;
        System.out.println(number);

        int []  numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));


    }
}
