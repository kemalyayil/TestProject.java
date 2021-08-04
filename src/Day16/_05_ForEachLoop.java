package Day16;

public class _05_ForEachLoop { // enhanced for loop diye de bilinir
    public static void main(String[] args) {

        String[] cars = {"BMW", "Toyota", "Ford", "Mercedes"};

//        for (int i = 0 ; i < cars.length; i++){
//            System.out.println(i);
//        }


        for (String car : cars){     // index & length is handled by Java. reverse order oldugunda calismaz.
            // 1- String car  = BMW
            // 2- String car  = Toyota

            System.out.println(car);
            // Disadvantage of For Each Loop
            // we don't know the indexes
            // we cannot print in reverse order
        }


    }
}
