package Day13;

import java.util.Scanner;

public class _02_Task2HocaninCode {
    // get string input from the user
    // if it contains 'a' and 'b', print "The input contains both a and b"
    // else print "The input does not contains both a and b"


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        if (input.contains("a") && input.contains("b")) {
            System.out.println("The input contains both a and b");
        } else if (input.contains("a")){
            System.out.println("Contains only a");
        } else if (input.contains("b")){
            System.out.println("Contains only b");
        } else {
            System.out.println("The input does not contains both a and b");
        }


//        String output;
//        if (input.contains("a") && input.contains("b")) {
//            output = "contains";
//        } else {
//            output = "does not contain";
//        }
//
//        System.out.println("Input " + output + " both a and b");

        // if input only contains a
        // if input only contains b

    }
}
