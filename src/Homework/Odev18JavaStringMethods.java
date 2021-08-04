package Homework;

public class Odev18JavaStringMethods {
    public static void main(String[] args) {
        //1- Create a String which is apple. //Create another String which is Apple
        //Verify is 2 strings are equal   // Upper case or lower case is not important.

        String fruit1 = "apple";
        String fruit2 = "Apple";
        System.out.println(fruit1.equalsIgnoreCase(fruit2));

        //2- Create a string which is city where you live // Create a String which is city you born.
        // Verify first string equal to second string or not.
        String cityILive = "Buenos Aires";
        String cityIWasBorn = "Uşak";
        System.out.println(cityILive.equals(cityIWasBorn));

       // 3- Create a String which is INLINE CODE  //Create a String which is inline CODE
        // verify is the first is equal to  second string (case important)
        String x = "INLINE CODE";
        String y = "inline CODE";
        System.out.println(x.equals(y));

        // 4- Create a String which is $52.00 // remove $ sign //print the String.
        String price = "$52.00";
        System.out.println(price.replace('$', ' '));

        // 5- Create a String which is "                     Hi I'm from New York                           "
        // remove the spaces from the beginning and end of the string // print the String.
        String greeting = "                     Hi I'm from New York                           ";
        System.out.println(greeting.trim());

        //6- Create a String which is "My phone number is 123456789 and I live in 445B bakery street!"
        //Replace all the numbers with * (asterix)
        //print the String.

        String contactAndAddress  = "My phone number is 123456789 and I live in 445B bakery street!";
        System.out.println(contactAndAddress.replaceAll("[0-9]", "*"));


    }


}
