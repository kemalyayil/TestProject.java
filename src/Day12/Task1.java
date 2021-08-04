package Day12;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Task
        // Get number from user as String
        // check if the number is bigger than 100
        // if it is bigger than 100 print "It's bigger than 100"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert a number");
        String number = scanner.nextLine();
        int inputNumber = Integer.parseInt(number);
        if (inputNumber > 100){
            System.out.println("It's bigger than 100");
        }



    }
}
