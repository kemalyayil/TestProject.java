package Warmup.Warmup2;

public class stringTimes {
    /*
    Given a string and a non-negative int n, return a larger string that is n copies of the original string.

                    stringTimes("Hi", 2) → "HiHi"
                    stringTimes("Hi", 3) → "HiHiHi"
                    stringTimes("Hi", 1) → "Hi"

     */
    public static void main(String[] args) {
        System.out.println(stringTimes("Hi",2));
    }
    public static String stringTimes(String str, int n) {

        String myStr = "";
        for (int i = 0; i < n; i++) {
            myStr += str;
        }
        return myStr;
    }
}
