package Day10;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _03_MultiplicationTask {

    public static void main(String[] args) {

        // create a program that takes two numbers from the user
        // and prints their product

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Please insert your second number");
        int secondNumber = scanner.nextInt();

        System.out.println(" ");

        System.out.println( "The Value after Multiplication is -- > " + (firstNumber * secondNumber));
    }
}
