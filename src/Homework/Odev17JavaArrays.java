package Homework;

import java.util.Arrays;

public class Odev17JavaArrays {
    public static void main(String[] args) {
        //1- Create a String array which is vegetables . Values =  Tomato , Potato , Onion , Mushroom, Lettuce
        //Print all the values in array.

        String[] vegetable1 = new String[5];
        vegetable1[0] = "Tomato";
        vegetable1[1] = "Potato";
        vegetable1[2] = "Onion";
        vegetable1[3] = "Mushroom";
        vegetable1[4] = "Lettuce";
        System.out.println(Arrays.toString(vegetable1));

        String[] vegetable2 = {"Tomato","Potato","Onion","Mushroom", "Lettuce"};
        System.out.println(Arrays.toString(vegetable2));

//        2- Create an int array which is years  Values = 2010, 2000, 2001, 1993, 2021, 1989
//        Print all the values in array.
        int[] years = new int[6];
        years[0] = 2010;
        years[1] = 2000;
        years[2] = 2001;
        years[3] = 1993;
        years[4] = 2021;
        years[5] = 1989;
        System.out.println(Arrays.toString(years));
        int[] years2 = {2010, 2000, 2001,1993,2021,1989};
        System.out.println(Arrays.toString(years2));

//        3- Create an int array which is numberToSum . Values = 25, 30, 30, 35, 100 .and print the sum of these numbers
//        result should be 220
        int[] numberToSum1 = new int[5];
        numberToSum1[0] = 25;
        numberToSum1[1] = 30;
        numberToSum1[2] = 30;
        numberToSum1[3] = 35;
        numberToSum1[4] = 100;

        System.out.println(Arrays.toString(numberToSum1));
        int sum = (numberToSum1[0] + numberToSum1[1] + numberToSum1[2] + numberToSum1[3] + numberToSum1[4]);
       System.out.println(sum);

        int[] numberToSum2 = {25, 30, 30, 35, 100};
        System.out.println(Arrays.toString(numberToSum2));
     int sum2 = (25 + 30 + 30 + 35 + 100);
        System.out.println(sum2);

        //4- Create an int array which is ages . Values = 45, 32, 26, 19, 51, 29, 30
        //Sort this Array //Print Array after sorting\

        int[] arrayAges = new int[7];
        arrayAges[0] = 45;
        arrayAges[1] = 32;
        arrayAges[2] = 26;
        arrayAges[3] = 19;
        arrayAges[4] = 51;
        arrayAges[5] = 29;
        arrayAges[6] = 30;
        System.out.println(Arrays.toString(arrayAges));
        Arrays.sort(arrayAges);
        System.out.println(Arrays.toString(arrayAges));

        int[] arrayAges2 = {45, 32, 26, 19, 51, 29, 30};
        System.out.println(Arrays.toString(arrayAges2));
        Arrays.sort(arrayAges2);
        System.out.println(Arrays.toString(arrayAges2));

       // 5- Create a float array which is productPrices. Values = 19.99, 28.09, 9.99, 35.9, 17.29, 10.79, 20.95, 99.9, 1.19
        //Sort this Array // Print Array after sorting //Print the length of this Array

        float[] productPrices1 = {19.99F, 28.09F, 9.99F, 35.9F, 17.29F, 10.79F, 20.95F, 99.9F, 1.19F};
        System.out.println(productPrices1.length);
        System.out.println(Arrays.toString(productPrices1));
        Arrays.sort(productPrices1);
        System.out.println(Arrays.toString(productPrices1));

        float[] productPrices2 = new float[9];
        productPrices2[0] = 19.99F;
        productPrices2[1] = 28.09F;
        productPrices2[2] = 9.99F;
        productPrices2[3] = 35.9F;
        productPrices2[4] = 17.29F;
        productPrices2[5] = 10.79F;
        productPrices2[6] = 20.95F;
        productPrices2[7] = 99.9F;
        productPrices2[8] = 1.19F;
        System.out.println(Arrays.toString(productPrices2));
        Arrays.sort(productPrices2);
        System.out.println(Arrays.toString(productPrices2));
        System.out.println(productPrices2.length);

        //6-Create a char array which is specialChars
        //Values = !, %, *, ), <, $, +, -, ~, @         Print Array //Print the length of this Array

        char[] specialChars = new char[10];
        specialChars[0] = '!';
        specialChars[1] = '%';
        specialChars[2] = '*';
        specialChars[3] = ')';
        specialChars[4] = '<';
        specialChars[5] = '$';
        specialChars[6] = '+';
        specialChars[7] = '-';
        specialChars[8] = '~';
        specialChars[9] = '@';
        System.out.println(Arrays.toString(specialChars));
        System.out.println(specialChars.length);

        char[] specialChars2 = {'!', '%', '*', ')', '<', '$', '+', '-', '~', '@'};
        System.out.println(Arrays.toString(specialChars2));
        System.out.println(specialChars2.length);


    }
}

