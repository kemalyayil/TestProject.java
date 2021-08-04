package Day16;

import java.util.Scanner;

public class _03_BreakTask {
    public static void main(String[] args) {

        // get number from user
        // count from 0 until the number
        // if the count is larger than 10, stop
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int numberFromUser = scanner.nextInt();

        while (count < numberFromUser){
            System.out.println(count);
            count++;

            if (count > 10){
                break;
            }
        }

    }
}
