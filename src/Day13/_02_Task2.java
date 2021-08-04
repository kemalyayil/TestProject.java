package Day13;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class _02_Task2 {

    public static void main(String[] args) {

        // get string input from the user
        // if it contains 'a' and 'b', print "The input contains both a and b"
        // else print "The input does not contains both a and b"

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your motto ?");
        String myString = scanner.nextLine();

//        if (myString.contains("a") && myString.contains("b")) {
//            System.out.println("The input contains both a and b");
//        }else {
//            System.out.println("The input does not contains both a and b");
//        }

        if (myString.contains("a") && myString.contains("b")) {
            System.out.println("The input contains both a and b");
        } else if ( myString.contains("a")){
            System.out.println("The input contains only a");
        } else if (myString.contains("b")){
            System.out.println("The input contains only b");
        } else {
            System.out.println("The input does not contain both a and b");
        }

    }
}
