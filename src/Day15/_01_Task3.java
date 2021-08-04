package Day15;

import java.util.Scanner;

public class _01_Task3 {
    public static void main(String[] args) {

        // ask the user for pin number
        // if the pin number is incorrect keep asking the user for pin number
        // when the pin is correct print out "you are logged in"
        // the correct pin is 8787

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your pin = ");

        int correctPin = 8787;
        int userPin = scanner.nextInt();

        while (userPin != correctPin){
            System.out.println(" Incorrect pin, pls enter again");
            userPin = scanner.nextInt(); // yanlis oldugu icin bi daha soruyoruz.
        }

        System.out.println("You are logged in !"); // eger dogru pin i girerse, yukardakinden gececek.
                                                    // ve baska bi sey yazmaya gerek kalmayacak
                                                    // bu COK ONEMLI
        }

    }


