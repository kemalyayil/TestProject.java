package Day16;

import java.util.Scanner;

public class _03_BreakTask2 {
    public static void main(String[] args) {

        // get a string from the user
        // using for-loop print each letter in a new line
        // part2: stop if you encounter space character

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your message");
        String input = scanner.nextLine().trim(); // basta ve sonda space olursa diye
        char letter;

        for (int i = 0; i < input.length(); i++){
            letter = input.charAt(i);       // bu sekilde karakterleri teker teker yazdiracagiz
            if (letter == ' '){
                break;
            }
            System.out.println(letter);
        }

    }
}
