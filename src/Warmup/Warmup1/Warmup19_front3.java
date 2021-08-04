package Warmup.Warmup1;

public class Warmup19_front3 {
    /**
     * Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
     * front3("Java") → "JavJavJav"
     * front3("Chocolate") → "ChoChoCho"
     * front3("abc") → "abcabcabc"
     */
    public static void main(String[] args) {
        System.out.println(front3("pokemon"));

    }

    public static String front3(String str) {
        String first3 = "";
        if (str.length() >= 3) {
            first3 = str.substring(0, 3);
        }else {
            first3 = str;
        }
        return first3 + first3 + first3;




        //Benim cozum. yukardaki daha sade daha guzel
//        if (str.length() == 0){
//            return str;
//        }
//        if (str.length() <= 1){
//            return str.substring(0, 1) + str.substring(0, 1)+ str.substring(0, 1);
//        }
//        if (str.length() <= 2) {
//            return str.substring(0, 2) + str.substring(0, 2)+ str.substring(0, 2);
//        } else {
//            return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
        }
    }

