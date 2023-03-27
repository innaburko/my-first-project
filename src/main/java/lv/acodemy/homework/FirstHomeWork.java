package lv.acodemy.homework;

public class FirstHomeWork {
    public static void main(String[] args) {

        // Create 2 variable for each data type (meaningful)

        // string data type
        String name = "Inna";
        String lastName = "Burko";
        String fullName = name + " " + lastName;
        System.out.println("Hi, I am" + " " + fullName + "!");

        String workPosition = "lending project manager";
        String placeOfWork = "Rietumu Banka";
        System.out.println("I am" + " " + workPosition + " " + "in" + " " + placeOfWork);

        // byte data type
        byte myCurrentAge = 26;
        System.out.println("I am " + myCurrentAge + " years old!");

        byte loanTerm = 10;
        System.out.println("Loan term is up to " + loanTerm + " years.");

        byte numClients = 15;

        // short data type

        short termInMonths = 1200;
        System.out.println("10 years is equal to " + termInMonths + " months.");

        short yearWhenStartedWorking = 2017;
        System.out.println("In " + yearWhenStartedWorking);

        // char data type
        char firstLetterOfName = 'I';
        System.out.println(firstLetterOfName);

        char firstLetterOfSurname = 66; // 'B'
        System.out.println(firstLetterOfSurname);

        // int data type
        int loanOutstanding = 2225000;
        System.out.println(loanOutstanding + " EUR");

        int loanAmount = 500000;
        System.out.println("Minimum loan amount from " + loanAmount + " euro");

        //long data type
        long numberOfMarksInCollection = 2147483645;
        System.out.println(numberOfMarksInCollection);

        long spedOfLight = 299792458;
        System.out.println(spedOfLight + " metres per second");


        //float data type
        float interestRate = 5.5f;
        System.out.println(interestRate + "%");

        float euribor3M = 2.9f;
        System.out.println("3M euribor on 13/03/2023 is " + euribor3M + "%.");


        //double data type
        double netSalarary = 855.73d;
        System.out.println(netSalarary);

        double heigh = 176.5d;
        System.out.println(heigh);

        //boolean data type

        boolean isItFirstHomeWork = true;
        boolean isItSecondHomeWork = false;
        System.out.println(isItSecondHomeWork + ", It is my first homework!");
        System.out.println(isItFirstHomeWork);

        boolean myNameInna = true;
        boolean myNameAnna = false;
        System.out.println(myNameInna);
        System.out.println(myNameAnna);


        // Concatenation (write about myself) // I will write about my current job!
        System.out.println("Hello! My name is " + fullName + " and I am " + myCurrentAge + " years old! \nI work as " + workPosition + " in " + placeOfWork + " since " + yearWhenStartedWorking + ".");
        System.out.println("In my loan portfolio the are " + numClients + " corporate clients. \nThe total loan portfolio expo is " + loanOutstanding + " EUR.");
        System.out.println("In " + placeOfWork + " minimal loan amount for corporate clients is " + loanAmount + " EUR and the term up to " + loanTerm + " years \nInterest rates starting from " + interestRate + "%.");


        //Play with arithmetic operators (+, -, / .. )

        int x = 5;
        int y = 3;
        System.out.println(x + y);

        int a, b, c;
        a = 2;
        b = 3;
        c = 4;
        //the discriminant formula = b^2-4*a*c
        System.out.println(b * b - 4 * a * c + " is the discriminant of the equation");


        int radius = 11;
        double piNumber = 3.14;

        System.out.println("The area of circle is: " + piNumber * (radius * radius));

    }
}
