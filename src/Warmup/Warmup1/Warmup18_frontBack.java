package Warmup.Warmup1;

public class Warmup18_frontBack {
    /*
Given a string, return a new string where the first and last chars have been exchanged.

                    frontBack("code") → "eodc"
                    frontBack("a") → "a"
                    frontBack("ab") → "ba"
                    // bas harf ve son harflerin yerini degistirmek
     */
    public static void main(String[] args) {
        System.out.println(frontBack("Alibabanin"));

    }
    public static String frontBack(String str){

        if (str.length() <= 1){     // "<=" olmazsa tek karakterli olanlarda sikinti yasiyoruz
            return str;
        }
        String middle = str.substring(1,str.length()-1);        // amac; bas ve son kisimlardan arta kalani almak
        return str.charAt(str.length()-1) + middle + str.charAt(0);
    }
}
