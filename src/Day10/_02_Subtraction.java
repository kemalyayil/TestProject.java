package Day10;

public class _02_Subtraction {

    public static void main(String[] args) {

        // subtraction using only values
        System.out.println(5 -3);


        // subtraction using only variables
        int first = 55;
        int second = 33;
        System.out.println(first-second);


        int results = first - second;
        System.out.println(results);


        // subtraction using only variables and values
        System.out.println(results - 5);

        // Negation
        System.out.println(-results); // basina eksi koyarsan , negatife cevrilir

        results = -results; // updated and become -22.
        System.out.println("Result -> " + first + second); // math will not happen here
        // java will convert integers to a String



    }
}
