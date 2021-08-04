package Day11;

import java.util.Scanner;

public class _02_LogicalOperatorsTask {
    public static void main(String[] args) {

        // get string input from the user
        // check if it contains 'a' and 'b'
        // check if it contains 'a' or 'c' // burdaki or a dikkat "||" kullanmaliyiz
        // check if it does NOT contain 'c'
        // check if it does not contain both 'c' and 'd'

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your motto");
        String inputFromUser = scanner.nextLine();

        boolean containsAandB = inputFromUser.contains("a") && inputFromUser.contains ("b");
        boolean containsAandC = inputFromUser.contains("a") || inputFromUser.contains ("c");
        boolean doesNotContainC = !inputFromUser.contains("c");
        boolean doesNotContainCandD = !(inputFromUser.contains("c") || inputFromUser.contains("d")); // basa koydugumuz
                                                                                                // oposite demek.
        System.out.println(containsAandB);
        System.out.println(containsAandC);
        System.out.println(doesNotContainC);
        System.out.println(doesNotContainCandD);

        //





    }
}
