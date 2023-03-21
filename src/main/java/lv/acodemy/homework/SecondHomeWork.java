package lv.acodemy.homework;

public class SecondHomeWork {

    public static void main(String[] args) {

        // 1 Task:
        //1. Create String array that will contain 10 European countries and include "Latvia" in this array
        //1.1 Iterate through array and print all values
        String[] euCountries = {"Latvia", "Lithuania", "Estonia", "Poland", "Germany", "France", "Italy", "Spain", "Romania", "Greece"};
        for (String euCountry : euCountries) {
            System.out.println(euCountry);
        }

        //1.2 Iterate through array and add following logic: IF "Latvia" exist in the array print: "Latvia is my motherland"

        for (String euCountry : euCountries) {
            if (euCountry.equals("Latvia")) {
                System.out.println("Latvia is my motherland");
            }

        }


        //2 Task:
        //2. You have following sentence: "Sometimes it pays to stay in bed on Monday, rather than spending the rest of the week debugging Monday’s code.”
        //2.1 Put each word into a String array.
        String[] sentence = {"Sometimes", "it", "pays", "to", "stay", "in", "bed", "on", "Monday", "rather", "than", "spending", "the", "rest", "of", "the", "week", "debugging", "Monday’s", "code"};

        //2.1 Using Iteration (Loops) print all values from array so as the result will be printed sentence (one line)
        System.out.println();
        for (String s : sentence) {
            System.out.print(s + "  ");
        }

        System.out.println("\n"); // to add to next line

        //Task 3
        // Write a Java program that takes the user's salary as an argument (double)
        //and checks if their salary is less than or equal to 5000, between 5000 and 10000, or greater than 10000.
        // If their salary is less than or equal to 5000, print "Your salary is low."
        // If their salary is between 5000 and 10000, print "Your salary is average."
        // If their salary is greater than 10000, print "Your salary is high."

        double userSalary = 6000; // should show statements - "Your salary is average"

        if (userSalary <= 5000) {
            System.out.println("Your salary is low.");
        } else if (userSalary > 5000 && userSalary<=1000) {
            System.out.println("Your salary is average.");
        } else {
            System.out.println("Your salary is high."); // >1000

        }

        System.out.println("\n"); // to add to next line


        // Task 4
        // Write a Java program that takes a number as an argument (integer)
        // and checks if the number is positive, negative or zero.
        // If the number is positive, print "The number is positive."
        // If the number is negative, print "The number is negative."
        // If the number is zero, print "The number is zero."

        int number = -3;

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");

        }
    }
}
