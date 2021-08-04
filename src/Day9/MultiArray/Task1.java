package Day9.MultiArray;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        // 1 - Where are you from
        // 2 - Where do you live
        // print the result

        Scanner scanner = new Scanner(System.in);
        System.out.println("Where are you from?");
        String countryWhereYouFrom = scanner.nextLine();

        System.out.println("Where do you live?");
        String currentPlace = scanner.nextLine();

        System.out.println("You are from : " + countryWhereYouFrom);
        System.out.println("You live in: " + currentPlace);


    }
}
