package Day22;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_ArrayListTask {
    // create an arraylist of Strings
    // add Red, Green and Blue inside
    // print out all the elements, each element on new line

    // Part2: create a method that accepts an arraylist and element
    // it should add the element at the first position to arraylist

    // Part3: create a method that accepts an arraylist and element
    // it should add element before last  [1, 2, 3]  -> [1, 2, 4, 3]


    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println(colors);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
            //System.out.println(colors[i]); // normal array olsaydi boyle yapardik. square brackets a dikkat
        }

        for (String color : colors) { // if you don't need index, you can use for each loop
            System.out.println(color);
        }

        addElementAtFirstPosition(colors, "Black");
        System.out.println(colors);

        addElementBeforeLast(colors, "Purple");
        System.out.println(colors);



    }

    // Part2: create a method that accepts an arraylist and element
    // it should add the element at the first position to arraylist

    public static void addElementAtFirstPosition(ArrayList<String> list, String element) {
        list.add(0, element);

    }


    // Part3: create a method that accepts an arraylist and element
    // it should add element before last  [1, 2, 3]  -> [1, 2, 4, 3]

    public static void addElementBeforeLast(ArrayList<String> list, String element) {
        list.add(list.size() - 1, element);
    }
}
