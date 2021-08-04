package Warmup.Warmup1;

import java.util.Locale;

public class Warmup15_endUp {
    /*
    Given a string, return a new string where the last 3 chars are now in upper case.
    If the string has less than 3 chars, uppercase whatever is there.

    Note that str.toUpperCase() returns the uppercase version of a string.


endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
     */
    public static void main(String[] args) {
        System.out.println(endUp("hi there"));

    }
    public static String endUp(String str){
        int len = str.length();

        if (len <= 3){
            return str.toUpperCase();
        }else{
            String temp = str.substring(len - 3,len);
            return str.substring(0,len -3) + temp.toUpperCase();
        }

    }

}
