package lv.acodemy.classroom;

public class IfElse {

    public static void main(String[] args) {

        //IF
        /*
        if (condition) {
        code to be executed
        }

         */

        boolean x = 5 > 2;
        System.out.println(x);

        if (x) {
            System.out.println("Yes, 5 is more than 2");
        }


        int number = 21;
        if (number % 2 == 0) {
            System.out.println("Number:" + number + " is even number");
        } else {
            System.out.println("Number:" + number + " is NOT even number");
        }

        int age = 18;
        if (age <= 17) {
            System.out.println("You are not allowed to buy here!");
        } else {
            System.out.println("Welcome to our shop!");
        }

        boolean isSummer = true;
        if (isSummer) {
            System.out.println("Summer months: June, July, August");
        }

        // IF-ELSE-IF-ELSE
        age = 18;
        if (age <= 0) {
            System.out.println("Age 0 or less is not allowed");
        } else if (age <= 17) {
            System.out.println("You are not allowed to buy here!");
        } else if (age > 18) {
            System.out.println("Welcome to our shop!");
        }


        String name = "Zina";
        if (name.equals("John")) {
            System.out.println("Hello John");
        } else if (name.equals("Zina")) {
            System.out.println("You are not welcome");
        } else {
            System.out.println("Very interesting name");
        }

        int currentMonth =5;
        if (currentMonth == 12 || currentMonth == 1 || currentMonth == 2) {
            System.out.println("This is winter");
        } else if (currentMonth == 3 || currentMonth == 4 || currentMonth == 5) {
            System.out.println("This is Spring");
        } else if (currentMonth == 6 || currentMonth == 7 || currentMonth == 8) {
            System.out.println("This is Summer");
        } else if (currentMonth == 9 || currentMonth == 10 || currentMonth == 11) {
            System.out.println("This is autumn");
        } else {
            throw new IllegalStateException("Unexpected value: " + currentMonth);
        }


        //IF student1="John" and student2="Max"
        //Print: they will work together
        // &&;

        String student1  = "John";
        String student2 = "Anna";
        if (student1.equals("John") || student2.equals("Max")){
            System.out.println("They will work together");
        }

        var myName = "Inna";
        var myAge = 10;
        System.out.println(myAge);




    }
    }


