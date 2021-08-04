package Day9.MultiArray;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //create a program that ask for you name, age and height, print out this information

        Scanner scanner = new Scanner(System.in);
        String name = "What is your name?";
        System.out.print(name);
        String yourName = scanner.nextLine();

        String age = "How old are you?";
        System.out.print(age);
        String yourAge = scanner.nextLine();

        String height = "What is your height?";
        System.out.print(height);
        String yourHeight = scanner.nextLine();


        System.out.println(""); // bosluk koymak icin.asagida belli olsun diye.

        System.out.println("Your name is -> " + yourName);
        System.out.println("Your age is -> " + yourAge);
        System.out.println("Your height is -> " + yourHeight);

    }
}


