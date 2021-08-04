package Warmup.Warmup1;

public class Warmup16_everyNth {
    /*
Given a non-empty string and an int N, return the string made starting with char 0,
and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.


                everyNth("Miracle", 2) → "Mrce"
                everyNth("abcdefg", 2) → "aceg"
                everyNth("abcdefg", 3) → "adg"
     */
    public static void main(String[] args) {
        String str = "abcdefg";
        System.out.println(everyNth(str,2));


    }
    public static String everyNth(String str, int n) {

        String myString = "";

        for (int i = 0; i < str.length(); i = i + n ) {     // burdaki "i = i + n" can alici nokta
            myString += str.charAt(i);

        }
        return myString;

        }

    }

