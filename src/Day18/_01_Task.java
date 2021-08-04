package Day18;

import java.util.Scanner;

public class _01_Task {
    // get text from the user, print only unique characters
    // blah blah blah = blah should be printed
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word");
        String input = scanner.nextLine();


        String uniqueCharacters ="";

        for (int i = 0; i < input.length(); i++){
            char charAt = input.charAt(i);
            if (!uniqueCharacters.contains(charAt + "")){ //  "" bu sekilde char i string e cevirdik.
            uniqueCharacters += charAt;

            }

        }
        System.out.println(uniqueCharacters);

    }


}
