package Day15;

import java.util.Scanner;

public class _01_Task2 {
    public static void main(String[] args) {

        // get a number from user
        // print the sum of numbers from 0 up to number from user

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one number = ");
        int numberFromUser = scanner.nextInt();

        int sum = 0;
        int count = 0;
        while (count < numberFromUser) {
            count++;
            sum += count;  // shortcut sum = sum + count

            // 7 yazdik. 7 e kadar olan sayilari topladi. 1+2+3+4+5+6+7 = 28
        }
        System.out.println(sum);
    }
}
