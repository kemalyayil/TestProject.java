package Homework;

import java.util.Scanner;

public class Odev27MultiplicationTable_DONEbyKEMAL {
    public static void main(String[] args) {

        // Write a program that prints the multiplication table of the user provided number.
        // (I know we did this in class but try to write this code 1 more time without looking
        // to my solution)

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i <= 10 ; i++ ){

            System.out.println(num + "*" + i + "=" + (num * i));

        }
    }
}
