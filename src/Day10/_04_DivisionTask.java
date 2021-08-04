package Day10;

import java.util.Scanner;

public class _04_DivisionTask {
    public static void main(String[] args) {

        // Write a Java program that calculate average of following numbers
        // 23.4, 24.0, 12, 450.3, 23000

        // part2: assign the numbers to variables first

       double num1 = 23.4;
       double num2 = 24.0;
       byte num3 = 12;
       double num4 = 450.3;
       double num5 = 23000;

       double result = ((num1 + num2 + num3 +num4 +num5) /5); // icinde bi tane double olmasi yeter.
        System.out.println(result);                             // JVM converts them to double automatically




    }
}
