package Day9.MultiArray;

import java.util.Scanner;

public class _03_GettingBoolean {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println(" Are you a cat person?");
        boolean catPerson = scanner.nextBoolean(); // only accepts true and false

        System.out.println("You are a cat person -> " + catPerson);
    }
}
