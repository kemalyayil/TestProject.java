package Day13;

import java.util.Scanner;

public class _07_SwitchTask {
    public static void main(String[] args) {
        // get number from the user
        // print "ok" if number is 5
        // print "maybe" if number is 3
        // print "no" if number is 1
        // print "dunno" if anything else
        // use switch case

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 - 5 =  ");

        int userInput = scanner.nextInt();
        switch (userInput) {
            case 5:
                System.out.println("OK");
                break;
            case 3:
                System.out.println("May be");
                break;
            case 1:
                System.out.println("No");
                break;
            default:
                System.out.println("dunno");
                break;


        }
    }
}
