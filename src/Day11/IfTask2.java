package Day11;

import java.util.Scanner;

public class IfTask2 {
    public static void main(String[] args) {
        // get a number from the user
        // check if it is positive or negative
        // part2: check for zero also


        Scanner scanner = new Scanner(System.in);
        System.out.println("Your Number :");
        int numberFromUser = scanner.nextInt();
        if (numberFromUser > 0)  {
            System.out.println("Positive");
        }
        if (numberFromUser < 0)  {
            System.out.println("Negative");
        }
        if (numberFromUser == 0)  {
            System.out.println("Zero");
        }


    }
}


