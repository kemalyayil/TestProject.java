package Day13;

import java.util.Scanner;

public class _10_NestedIfTask {
    public static void main(String[] args) {

        // ask number from user between  0  and 5
        // generate a random number
        // check if the user number and random number are equal
        // if equals print "you win" else "you lose"
        // if number between 0 - 5 run program else print "Invalid"

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a number between 0 - 5 =");
        int usersInput = scanner.nextInt();

        int randomInteger = (int) (Math.random()*5);
        System.out.println(" random number =" + randomInteger);

        if (usersInput >= 0 && usersInput <= 5){  // burada ilk olarak number in 0-5 arasinda olup olmadigini checking
            if (randomInteger == usersInput){ // sonraki adim esit mi degil mi/
                System.out.println( "you win !");
            } else {
                System.out.println("you lose");
            }
        }else {  // 0-5 arasi degilse direk bunu print ediyor
            System.out.println("You entered invalid number");
        }

    }
}
