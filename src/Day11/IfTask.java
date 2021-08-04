package Day11;

import java.util.Scanner;

public class IfTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberFromUser = scanner.nextInt();
        if (numberFromUser > 60 ){
            System.out.println("PASSED");
        }
        if (numberFromUser < 60){
            System.out.println("FAILED");
        }
    }
}
