package Homework;

import java.util.Locale;
import java.util.Scanner;

public class Odev26_ReplaceEveryVowelLOOP_DONE {
    public static void main(String[] args) {
/*
        Write a method that uses a while loop. This method would replace every vowel in the String with X. (You should use while loop with if-else)

        e.g., the String
        Java is Fun
        should become
        JXvX Xs FXn

 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your Word :");
        String input = scanner.nextLine();

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String lowerCase = input.toLowerCase();

        while (true) {
            if (input.contains("a") || input.contains("e") || input.contains("i") || input.contains("o") || input.contains("U")) {

                System.out.println(input.replaceAll("[aeiouAEIOU]", "*"));
                break;
            } else {
                System.out.println("The input doesn't have any vowel sound");
                break;
            }

        }
    }
}






