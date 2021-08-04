package Homework;

import java.util.Scanner;

public class Odev20If {
    public static void main(String[] args) {

        // Take 2 numbers from the user and print the greater number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Please insert your second number");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber){
            System.out.println("Only printed if first number is greater");
        } else if (secondNumber > firstNumber){
            System.out.println("Only printed if the second is greater");
        }



    }
}
