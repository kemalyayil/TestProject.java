package Day10;

import java.util.Scanner;

public class _02_SubtractionTask {

    // create a program that subtracts a number from 100
    // this number must come from user input
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number to subtract from 100");
        int number = scanner.nextInt();

        int hundred = 100;
        System.out.println(hundred - number);

    }

}
