package Homework;

import java.util.Arrays;
import java.util.Random;

public class Odev29 {
    // Create an array of size 5, assign some random values from 1 to 10
    // (use random class and for loop to assign values)
    //      1-Create a method that prints array like "2 3 1 10 2", space between elements of array
    //      2-Create a method that prints the sum of an array
    //      3-Create a method that prints the max element of an array

    //      P.S: Return type should be void because we are not returning anything just printing

    public static void main(String[] args) {
        int [] numbers = new int[5];
        Random random = new Random();

        for (int i = 0; i < numbers.length;i++){

           numbers [i] = random.nextInt(9) + 1;

        }
        System.out.println(Arrays.toString(numbers));

        printArray(numbers);
        total(numbers);
        max(numbers);


    }

    public static void printArray(int[] numbers){
        String str = "";
        for (int i = 0; i < numbers.length; i++) {
            str += numbers[i] + " ";


        }
        System.out.println("STR=" + str);

    }

    public static void total(int[] numbers){
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {

            total += numbers[i];

        }
        System.out.println("total = " + total);
    }

    public static void max(int[] numbers){

        int max = 0;
        for (int i = 0; i < numbers.length; i++) {

            max = Math.max(numbers[i],max);
        }
        System.out.println("max = " + max);
    }

}





