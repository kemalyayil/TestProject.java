package Homework;

import java.util.Scanner;

public class Odev28CheckIfANumberPrime_DONE {
    public static void main(String[] args) {
        //Write a program that checks if a number is a Prime number.
        // (Prime numbers are numbers that have only 2 factors: 1 and themselves. For example, the first 5 prime numbers are 2, 3, 5, 7, and 11.)
        //  Hint: You don't need to check for 1 so start your counter from 2 :)

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean condition = num % 1== 0 && num % num == 0;
        for (int i = 2; i < num; i++){
            if (condition && num % i !=0){
                System.out.println("Prime Number");
                break;
            }else {
                System.out.println("not a prime number");
                break;
            }
        }






    }
}
