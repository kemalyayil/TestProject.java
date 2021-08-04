package Day10;

import java.util.Scanner;

public class TaskIncrement {
    public static void main(String[] args) {
        // take a number from user and increment it twice

        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your number?");
        int inputFromUser = scanner.nextInt();

        ++inputFromUser;
        ++inputFromUser;

        System.out.println(inputFromUser);

    }
}
