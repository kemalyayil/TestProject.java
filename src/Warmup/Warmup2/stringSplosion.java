package Warmup.Warmup2;

public class stringSplosion {
    /*
Given a non-empty string like "Code" return a string like "CCoCodCode".

                    stringSplosion("Code") → "CCoCodCode"
                    stringSplosion("abc") → "aababc"
                    stringSplosion("ab") → "aab"
     */

    public static void main(String[] args) {
        System.out.println(stringSplosion("Kitten"));
    }
    public static String stringSplosion(String str) {
        String myStr = "";

        for (int i = 0; i < str.length(); i++) {
            myStr = myStr + str.substring(0,i+1);  // KKiKitKittKitte

        }
        return myStr;
    }
}
