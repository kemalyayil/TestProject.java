package Day8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _04_ArraysSortTask {

    public static void main(String[] args) {
        // create an int array of random numbers of size 5
        // sort the array
        // print the first element as min
        // print the last element as max
        // print the middle element as middle

        int[] array = { 55,33,77,22,99};
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        System.out.println("min: " + array[0]);
        System.out.println("max: " + array[array.length - 1]);
        System.out.println("Length :" +array.length); // kac value var onu ogrendik
        System.out.println("Middle: " + array[array.length/2]);




    }
}
