package lv.acodemy.homework;

import javax.naming.InterruptedNamingException;

public class FirstHomeWork {

    public static void main(String[] args) {
        // 1 TASK (Create 2 variable for each data type (meaningful)


        //Boolean data type training
        //1
        boolean ItIsMyFirstHomework = true;
        boolean ItIsMySecondHomework = false;
        System.out.println(ItIsMyFirstHomework);
        System.out.println(ItIsMySecondHomework);

        //2
        boolean TenIsBiggerThanNine = true;
        System.out.println("10>9 is" + " " + TenIsBiggerThanNine);

        //Byte data type training
        //1
        byte NumberOfEmployees = 125;
        System.out.println(NumberOfEmployees);

        //2
        byte Num1 = 127;
        byte Num2 = 5;
        System.out.println("The sum of variables is:" + (Num2 + Num1));

        //3
        byte n, a;
        n = 127;
        a = -100;
        System.out.println(n); // prints 127
        System.out.println(a); // should show an error because it cannot store more than 127 bits

        //Short data type training
        //1
        short NumOfMarks = 12500;
        System.out.println(NumOfMarks);

        //2
        short Age = 26;
        System.out.println("My age is" + " " + Age + " " + "years");

        // Char data type training
        //1
        char FirstLetterOfName = 73;
        System.out.println(FirstLetterOfName);//Should =be displayed "I" letter

        //2
        char myLetter = 'A';
        System.out.println(myLetter);

        // int data type training
        //1
        int x, y, z;
        int s = 1, t = 2, k = 3;
        double d = s * s - 4 * t * k;
        System.out.println("Discriminant is :" + " " + d);

        //2
        int MaxLoanAmount = 2000000;
        System.out.println("The maximum loan amount is" + " "+ MaxLoanAmount + "EUR");

        // long data type training

        //1
        long NumOfClients = 90012535;
        System.out.println(NumOfClients);

        //2
        long value_a, value_b, sum_value;
        long value_x=2147483649L;
        long value_y = 2147483649L;
        sum_value=value_x+value_y;
        System.out.println("The sum of two long variables is = "+sum_value);


        //Float data type training
        //1
        float LoanRate = 3.5f;
        System.out.println(LoanRate + "%");

        //2
        float NegativeDecimalNumber = -1000.5f;
        System.out.println(NegativeDecimalNumber);

        //Double data type training
        //1
        double heigh = 176.5;
        System.out.println(heigh);

        //2
        double value = -1234.456;
        System.out.println(value);


        //String data type training
        //1
        String Name = "Inna";
        String LastName = "Burko";
        String FullName = Name+ " "+ LastName;
        System.out.println(FullName);

        //2
        String MyJob = "Lending project manager";
        System.out.println(MyJob);

        String WorkPlace = "Rietumu Banka";
        System.out.println(WorkPlace);

        //2 TASK concatenation
        System.out.printf ("Hello to everyone! My name is: %s. I am %d years old.   %n%n", FullName,Age);
















    }
}










