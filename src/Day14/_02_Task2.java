package Day14;

import java.util.Arrays;
import java.util.Random;

public class _02_Task2 {
    public static void main(String[] args) {

        // declare an array of bytes
        // init it with size 3
        // give each element a random value
        // print all elements
        // random.nextInt() use this.

        Random random = new Random();

        byte[] byteArray = new byte[3];

//        byteArray[0] = (byte) random.nextInt(127);
//        byteArray[1] = (byte) random.nextInt(127);
//        byteArray[2] = (byte) random.nextInt(127);
        // when you see repeat like this use for loop

//        random.nextBytes(byteArray); this will fill our array with random number [-128, 127]

        // init the array
        for (int i = 0; i < byteArray.length; i++){
            byteArray[i] = (byte) random.nextInt(127);
        }

        System.out.println(Arrays.toString(byteArray));

        // printing the array
        for (int j = 0; j < byteArray.length; j++){
            System.out.println(byteArray[j]);
        }


    }
}
