package Warmup.Warmup1;

import java.util.Locale;

public class Warmup23_startHi {
    /*
    Given a string, return true if the string starts with "hi" and false otherwise.

                startHi("hi there") → true
                startHi("hi") → true
                startHi("hello hi") → false
     */
    public static void main(String[] args) {
        System.out.println(startHi("hi"));
    }
    public static boolean startHi(String str) {
//        if (str.startsWith("hi")){
//            return true;
//        }
        //return false;
        return (str.toLowerCase().startsWith("hi"));   // en kisa cozum. sonradan urettim.
    }
}
