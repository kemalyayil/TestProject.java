package Warmup.Warmup1;

public class Warmup28_delDel {
    /*
Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted.
Otherwise, return the string unchanged.

                    delDel("adelbc") → "abc"
                    delDel("adelHello") → "aHello"
                    delDel("adedbc") → "adedbc"
     */

    public static void main(String[] args) {
        System.out.println(delDel("adelHello"));
    }

    public static String delDel(String str) {
        if (str.length() >= 4 && str.substring(1,4).equals("del")){
            return str.substring(0,1) + str.substring(4);
        }
       return str;



       // bu benim yaptigim cozum. yukardaki daha sade
//        String myStr = "";
//
//        if (!str.startsWith("del", 1)) {
//            return str;
//        }
//            if (str.startsWith("del", 1)) {
//                myStr = str.replaceAll("del", "");
//            }
//        return myStr;
        }

    }

