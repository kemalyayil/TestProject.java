package Day14;

import java.util.Arrays;

public class _02_ForLoopWithArray {
    public static void main(String[] args) {

    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(array));
        System.out.println(array[0]);
        System.out.println(array[1]); // buraya kadar olan gecmis konu tekrari.

        for (int i = 0 ; i < array.length ; i++){
            System.out.print(array[i]);
        }
        System.out.println(" ");
        for (int i = 0 ; i < array.length - 1 ; i++){ // 8 e kadar basar
            System.out.print(array[i]);
        }
    }
}
