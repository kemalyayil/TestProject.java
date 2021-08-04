package Day16;

import java.util.Scanner;

public class _04_ContinueTask2 {
    public static void main(String[] args) {
        // get text from the user, print each letter in a new line
        // skip space or semi-column characters


        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter your motto");
        String userInput = scanner.nextLine().trim();
        char letter;                    // asagida onu update edicez.

        for (int i = 0; i < userInput.length(); i++){
            letter = userInput.charAt(i);  // buraya asagidaki if eklemezsek, user in girdigini yazar

            if (letter == ' ' || letter == ';'){
                continue;
            }
            System.out.println(letter);
        }
    }
}
