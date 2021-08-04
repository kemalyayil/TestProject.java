package Homework;

import java.util.Scanner;

public class Odev19DivisionAndConverting {
    public static void main(String[] args) {

        // * and / is always happens before + and -

        //int a = (10 + 5) * 3;

        // Write a Java program to convert temperature from Fahrenheit to Celsius degree.
        // c = (f-32) * 5/9

        Scanner scanner = new Scanner(System.in);
        System.out.print("Fahrenheit Degree   =");
        double fahrenheit = scanner.nextDouble();

        double celsius = ((fahrenheit-32) * 5/9);
        System.out.println(" ");
        System.out.println("Conversion from Fahrenheit to Celsius Result = " + celsius);

    }
}
