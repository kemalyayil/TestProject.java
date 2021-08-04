package Day20;

import java.util.Random;

public class _01_MethodOverloading {
    // overloading means same method will act in multiple forms.

    // Method Overloading:
    /*
    Method overloading is a concept of Java in which we can
    create multiple methods of the same name in the same class,
    and all methods work in different ways
     */
    public static void main(String[] args) {

        System.out.println(sum(8,9));
        System.out.println(sum(5.7 ,3.9));  // sum yazdiigmizda iki tane oldugu icin dogrusunu secmek lazim
        System.out.println(sum(7, 8.3));   // sum 3 oldu. dogrusunu sec


    }
    public static int sum (int a, int b){       // gecmis konu tekrari. sum with int+int
        return a + b;

    }

    public static double sum (double a, double b){ // sum with double+double
        return a + b;
    }


    public static double sum (int a, double b){ // sum with int+double
        return a + b;
    }

}
