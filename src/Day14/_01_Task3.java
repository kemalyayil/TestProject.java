package Day14;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _01_Task3 {
    // for loops
    public static void main(String[] args) {

        // write a java program which calculates the sum from [0 to 5];
        // using for-loop
        // get toSum number from user

        Scanner scanner = new Scanner(System.in);
        System.out.print( "Enter one number = ");
        int userInput = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i <= userInput ; i++){
            sum += i;
        }
        System.out.println("i = " + sum);
    }
}
