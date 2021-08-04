package Day8;

import java.util.Arrays;

public class _05_BinarySearchTask {
    public static void main(String[] args) {
        // binary de mutlaka sorted olmasi lazim. aksi taktirde sonuc -1 olur.

        // create an array of fruits
        // sort the array
        // search for index of your favorite fruit
        // print both index and your favorite fruit

        String[] fruits = {"Watermelon", "Strawberry", "Grape", "Banana", "Kiwi"};

        Arrays.sort(fruits);

        int indexOfFruit = Arrays.binarySearch(fruits, "Kiwi");

        System.out.println("My Favorite fruit is: " + fruits[indexOfFruit] + " and index of fruit " + indexOfFruit);
                                                        // [] o meyveyi yazirmak icin

    }
}
