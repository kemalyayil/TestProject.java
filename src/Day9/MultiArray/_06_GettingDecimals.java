package Day9.MultiArray;

import java.util.Scanner;

public class _06_GettingDecimals {
    public static void main(String[] args) {

        Scanner decimalScanner = new Scanner(System.in);
        System.out.print( "Type some float :");
        float myFloat = decimalScanner.nextFloat();

        System.out.print( "Type some double :");
        double myDouble = decimalScanner.nextDouble();

        System.out.println("");
        System.out.println("Float  ->  " + myFloat);
        System.out.println("Double ->  " + myDouble);

    }
}
