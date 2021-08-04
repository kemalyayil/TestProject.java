package Homework;

import java.util.Arrays;

public class _00_Split {
    public static void main(String[] args) {
        String motto = "I know English well";
        String[] array2 = motto.split(" ");
        String [] ttt = { "I","know", "Spanish", "well"};
        System.out.println("ttt"+ Arrays.toString(ttt));

        System.out.println("array2 = " + Arrays.toString(array2));
        System.out.println("Arrays.toString(array2) = " + Arrays.toString(array2));
        
//        String[] array = motto.split("");
//        System.out.println("motto = " + motto);
//        System.out.println("array = " + Arrays.toString(array));

    }
}
