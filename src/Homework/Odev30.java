package Homework;

import java.util.Scanner;

public class Odev30 {
    /*
-1-Create a method which checks if length of string is at least 8 characters, it returns true or false (Return Type should be boolean)

-2-Create a method which checks if character is letter (Return Type should be boolean)

-3-Create a method which counts letters in given string (Return Type should be int)
    example input: "abcde123"
    example output: 5

-4-create a method which checks if character is digit (Return Type should be boolean)
    hint: character >= '0' && character <= '9' (digits)


P.S: Return Type parameters could be different for example:
      public static boolean method(String str){}
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your motto");
        String userInput = scanner.nextLine();

        boolean lengthAtLeast7 = false;
        if (userInput.length() <= 7 ){
            System.out.println("Length at least 8   =" + false);
        }else {
            System.out.println("Length at least 8   =" + true);
        }

        boolean isLetter = false;
        if (userInput.contains("[^azAZ]")){
            System.out.println("isLetter            =" + false);
        }else {
            System.out.println("isLetter            =" + true);
        }

        char capitalLetters;
        char lowerCase ;
        int counter= 0;
        for (int i = 0; i < userInput.length(); i++){
            capitalLetters = 90;
          //  if ( userInput.contains('A-Z'){
                counter = counter + i;

            }
        //}System.out.println(counter);
    }

}

