package Day8;


import java.util.Arrays;

public class _01_ArraysToStringTask {
    //              Task
    // create an array of int with 4 elements
    // assign each element a random value from 10 to 99
    // print the array using toString method
    // Part2: swap first and last elements, print the array again

          public static void main (String[]args){
            int[] elements = {10, 54, 25, 78};
            System.out.println(Arrays.toString(elements));

            int lastIndex = elements.length - 1; // bunu yapmamizin nedeni son item a ulasmak.
            int temp = elements[0]; // burada temp variable olusturup ilk item i sectik
            elements[0] = elements[lastIndex]; // sectigimiz ilk item i , son item a atadik.
            elements[lastIndex] = temp; // son item i ilk item a atadik.
            System.out.println(Arrays.toString(elements)); //78 ile 10 un yeri degisti


        }
    }









        // hocanin yaptigi //

//        int[] randomNumbers = {10, 54, 25, 78};
//        System.out.println(Arrays.toString(randomNumbers));
//
//        int lastIndex = randomNumbers.length -1;
//        int temp = randomNumbers[0];
//        randomNumbers[0] = randomNumbers[lastIndex];  // randomNumbers[0] = 78;
//        randomNumbers[lastIndex] = temp;
//
//        System.out.println(Arrays.toString(randomNumbers));




