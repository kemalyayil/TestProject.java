package Day8;

import java.util.Arrays;

public class _01_ArraysToString {

    public static void main(String[] args) {

        int[] array = new int[4];
        System.out.println(Arrays.toString(array)); // boyle yaparsak sonuc [0,0,0,0] oluyor.
        array[0] = 1;
        array[array.length - 1] = 5; // bu yontem son array i bulmak icin yapiliyor.-1 e dikkat.
        System.out.println(Arrays.toString(array));



    }
}
