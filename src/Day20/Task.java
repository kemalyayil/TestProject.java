package Day20;

import java.util.Arrays;

public class Task {


    // create a method that takes a strings and reverses it, it should return reversed string
    //
    // create a method that takes an array of strings and reverses all the strings in it,
    // it should return an array of reversed strings
    //
    // create a method that takes a 2d array of strings and reverses all the strings in it,
    // it should return a 2d array of reversed strings


    public static void main(String[] args) {

        System.out.println(reverseString("JAVA")); // -> AVAJ

        String[] array = {"Java", "Pyhton"};

        System.out.println(Arrays.toString(reverseString(array))); // -> {"avaJ", "nohtyP"}

        String[][] arrayOfArrays = {{"Java"}, {"Python"}};

        System.out.println(Arrays.deepToString(reverseString(arrayOfArrays)));

    }


    public static String reverseString(String toReverse) {

//        apple -> elppa

        String reversedString = "";

        for (int i = toReverse.length() - 1; i >= 0; i--) {
            reversedString += toReverse.charAt(i);
        }
        return reversedString;
    }

    public static String[] reverseString(String[] toReverse) {

        // String[] array = {"Java", "Python"};

        String[] reversedStringsArray = new String[toReverse.length];

        for (int i = 0; i < toReverse.length; i++) {

            reversedStringsArray[i] = reverseString(toReverse[i]);

        }
        return reversedStringsArray;
    }

    /*

    {"avaJ","nohtyP"} -> reversed array

    {"Java", "Python"}

    Java - > avaJ
    Python -> nohtyP

     */

    public static String[][] reverseString(String[][] array) {

        String[][] reversedArray = new String[array.length][];

        for (int i = 0; i < array.length; i++) {

            reversedArray[i] = reverseString(array[i]);

        }

        return reversedArray;
    }
}
