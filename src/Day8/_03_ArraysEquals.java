package Day8;

import java.util.Arrays;

public class _03_ArraysEquals {
    public static void main(String[] args) {

        // checks if both arrays have same values in same order

        int[] first = {1,3,5};
        int[] second = {1,4,5};
        int[] third = {1,3,5};

        System.out.println(Arrays.equals (first , second));
        System.out.println(Arrays.equals (first , third));
        System.out.println(Arrays.equals (second ,third));


    }
}
