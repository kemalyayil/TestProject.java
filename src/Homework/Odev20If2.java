package Homework;

import java.util.Scanner;

public class Odev20If2 {
    public static void main(String[] args) {
        // Take 2 numbers from the user and print the greater number

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your first number :");
        int firstNumber = scanner.nextInt();
        System.out.print("Your second number :");
        int secondNumber = scanner.nextInt();

        if (firstNumber>secondNumber){
            System.out.println(firstNumber);
        }
        if (secondNumber>firstNumber){
            System.out.println(secondNumber);
        }




    }
}

