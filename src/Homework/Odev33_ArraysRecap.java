package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Odev33_ArraysRecap {
    /*
    1-
    Create a method name is duplicate()
    parameter is int array
    return type is boolean
    if there is duplication in the array return true
    if there is not duplication in the array return false

                    Example 1:                          Example 2:
                    Input: [1,2,3,1]                    Input: [1,2,3,4]
                    Output: true                        Output: false

    2- Given an int array, write functions to find the minimum and maximum elements in it.
                    Example 1:

                    Input: [243, 5, 123, 44]
                    Output: Function1 (max) should return: 243
                    Function2 (min) should return: 5

    3-Given an array, the task is to reverse the array.
                    Example:

                    Input: ["Techno", "Study", "Java"]
                    Output: ["Java", "Study", "Techno"]

    4-  An array contains both positive and negative numbers in random order.
        Rearrange the array elements so that all negative numbe6positive numbers.

                    Example :

                    Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
                    Output: -12 -13 -5 -7 -3 -6 11 6 5
                    Note: Order of elements is not important here.

    5 - Given an array of integers, find the first repeating element in it.
        We need to find the element that occurs more than once and whose index of first occurrence is smallest.

                    Examples:

                    Input:  arr[] = {10, 5, 3, 4, 3, 5, 6}
                    Output: 5 [5 is the first element that repeats]

                    Input:  arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10}
                    Output: 6 [6 is the first element that repeats]

     */
    public static void main(String[] args) {
        //Task 1 PRINT
        int[] input1 = {1, 2, 3, 1};  // true
        int[] input2 = {1, 2, 3, 4};  //false

        boolean checkInput1 = duplicate3(input1);
        boolean checkInput2 = duplicate3(input2);
        System.out.println("Input 1 = " + checkInput1);
        System.out.println("Input 2 = " + checkInput2);


        // Task 2 PRINT
        int[] checkMaxAndMin = {243, 5, 123, 44};
        minAndMax(checkMaxAndMin);


        //Task 3 PRINT
        String[] str = {"A", "B", "C", "D"};
        System.out.println("Task 3 ==> " +Arrays.toString(reverseArray(str)));

        //Task 4 PRINT
        int[] myInt = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        reorderNumbers(myInt);

        // Task 5 PRINT
        int[] arr = {6,10,5,4,9,120,4,6,10};
        int i = firstRepeatedElement(arr);
        System.out.println("Task 5 ==> " + i);


    }

    // Task 1
    public static boolean duplicate3(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Task 2
    public static void minAndMax(int[] elements) {

        int min = elements[0];
        int max = elements[0];

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < min) {
                min = elements[i];
            } else if (elements[i] > max) {
                max = elements[i];

            }
        }
        System.out.println("Min value is  = " + min);
        System.out.println("Max value is  = " + max);
    }

    //Task 3
    public static String[] reverseArray(String[] str) {
        String[] reverse = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            reverse[i] = str[str.length - 1 - i];

        }
        return reverse;

    }

    // Task 4
    public static void reorderNumbers(int[] myArray) {
        int tmp;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i] < myArray[j]) {
                    tmp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));
    }

    // Task 5
    public static int firstRepeatedElement(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            } else {
                return arr[i];
            }
        }
        return -1;
    }

}

















