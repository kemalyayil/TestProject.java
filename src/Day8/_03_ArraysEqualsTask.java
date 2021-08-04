package Day8;

import java.util.Arrays;

public class _03_ArraysEqualsTask {
    public static void main(String[] args) {

        // create a String array of {"1", "2"}
        // create an int array of {1, 2}
        // convert String array into int array
        // compare them together

        String[] stringArray = {"1", "2", "3"};
        int[] integerArray = {1, 2, 3};

        int[] convertedArray = new int[stringArray.length];
        convertedArray[0] = Integer.parseInt(stringArray[0]);
        convertedArray[1] = Integer.parseInt(stringArray[1]);
        convertedArray[2] = Integer.parseInt(stringArray[2]);



        System.out.println(Arrays.toString(integerArray));
        System.out.println(Arrays.toString(convertedArray));
        System.out.println(Arrays.equals(integerArray, convertedArray));






    }
}
