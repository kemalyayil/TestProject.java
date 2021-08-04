package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Odev31 {

    /*
    1-
Create one method name is -->> randomNum
this method will take one parameter which is called int max
method will create a random number between 0 to max
return random number.
    2-
Create one method which name is -->> middleWord
This method will take a String as parameter
Find a middle word in the String
Return the middle word
Example:
String is "I love Java";  -->> return "love"
String is " Registered users can **s**ign-in"  -->>  return  "users"
    3-
Create one method name is -->> reverseString
This method should have a parameter as String
And it should reverse that string
Return the reversed String
Example :
String is : Write a Java code
return should be : edoc avaJ a etirW
    4-
Create one method name is -->>  reverseWord
This method should have a parameter as String
And it should reverse that string by words
Return the reversed String
Example 1 :
String is : Write a Java
return should be :  Java a Write

Example 2 :
String is : Keep calm and stay home
return should be : home stay and calm Keep
    5-
Create one method name is -->> getSum
This method has one parameter which is Array of Strings
Remove all the $ signs in the array and sum all the numbers
return the total (return type should be int)
if the result less then 0 then print -1

Example :
ArrayList is : $13 , $15 , $20
result should be 48

Example 2:
ArrayList is : $-13 , $0 , $0
result should be -1
     */
    public static void main(String[] args) {
        //1
        int random = randomNum(10);
        System.out.println("random number =  " + random);

        //2
        System.out.println("Your middle word is =  " + middleWord());

        //3
        String turkey = reverseString("Turkey");
        System.out.println("turkey = " + turkey);

        //4
        String wordsReversing = reverseWord("I dont know");
        System.out.println("Task 4 ==>  " + wordsReversing);

        //5
        String [] prices = {"$22","$44","$66"};
        String [] prices2 = {"$-22","$-44","$-66"};

    }

    //1
    public static int randomNum(int max) {
        int createARandomNumber = (int) (Math.random() * max) + 0;

        return createARandomNumber;
    }


    //2
    public static String middleWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your sentence.");
        String userInput = scanner.nextLine();

        String[] array = userInput.split(" ");
        if (array.length % 2 == 0) {
            return array[array.length / 2 - 1];
        }
        return array[array.length / 2];
    }

    //3
    public static String reverseString(String userInput) {

        String[] stringArray = userInput.split("");
        String reversedString2 = "";

        for (int i = stringArray.length - 1; i >= 0; i--) {
            reversedString2 += userInput.charAt(i);
          // reversedString2 = reversedString2.concat(stringArray[i]);
        }
        return reversedString2;
    }

    //4
    public static String reverseWord(String reversingWords) {

        String reversedString3 = "";

        for (int i = reversingWords.length() - 1; i >= 0; i--) {
            reversedString3 += reversingWords.charAt(i);
        }
        return reversedString3;
    }

    //5
    public static int getSum(String[] arrayOfStrings) {


            int total = 0;

            for (int i = 0; i < arrayOfStrings.length; i++) {
                total += Integer.parseInt(arrayOfStrings[i].replaceAll("[^\\d.-]",""));
            }

            return total<0 ? -1 : total;
        }




    }


