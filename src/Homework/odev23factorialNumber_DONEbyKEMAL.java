package Homework;

import java.util.Scanner;

public class odev23factorialNumber_DONEbyKEMAL {

    public static void main(String[] args) {

        /*
        Write a program to find the factorial value of any number entered through the scanner class.

        Example:
        number:7
        factorial:1*2*3*4*5*6*7=5040
        output should be == 5040

        number:6
        factorial:1*2*3*4*5*6=720
        output should be == 720

       */

        Scanner dp = new Scanner(System.in);

        String  strNum = dp.nextLine();

        int number = Integer.parseInt(strNum);

//      code start here  use int number

        int factorialNumber = 1;
        for (int i = 1; i <= number; i++){   // kucuk esittir e dikkat. o sayiyi da kapsamasi lazim
            factorialNumber = factorialNumber * i;
        }
        System.out.println(factorialNumber);
    }
}
