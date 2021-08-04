package Day16;

import java.util.Scanner;

public class _01_DoWhileTask {
    public static void main(String[] args) {

        // ask the user for pin number
        // if the pin number is incorrect keep asking the user for pin number
        // when the pin is correct print out "you are logged in"
        // the correct pin is 3535
        // do this task with do-while

        Scanner scanner = new Scanner(System.in);


        int correctPin = 3535;
        int userPin = 0;
        do {
            System.out.print("Please enter a pin:"); // bu kesinlikle kontrol eder si o si...
            userPin = scanner.nextInt();
        }while (userPin != correctPin);
        System.out.println("You are logged in!");




    }
}
