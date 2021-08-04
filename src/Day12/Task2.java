package Day12;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        // get 2 int from user using nextint
        // concatenate them together

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter you first number   : ");
        int number = scanner.nextInt();

        System.out.print("Please enter you second number  : ");
        int number2 = scanner.nextInt();

        String converted1 = Integer.toString(number);   // we converted them
        String converted2 = Integer.toString(number2);

        System.out.println(converted1.concat(converted2));





    }
}
