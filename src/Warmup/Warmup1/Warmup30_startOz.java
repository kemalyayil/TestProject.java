package Warmup.Warmup1;

public class Warmup30_startOz {
    /*
Given a string, return a string made of the first 2 chars (if present),
however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".


                startOz("ozymandias") → "oz"
                startOz("bzoo") → "z"
                startOz("oxx") → "o"
     */
    public static void main(String[] args) {
        System.out.println(startOz("zzzz"));
    }
    public static String startOz(String str) {
        String myStr = "";

        if (str.length() >= 1 && str.charAt(0) == 'o'){
            myStr += 'o';
        }
        if (str.length() >= 2 && str.charAt(1) == 'z'){
            myStr += 'z';
        }
        return myStr;
    }

}
