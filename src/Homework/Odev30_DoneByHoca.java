package Homework;

import java.util.Scanner;

public class Odev30_DoneByHoca {
    /*
    -1-Create a method which checks if length of string is at least 8 characters,
    it returns true or false (Return Type should be boolean)

-2-Create a method which checks if character is letter (Return Type should be boolean)

-3-Create a method which counts letters in given string (Return Type should be int)
    example input: "abcde123"
    example output: 5

-4-create a method which checks if character is digit (Return Type should be boolean)
    hint: character >= '0' && character <= '9' (digits)
     */





    public static void main(String[] args) {

        boolean is8 = checkLengthIf8("Java is difficult");
        System.out.println(is8);

        boolean isLetter = checkIfLetter('a');
        System.out.println(isLetter);

        int numberOfLetters = countLetters("This is a factory");
        System.out.println(numberOfLetters);

        boolean isDigit = checkIfDigit('6');
        System.out.println(isDigit);

    }
    // create a method which checks if length of Sting is at least 8, it returns true or false
    public static boolean checkLengthIf8(String line){

        boolean result = false;

        if (line.length() >= 8){
            result = true;
        }
        return result;
    }


    public static boolean checkIfLetter(char character){

        boolean result = false;

        if ((character >= 65 && character <= 90) || (character >= 97 && character <= 122)){
            result = true;
        }
        return result;
    }


    public static int countLetters(String str){

        int count = 0;

        for (int i = 0; i < str.length(); i++){
            char character = str.charAt(i);
            if (checkIfLetter(character)){
                count++;
            }
        }
        return count;
    }


    public static boolean checkIfDigit(char character){

//        boolean result = false;
//
//        if (character >= '0' && character <= '9'){
//            result = true;
//        }
//
//        return result;


        // instead of typing all the code above you can directly pass boolean
        // expression in return statement (because our return type ois boolean)
        return (character >= '0' && character <= '9');

    }
    }



