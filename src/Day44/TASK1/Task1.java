package Day44.TASK1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //Integer output = Integer.parseInt(input);           // input integer olunca sikinti cikarmiyor.
        Integer output = convertToInteger(input);               // line 22 deki metotu cagirdik

        // create application that converts text to integer
        // input should be string from Scanner
        // output should be integer
        // if the input is not integer, print a message and give default value of 0


    }

    public static Integer convertToInteger (String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            System.out.println("This String is not an Integer! Returning the default value 0!");
            return 0;
        }
    }

}
