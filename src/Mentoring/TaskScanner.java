package Mentoring;

import java.util.Scanner;

public class TaskScanner {
    public static void main(String[] args) {
        // Using scanner class create two products with the prices. ex: s1 = "Bread = $1.5" , s2 = "Milk = 2.5"
        // the output should be total = 1.5 + 2.5 = 4.0

        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy?");
        String s1 = scanner.nextLine();

        System.out.println("How much is it?");
        String s2 = scanner.nextLine();

        System.out.println("What else do you want to buy ?");
        String s3 = scanner.nextLine();

        System.out.println("How much is it?");
        String s4 = scanner.nextLine();

        System.out.println("In your cart you have ==> "+s1 + s2);
        System.out.println("They cost ==> " + (s3 + s4));


    }
}
