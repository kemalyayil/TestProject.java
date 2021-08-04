package Day14;

import java.util.Locale;

public class _02_Task {
    public static void main(String[] args) {
        // {"apple", "watermelon", "peach", "strawberry", "kiwi"}


        String[] array = {"apple", "watermelon", "peach", "strawberry", "kiwi"};
        for (int i = 0; i < array.length ; i++){
            System.out.println(array[i]);
        }
        System.out.println("");

        for (int i = array.length - 1; i >= 0; i--){ // bu da tersten yazdirir.
            System.out.println(array[i].toUpperCase()); // istedigimiz methodu da bu sekilde uygulayabiliriz
        }
    }

}
