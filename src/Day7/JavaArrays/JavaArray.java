package Day7.JavaArrays;

import java.sql.Array;
import java.util.Arrays;

public class JavaArray {
    public static void main(String[] args) {

        // we use arrays to store list of items. // arrays are fixed size. once you create an array,
                                                  //  you can not add or remove items
        // eger 3 items eklediysen , ekleme cikarma olmaz. ama asagidaki degerler degisebilir

        int variable ; // how we declare a variable
        variable = 10; // how we init a variable

        int variable2 = 10;

        int[] myArray = new int[3]; // how many items we will store inside the array.
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        System.out.println(myArray); // [I@1b6d3586 sonuc bu . cunku java memory location i bize veriyor.
        System.out.println(Arrays.toString(myArray));

        int[] arrayOfNumbers = {15,9,2,10,7,1,6}; // bu shortcut to create an array.
        System.out.println("length = "+ arrayOfNumbers.length); // length method is applied

        System.out.println(Arrays.toString(arrayOfNumbers)); // this is not sorted

//   Arrays are -fixed size- once you create an array you cannot add or remove items
      Arrays.sort(arrayOfNumbers);
        System.out.println(Arrays.toString(arrayOfNumbers)); // sort method.

        String [] arrayOfCars = {"Toyota", "BMW", "Mercedes" , "Tesla", "Ford"};
        System.out.println(Arrays.toString(arrayOfCars));
        System.out.println(arrayOfCars.length);
        Arrays.sort(arrayOfCars);
        System.out.println(Arrays.toString(arrayOfCars)); // sorted
        System.out.println(arrayOfCars[1]); // sadece yazdigin sirayi print eder






    }
}
