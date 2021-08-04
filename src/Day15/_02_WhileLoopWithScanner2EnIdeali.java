package Day15;

import java.util.Scanner;

public class _02_WhileLoopWithScanner2EnIdeali {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = "";


        while (true) {  // en ideali bu sekilde.
            System.out.println("Enter input: ");
            input = scanner.nextLine().toLowerCase();
            if (input.equalsIgnoreCase("quit")){
                break;
            }
            System.out.println(input);
        }

    }
}
