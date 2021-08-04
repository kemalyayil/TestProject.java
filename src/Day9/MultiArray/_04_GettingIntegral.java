package Day9.MultiArray;

import java.util.Scanner;

public class _04_GettingIntegral {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter some byte : ");
        byte byteInput = scanner.nextByte();

        System.out.print("Enter some short : ");
        short shortInput = scanner.nextShort();

        System.out.print("Enter some int : ");
        int intInput = scanner.nextInt();

        System.out.print("Enter some long : ");
        long longInput = scanner.nextLong();

        System.out.println("");

        System.out.println(" Byte : " + byteInput);
        System.out.println(" Short : " + shortInput);
        System.out.println(" Integer : " + intInput);
        System.out.println(" long : " + longInput);
    }
}
