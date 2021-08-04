package Day8;

import java.util.Arrays;

public class _03_ArraysEqualsTask2 {
    public static void main(String[] args) {

        // create a String array of {"10", "20"}
        // create a byte array of {20, 10}
        // convert String array into byte array
        // compare them together
        String[] stringArray2 = {"10", "20"};
        byte[] byteArray = {20, 10};

        byte[] convertedToArray = new byte[stringArray2.length];
        convertedToArray [0] = Byte.parseByte(stringArray2[0]);
        convertedToArray [1] = Byte.parseByte(stringArray2[1]);

        System.out.println(Arrays.toString(byteArray));
        System.out.println(Arrays.toString(convertedToArray));
        System.out.println(Arrays.equals(byteArray, convertedToArray));
    }
}
