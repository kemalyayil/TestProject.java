package Warmup.Warmup1;

public class Warmup10_close10 {
    /*
    Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
    Note that Math.abs(n) returns the absolute value of a number.


close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0

     */
    public static void main(String[] args) {
        System.out.println(close10(13, 7));
    }

    public static int close10(int a, int b) {
       int dif1 = Math.abs(a - 10);
       int dif2 = Math.abs(b - 10);

       if (dif1 < dif2) {
           return a;
       }
       if (dif2 < dif1) {
           return b;
       }
       return 0;
    }

}

