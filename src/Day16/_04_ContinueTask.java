package Day16;

import java.util.Scanner;

public class _04_ContinueTask {
    public static void main(String[] args) {
        // get number from the user, print all the numbers from 0 to the number from user
        // skip even numbers using continue

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter your number");
        int user = scanner.nextInt();

        for (int i = 0; i <= user; i++){
            if (i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
