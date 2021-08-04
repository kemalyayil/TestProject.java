package Warmup.Warmup1;

public class Warmup20_backAround {
    /*
    Given a string, take the last char and return a new string with the last char added at the front and back,
    so "cat" yields "tcatt". The original string will be length 1 or more.

                        backAround("cat") → "tcatt"
                        backAround("Hello") → "oHelloo"
                        backAround("a") → "aaa"

     */

    public static void main(String[] args) {                // benim cozum ve sitenin cozumu ayni !!!!!!
        System.out.println(backAround("a"));
    }
    public static String backAround(String str) {

        String lastCharacter = str.substring(str.length()-1);
        return lastCharacter + str + lastCharacter;
    }
}
