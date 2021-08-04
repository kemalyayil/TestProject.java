package Day13;

import java.util.Scanner;

public class _01_GameTask {
    public static void main(String[] args) {

        // ask number from user between  0  and 5
        // generate a random number
        // check if the user number and random number are equal
        // if equals print "you win" else "you lose"

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a number between 0 - 5 =");
        int usersInput = scanner.nextInt();

        int randomInteger = (int) (Math.random()*5);
        System.out.println(" random number =" + randomInteger);

        if (usersInput == randomInteger) {
            System.out.println("You win");
        } else {
            System.out.println("you lost");

        }
    }
}
