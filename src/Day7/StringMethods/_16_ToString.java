package Day7.StringMethods;

import java.awt.*;

public class _16_ToString {
    public static void main(String[] args) {

        String myString = "Hello World!";
        String newString = myString.toString();
        System.out.println(newString);


        Point point = new Point(1,1);

        System.out.println(point);

        String toString = point.toString();

        System.out.println(toString);
        System.out.println(toString.isEmpty()); // isempty methodu

        System.out.println(toString.replaceAll("[0-9]", "*"));

    }
}
