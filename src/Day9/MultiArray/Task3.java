package Day9.MultiArray;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        // Ask user for 2 numbers
        // sum two numbers print the results
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Insert the amount of money in your pocket :");
        int myInteger = scanner.nextInt();

        System.out.print( "Insert the amount of money in your account :");
        int myInteger2 = scanner.nextInt();

        //System.out.println("You totally have : " + myInteger + myInteger2); bu sekilde toplamaz
        System.out.println("You totally have : " + (myInteger + myInteger2)); // parantez e alirsak toplar


    }
}
