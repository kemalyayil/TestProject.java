package Day15;

import java.util.Scanner;

public class _01_Task3_1 {
    public static void main(String[] args) {

        // ask the user for pin number
        // if the pin number is incorrect keep asking the user for pin number
        // when the pin is correct print out "you are logged in"
        // the correct pin is 8787

        Scanner scanner = new Scanner(System.in);
        int correctPin = 8787;
        System.out.print("Please enter pin: ");
        int userPin = scanner.nextInt();

//        while (userPin != correctPin){
//            System.out.println("Incorrect pin, please enter again: ");
//            userPin = scanner.nextInt();
//        }
//
//        System.out.println("You are logged in!");


        while (true) {
            if (userPin == correctPin) {
                System.out.println("You are logged in!");
                break;
            } else {
                System.out.println("Incorrect pin, please enter again: ");
                userPin = scanner.nextInt();
            }
        }
    }
}