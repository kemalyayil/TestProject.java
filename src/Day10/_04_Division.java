package Day10;

public class _04_Division {
    public static void main(String[] args) {

        // division using only values
        System.out.println( 9 / 3);

        // division using only variables
        int x = 15;
        int y = 4;
        System.out.println( x / y ); // both are int so the result is 3

        int result = x/y;           // both are int so the result is 3
        System.out.println(result);

        double result2 = (double) x /y;      // should convert into double
        System.out.println(result2);    // after converting them, the result is 3.75



    }
}
