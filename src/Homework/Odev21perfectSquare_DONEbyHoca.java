package Homework;

import java.util.Scanner;

public class Odev21perfectSquare_DONEbyHoca {


    /*
    Given a positive integer num, write a function which returns true if num is a perfect square else false.

        Note: Do not use any built-in library function such as sqrt.

        Example 1:
        Input: 16
        Output: true
        Note: this number is perfect square because 4*4 is 16

        Example 2:
        Input: 25
        Output: true
        Note: this number is perfect square because 5*5 is 25

        Example 3:
        Input: 14
        Output: false

     */

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        int input = scanner.nextInt();

        //  code Start here don't change before this line
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter one number = ");

        int num = scanner.nextInt();

        boolean isPS = false;
        for (int i = 1; i*i <= num; i++){  // bizimkinden farkli olarak buraya yazdik i*i. boylece
                                            // daha az memory harciyor.
            if (i * i == num){
                isPS = true;
            }
        }
        System.out.println("Input: " + num);
        System.out.println("Output: " + isPS);




     }

        }





