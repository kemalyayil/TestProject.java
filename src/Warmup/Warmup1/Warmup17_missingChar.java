package Warmup.Warmup1;

public class Warmup17_missingChar {
    /*
    Given a non-empty string and an int n, return a new string where the char at index n has been removed.
    The value of n will be a valid index of a char in the original string
    (i.e. n will be in the range 0..str.length()-1 inclusive).

                missingChar("kitten", 1) → "ktten"
                missingChar("kitten", 0) → "itten"
                missingChar("kitten", 4) → "kittn"
     */

    public static void main(String[] args) {
        String str = "kitten";
        System.out.println(missingChar(str,1));
    }
    public static String missingChar(String str, int n) {

        String myStr = "";
        myStr = str.substring(0,n) + str.substring(n + 1,str.length());

//        Mantigi ; ilk substring de 0. index ten baslayip n' e kadar olani kes.
//        ikinci substring de ise (n+1) n'den baslayip sona kadar olan kismi ilk substringle beraber ekle ve print et.


        return myStr;
    }
}
